package Controller;

import DAO.AlumnoDAO;
import DAO.AlumnoPreguntaDAO;
import DAO.DocenteDAO;
import DAO.LoginDao;
import DAO.PersonaDAO;
import DAO.PruebaIntentoDAO;
import VO.AlumnoPreguntaVO;
import VO.AlumnoVO;
import VO.DocenteVO;
import VO.PersonaVO;
import VO.PruebaIntentoVO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ControladorPrincipal", urlPatterns = {"/ControladorPrincipal"})
public class ControladorPrincipal extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPrincipal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        System.out.println("ENTROO AL CONTROLADOR");

        String modulo = "";
        HttpSession sesion = request.getSession(true);

        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            modulo = request.getParameter("modulo");
        } else {
            modulo = request.getParameter("modulo");
        }

        if (modulo.equals("prueba")) {

            String[] respuestas = new String[20];
            String[] preguntas = new String[20];
            String[] puntaje = new String[20];
            for (int i = 0; i < 20; i++) {

                if ((i + 1) < 10) {
                    respuestas[i] = request.getParameter("PP0" + (i + 1));

                    preguntas[i] = "PP0" + (i + 1);

                } else {
                    respuestas[i] = request.getParameter("PP" + (i + 1));
                    preguntas[i] = "PP" + (i + 1);
                }

            }

            for (int i = 0; i < 20; i++) {
                if (respuestas[i].equals("3")) {

                    puntaje[i] = "5";
                } else {
                    puntaje[i] = "0";
                }
            }

            for (int i = 0; i < 20; i++) {
                System.out.println(preguntas[i] + ": " + respuestas[i]);
            }

            PruebaIntentoDAO pidao = new PruebaIntentoDAO();
            String PRIN_CODIGO = "PI_1";
            int PRIN_INTENTO = 1;
            try {

                if (pidao.ultimoRegistro() != null) {

                    PRIN_CODIGO = pidao.ultimoRegistro();
                    String[] PRC_NUM = PRIN_CODIGO.split("_");
                    PRIN_CODIGO = PRC_NUM[0] + "_" + (Integer.parseInt(PRC_NUM[1]) + 1);

                }

                if (pidao.ultimoIntento(sesion.getAttribute("sesion").toString()) != null) {
                    PRIN_INTENTO = Integer.parseInt(pidao.ultimoIntento(sesion.getAttribute("sesion").toString())) + 1;

                }

                if (pidao.nuevoIntento(new PruebaIntentoVO(
                        PRIN_CODIGO,
                        PRIN_INTENTO,
                        request.getParameter("pruebaCode"),
                        sesion.getAttribute("sesion").toString(),
                        ""))) {
                    for (int i = 0; i < 20; i++) {

                        AlumnoPreguntaDAO aldao = new AlumnoPreguntaDAO();
                        aldao.nuevoIntento(new AlumnoPreguntaVO(
                                sesion.getAttribute("sesion").toString(),
                                preguntas[i],
                                request.getParameter("pruebaCode"),
                                respuestas[i],
                                puntaje[i],
                                PRIN_CODIGO));
                    }

                }
                int sumaPuntaje = 0;
                ;
                for (int i = 0; i < 20; i++) {
                    sumaPuntaje = sumaPuntaje + Integer.parseInt(puntaje[i]);

                }
                
                out.println(sumaPuntaje);

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (modulo.equals("cerrarsesion")) {

            sesion.setAttribute("sesion", null);
            response.sendRedirect("InicioSesion.jsp");
        }

        if (modulo.equals("iniciosesion")) {

            System.out.println("INICIO SESION");
            String PERS_USERNAME = request.getParameter("PERS_USERNAME");
            String PERS_PASSWORD = request.getParameter("PERS_PASSWORD");

            PersonaVO pers = new PersonaVO(PERS_USERNAME, PERS_PASSWORD);

            LoginDao log = new LoginDao();

            try {

                if (log.validarLogin(pers)) {

                    PersonaDAO pdao = new PersonaDAO();

                    sesion.setAttribute("sesion", pdao.obtenerIdPersona(pers));

                    out.println(1);

                } else {

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (modulo.equals("nuevoUsuario")) {

            PersonaDAO personaDao = new PersonaDAO();
            String password = "";
            String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "-", "*", "%", "$", "a", "b", "c", "d", "f", "g"};
            int length = 10;
            Random random;
            try {
                random = SecureRandom.getInstanceStrong();
                StringBuilder sb = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    int indexRandom = random.nextInt(symbols.length);
                    sb.append(symbols[indexRandom]);
                }
                password = sb.toString();
                System.out.println(password);
            } catch (NoSuchAlgorithmException e) {
                System.out.println(e.toString());
            }

            String primaryKey = "NP1";

            try {

                if (personaDao.llavesPrimarias(primaryKey)) {
                    int rand = (int) (Math.random() * 999);
                    primaryKey = "NP" + rand;

                }

                char[] us = request.getParameter("PRI_NOMBRE").toCharArray();
                String userName = us[0] + request.getParameter("SEG_NOMBRE") + request.getParameter("PRI_APELLIDO");

                if (personaDao.NuevaPersona(new PersonaVO(primaryKey,
                        request.getParameter("NUM_DOC"),
                        request.getParameter("TIPO_DOC"),
                        request.getParameter("PRI_NOMBRE").toUpperCase(),
                        request.getParameter("SEG_NOMBRE").toUpperCase(),
                        request.getParameter("PRI_APELLIDO").toUpperCase(),
                        request.getParameter("SEG_APELLIDO").toUpperCase(),
                        userName.toLowerCase().replace(" ", ""),
                        password))) {

                    if (request.getParameter("tipo").equals("estudiante")) {

                        AlumnoDAO alumno = new AlumnoDAO();

                        alumno.nuevoAlumno(new AlumnoVO(primaryKey, request.getParameter("GRADO")));
                    } else if (request.getParameter("tipo").equals("docente")) {
                        DocenteDAO docente = new DocenteDAO();

                        docente.nuevoDocente(new DocenteVO(primaryKey));

                    }

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
