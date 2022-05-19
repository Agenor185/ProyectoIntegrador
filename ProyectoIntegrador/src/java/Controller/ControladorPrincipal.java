package Controller;

import DAO.AlumnoDAO;
import DAO.AlumnoPreguntaDAO;
import DAO.DocenteDAO;
import DAO.LoginDao;
import DAO.PersonaDAO;
import DAO.PreguntaPruebaDAO;
import DAO.PruebaIntentoDAO;
import VO.AlumnoPreguntaVO;
import VO.AlumnoVO;
import VO.DocenteVO;
import VO.PersonaVO;
import VO.PreguntaPruebaVO;
import VO.PruebaIntentoVO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
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
        request.setCharacterEncoding("UTF-8"); 
        
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
         request.setCharacterEncoding("UTF-8"); 
        PrintWriter out = response.getWriter();
        System.out.println("ENTROO AL CONTROLADOR");

        String modulo = "";
        HttpSession sesion = request.getSession(true);

        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            modulo = request.getParameter("modulo");
        } else {
            modulo = request.getParameter("modulo");
        }
        
          if (modulo.equals("buscarInfoUsuarios")) {

            String PERS_ID = request.getParameter("PERS_ID");
            String GRADO_CODIGO = request.getParameter("GRADO_CODIGO");
                PersonaDAO pedao = new PersonaDAO();

            if(request.getParameter("TIPO_USER").equals("2")){

        
            try {

                ArrayList<PersonaVO> persona = pedao.obetenerInfoEstu(PERS_ID, GRADO_CODIGO);

                for (PersonaVO personaVO : persona) {

                    out.println(" <tr><td data-label='Nombre'>" + personaVO.getPERS_PRINOMBRE() + " "
                            + personaVO.getPERS_SEGNOMBRE() + " "
                            + personaVO.getPERS_PRIAPELLIDO() + " "
                            + personaVO.getPERS_SEGAPELLIDO() + "</td> "
                            + "   <td data-label='Documento_Identidad'>" + personaVO.getPERS_NUMDOC() + "</td>"
                        
                            + " <td data-label='Ver Resultados'> <img id='" + personaVO.getPERS_ID() + "' onclick='abrirModalUsuario()' src='Styles/Icons/see.png'/></td> </tr>");
                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            } else {
                
                  try {

                ArrayList<PersonaVO> persona = pedao.obetenerDocentesPorId(PERS_ID);

                for (PersonaVO personaVO : persona) {

                    out.println(" <tr><td data-label='Nombre'>" + personaVO.getPERS_PRINOMBRE() + " "
                            + personaVO.getPERS_SEGNOMBRE() + " "
                            + personaVO.getPERS_PRIAPELLIDO() + " "
                            + personaVO.getPERS_SEGAPELLIDO() + "</td> "
                            + "   <td data-label='Documento_Identidad'>" + personaVO.getPERS_NUMDOC() + "</td>"
                      
                            + " <td data-label='Ver Resultados'> <img id='" + personaVO.getPERS_ID() + "' onclick='abrirModalUsuario()' src='Styles/Icons/see.png'/></td> </tr>");
                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            }

        }
        
        
        
         if (modulo.equals("cargarUsuarios")) {
             
               PersonaDAO pedao = new PersonaDAO();
               System.out.println("TIPO USUARIOS"+request.getParameter("TIPO_USER"));
             
             if(request.getParameter("TIPO_USER").equals("2")){

          

            try {

                ArrayList<PersonaVO> estudiantes = pedao.obetenerEstudiantes(request.getParameter("GRAD_CODIGO"));
                 out.println(" <option selected disabled> Estudiante </option>");
            
                for (PersonaVO estudiante : estudiantes) {

                    out.println(" <option value='" + estudiante.getPERS_ID() + "'>"
                            + estudiante.getPERS_PRINOMBRE() + " "
                            + estudiante.getPERS_SEGNOMBRE() + " "
                            + estudiante.getPERS_PRIAPELLIDO() + " "
                            + estudiante.getPERS_SEGAPELLIDO() + " </option>");

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             }else {
                 
                  try {
 out.println(" <option selected disabled> Docente </option>");
                ArrayList<PersonaVO> docentes = pedao.obetenerDocentes();

            
                for (PersonaVO docente : docentes) {

                    out.println(" <option value='" + docente.getPERS_ID() + "' >"
                            + docente.getPERS_PRINOMBRE() + " "
                            + docente.getPERS_SEGNOMBRE() + " "
                            + docente.getPERS_PRIAPELLIDO() + " "
                            + docente.getPERS_SEGAPELLIDO() + " </option>");

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
             
             
             
             }

        }
        
        
        
        if(modulo.equals("obtenerPreguntas")){
             sesion.setAttribute("preguntas",null);
             PreguntaPruebaDAO ppdao = new PreguntaPruebaDAO();
                 
             try {
                 
                 ArrayList<PreguntaPruebaVO> preguntas = ppdao.obtenerPreguntas(request.getParameter("PRUE_CODIGO"));
                 sesion.setAttribute("preguntas", preguntas);
                 
             } catch (SQLException ex) {
                 Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
             }
                  
        
            
        }

        if (modulo.endsWith("obtenerRespuestasEstu")) {
                sesion.setAttribute("revisionEstu",null);
                 
                PreguntaPruebaDAO ppdao = new PreguntaPruebaDAO();

             try {
                 ArrayList<PreguntaPruebaVO> respuetas = ppdao.obtenerPreguntasEstudiante(
                         request.getParameter("PREP_CODIGO"),
                         request.getParameter("PERS_ID"),
                         request.getParameter("PRIN_CODIGO"));
                 
                 sesion.setAttribute("revisionEstu",respuetas);
                 
                 
           
             } catch (SQLException ex) {
                 Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
             }

        }

        if (modulo.equals("cargarIntentos")) {

            System.out.println("CARGAR INTENTOS");

            PruebaIntentoDAO pidao = new PruebaIntentoDAO();

            try {
                ArrayList<PruebaIntentoVO> intentos = pidao.obtenerIntentos(
                        request.getParameter("PERS_ID"),
                        request.getParameter("PRUE_CODIGO"));

                for (PruebaIntentoVO intento : intentos) {

                    out.println("  <div class='inten_prueba' onclick=abrirModalProg('" + intento.getPERS_ID() + "','" + intento.getPRUE_CODIGO() + "','" + intento.getPRIN_CODIGO() + "') >"
                            + "<div class='int_txt'> Intento: " + intento.getPRIN_INTENTO() + " </div>"
                            + " <div class='int_fecha'> Fecha: " + intento.getPRIN_FECHA() + "</div>"
                            + "</div>");

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (modulo.equals("infoEstudiante")) {
            PersonaDAO pedao = new PersonaDAO();
            String PERS_ID = request.getParameter("PERS_ID");
            String GRADO_CODIGO = request.getParameter("GRADO_CODIGO");

            ArrayList<PersonaVO> persona;
            try {
                persona = pedao.obetenerInfoEstu(PERS_ID, GRADO_CODIGO);

                sesion.setAttribute("infoEstu", persona);

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("Informacion encontrada");
        }

        if (modulo.equals("buscarEstudiante")) {

            String PERS_ID = request.getParameter("PERS_ID");
            String GRADO_CODIGO = request.getParameter("GRADO_CODIGO");

            PersonaDAO pedao = new PersonaDAO();

            try {

                ArrayList<PersonaVO> persona = pedao.obetenerInfoEstu(PERS_ID, GRADO_CODIGO);

                for (PersonaVO personaVO : persona) {

                    out.println(" <tr><td data-label='Nombre'>" + personaVO.getPERS_PRINOMBRE() + " "
                            + personaVO.getPERS_SEGNOMBRE() + " "
                            + personaVO.getPERS_PRIAPELLIDO() + " "
                            + personaVO.getPERS_SEGAPELLIDO() + "</td> "
                            + "   <td data-label='Documento_Identidad'>" + personaVO.getPERS_NUMDOC() + "</td>"
                            + "  <td data-label='Grado'>" + personaVO.getPERS_USERNAME() + "</td> "
                            + " <td data-label='Ver Resultados'> <img id='" + personaVO.getPERS_ID() + "' onclick='cargarResultados(this.id)' src='Styles/Icons/see.png'/></td> </tr>");
                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (modulo.equals("cargarEstudiantes")) {

            PersonaDAO pedao = new PersonaDAO();

            try {

                ArrayList<PersonaVO> estudiantes = pedao.obetenerEstudiantes(request.getParameter("GRAD_CODIGO"));

                out.println(" <option selected disabled> Estudiante </option>");
                for (PersonaVO estudiante : estudiantes) {

                    out.println(" <option value='" + estudiante.getPERS_ID() + "'>"
                            + estudiante.getPERS_PRINOMBRE() + " "
                            + estudiante.getPERS_SEGNOMBRE() + " "
                            + estudiante.getPERS_PRIAPELLIDO() + " "
                            + estudiante.getPERS_SEGAPELLIDO() + "</option>");

                }

            } catch (SQLException ex) {
                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

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

                if (pidao.ultimoIntento(sesion.getAttribute("sesion").toString(),request.getParameter("pruebaCode")) != null) {
                    PRIN_INTENTO = (Integer.parseInt(pidao.ultimoIntento(sesion.getAttribute("sesion").toString(),request.getParameter("pruebaCode") )) + 1);
                    System.out.println("NUMERO DE INTENTO: "+ PRIN_INTENTO);
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
                                PRIN_CODIGO,
                                request.getParameter("nvalor_" + preguntas[i])));
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
                System.out.println("NOMBRE"+us[0]);
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
                
                out.println("<div>Nombre de Usuario: "+userName.toLowerCase().replace(" ", "")
                        +"<br></div>Contraseña:  "+password+"<div></div>");

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
