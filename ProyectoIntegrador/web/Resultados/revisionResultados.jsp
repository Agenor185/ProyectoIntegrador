

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.PreguntaPruebaDAO"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="Controller.ControladorPrincipal"%>
<%@page import="Controller.ControladorPrincipal"%>
<%@page import="VO.PreguntaPruebaVO"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="prueba_preg" > 

    <% 

            PreguntaPruebaDAO ppdao = new PreguntaPruebaDAO();

            ArrayList<PreguntaPruebaVO> respuetas = (ArrayList<PreguntaPruebaVO>) session.getAttribute("revisionEstu");

            String[] respuestas = new String[4];
            String[] posicionRespuestas = new String[4];
            String[] respCod = new String[2];
            
            int cont = 0;
            int Puntaje = 0;
            
            for (PreguntaPruebaVO pregunta : respuetas) {

                int n1, n2, n3, n4 = 0;

                Puntaje = Puntaje + pregunta.getPREP_PUNTAJE();

                posicionRespuestas = pregunta.getPREP_CODIGO().split("_");
                respCod = pregunta.getPRUE_CODIGO().split("_");

                n1 = Integer.parseInt(posicionRespuestas[0]);
                n2 = Integer.parseInt(posicionRespuestas[1]);
                n3 = Integer.parseInt(posicionRespuestas[2]);
                n4 = Integer.parseInt(posicionRespuestas[3]);

                cont++;
               
                if (respCod[0].equals("0")) {
                    respuestas[0] = "<label class='resp_incor' for='r1" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA1() + "</label>";
                } else {
                    respuestas[0] = "<label  for='r1" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA1() + "</label>";
                }
                 

                if (respCod[0].equals("1")) {
                    respuestas[1] = "<label class='resp_incor' for='r2" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA2() + "</label>";
                } else {
                    respuestas[1] = "<label  for='r2" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA2() + "</label>";
                }

                if (respCod[0].equals("2")) {
                    respuestas[2] = "<label class='resp_incor' for='r3" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA3() + "</label>";
                } else {
                    respuestas[2] = "<label  for='r3" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTA3() + "</label>";
                }

                if (respCod[0].equals("3")) {

                    respuestas[3] = "<label class='resp_corr' for='r4" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTACORRECTA() + "</label>";

                } else {
                    respuestas[3] = "<label for='r4" + cont + "'> &nbsp;&nbsp;&nbsp;" + pregunta.getPRE_RESPUESTACORRECTA() + "</label> <label style='color: #47cc4d;' >Correcta</label>";
                }

    %>

    <div class='num_preg'> Pregunta <%=cont%>: </div> 
    <div class='titulo_pregunta' >
        <br><br><%=pregunta.getPREP_PREGUNTA()%></div>
    <br>
    <br>
    <div class='pregunta_rta'>
        <span> A. &nbsp; </span>
        <%=respuestas[n1]%>
        <br><br>
        <span> B. &nbsp; </span>
        <%=respuestas[n2]%> <br><br>
        <span> C. &nbsp; </span>
        <%=respuestas[n3]%> <br><br>
        <%  if(!respCod[1].equals("PR04")){ %>
        <span> D. &nbsp; </span>
        <%=respuestas[n4]%><br><br>
        <% } %>
    </div>
    <br>




    <%    }

     
        %>

<div class="prog_result"> Puntaje: <%=Puntaje %>/100 </div>


</div>