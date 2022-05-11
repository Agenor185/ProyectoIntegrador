<%@page import="java.lang.String"%>
<%@page import="java.util.Collections"%>
<%@page import="VO.PreguntaPruebaVO"%>
<%@page import="DAO.PreguntaPruebaDAO"%>
<div class="div_prueba">
    <div class="prueba_titulo">

    </div>

    <div class="cont_preguntas">

        <form action="ControladorPrincipal" id="prueba">
            <div class="prueba_preg" > 

                <%  PreguntaPruebaDAO ppdao = new PreguntaPruebaDAO();
                    String[] respuestas = new String[4];

                    String PRUE_CODIGO = "";
                    int cont = 0;

                    for (PreguntaPruebaVO pregunta : ppdao.obtenerPreguntas()) {

                        PRUE_CODIGO = pregunta.getPRUE_CODIGO();

                        int n1, n2, n3, n4 = 0;

                        n1 = (int) (Math.random() * 4);
                        n2 = (int) (Math.random() * 4);
                        n3 = (int) (Math.random() * 4);
                        n4 = (int) (Math.random() * 4);

                        respuestas[0] = pregunta.getPRE_RESPUESTA1();
                        respuestas[1] = pregunta.getPRE_RESPUESTA2();
                        respuestas[2] = pregunta.getPRE_RESPUESTA3();
                        respuestas[3] = pregunta.getPRE_RESPUESTACORRECTA();

                        while (n1 == n2 || n1 == n3 || n1 == n4
                                || n2 == n3 || n2 == n4
                                || n3 == n2 || n3 == n4) {

                            n1 = (int) (Math.random() * 4);
                            n2 = (int) (Math.random() * 4);
                            n3 = (int) (Math.random() * 4);
                            n4 = (int) (Math.random() * 4);

                        }
                        cont++;
                        
                %>

                <div class="num_preg">
                    Pregunta <%=cont%>: 

                </div>
                <div class="titulo_pregunta">
                    <br><br><%=pregunta.getPREP_PREGUNTA()%></div>

                <br>
                <br>
                <div  class="pregunta_rta">  

                    <span> A. &nbsp; </span>  <input type="radio"  id="r1<%=cont%>" value="<%=n1%>" name="<%=pregunta.getPREP_CODIGO()%>" required />
                    <label for="r1<%=cont%>">&nbsp;&nbsp;&nbsp;<%=respuestas[n1]%> </label>               
                    <br><br>
                    <span> B. &nbsp; </span>  <input type="radio" id="r2<%=cont%>" value="<%=n2%>" name="<%=pregunta.getPREP_CODIGO()%>"/>
                    <label for="r2<%=cont%>">&nbsp;&nbsp;&nbsp;<%=respuestas[n2]%> </label><br><br>
                    <span> C. &nbsp; </span>  <input type="radio" id="r3<%=cont%>" value="<%=n3%>" name="<%=pregunta.getPREP_CODIGO()%>"/>
                    <label for="r3<%=cont%>">&nbsp;&nbsp;&nbsp;<%=respuestas[n3]%> </label><br><br>
                    <span> D. &nbsp; </span>  <input type="radio" id="r4<%=cont%>"  value="<%=n4%>" name="<%=pregunta.getPREP_CODIGO()%>"/> 
                    <label for="r4<%=cont%>">&nbsp;&nbsp;&nbsp;<%=respuestas[n4]%> </label> <br><br>

                </div>

                <br>

                <%

                    }
                %>

                <br>
                <button type="button" id="send_prue" onclick="obtenerPrueaba()">Finalizar Prueba</button>
                <button type="button" onclick="salirPrueba()" class="wWarning_bttn">Salir</button>
            </div>
            <input type="text" name="modulo" value="prueba" hidden>
            <input type="text" name="pruebaCode" value="<%=PRUE_CODIGO%>" hidden>
        </form>


    </div>

</div>

<div class="modal_fondo">
    <div class="div_modal">
        <div class="mensaje_titulo" >
            <br>
             
            <br>
            <br>
          
        </div>
        
        <div class="resultado_prue">
            <img src="Images/prueba_good.png" style="width: 360px; height: 360px;" alt="alt"/>
            <br>
            <button type="button" class="wBasic_bttn" onclick="revisarPrueba()">Revision</button>
              <button type="button" onclick="salirPrueba()" class="wWarning_bttn">Salir</button>
        </div>
    </div>
</div>

