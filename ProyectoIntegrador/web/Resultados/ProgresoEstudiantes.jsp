

<%@page import="VO.AlumnoPreguntaVO"%>
<%@page import="DAO.AlumnoPreguntaDAO"%>
<%@page import="VO.PreguntaPruebaVO"%>
<%@page import="DAO.PreguntaPruebaDAO"%>
<%@page import="VO.PruebaVO"%>
<%@page import="DAO.PruebaDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="VO.PersonaVO"%>
<%

    ArrayList<PersonaVO> estudiante = (ArrayList<PersonaVO>) session.getAttribute("infoEstu");
    String PERS_ID ="";
    request.setCharacterEncoding("UTF-8");
%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<div class="div_progreso">
    <div class="banner_prog">
        Progreso Estudiante
    </div>
    <br>
    <br>

    <div class="info_estu">
        <% for (PersonaVO personaVO : estudiante) {
        PERS_ID = personaVO.getPERS_ID();
        %>
            

        <div class="prog_nombre"><b>Nombre Estudiante:</b>
            <%=personaVO.getPERS_PRINOMBRE() + " " + personaVO.getPERS_SEGNOMBRE()
                    + " " + personaVO.getPERS_PRIAPELLIDO() + " " + personaVO.getPERS_SEGAPELLIDO()%> 

        </div>
        <div class="prog_grado"><b>Grado:</b> <%=personaVO.getPERS_USERNAME()%>  </div>    
        <% } %>
    </div>
    <br>
    <br>
    <div class="prog_estu" >
       
        <select id="pruebas" style="margin-left: 15px; width: 400px;" onchange="cargarIntentos('<%=PERS_ID%>',this.value)">
                <option selected disabled>Pruebas</option>
                <%
                    PruebaDAO prdao = new PruebaDAO();

                    ArrayList<PruebaVO> pruebas = prdao.obetenerPruebas();

                    for (PruebaVO prueba : pruebas) {

                %>  

                <option value="<%=prueba.getPRUE_CODIGO()%>"><%=prueba.getPRUE_NOMBRE()%></option> 
                <%

                    }

                %>

            </select>
        </div>
                <div class="cont_Intenttos">
      
            
   
                </div>
   
    </div>
</div>

<div class="modal_fondo">
    <div class="div_modal div_modal_prog"> 
        <div class="modal_closeBttn" onclick="cerrarModalMod()"><img src="Images/close_bttn.png" alt="alt"/></div>
        <div class="prog_result"> Puntaje: 50/100 </div>
        <div class="prog_prueb"> 
            
            
            <div class="cont_preguntas">

        <form action="ControladorPrincipal" id="prueba">
            <div class="prueba_preg" > 

             
               
            </div>
            
        </form>


    </div>

            
            
            
            
            
            
            
            
            
            
          <!--  <div class="prog_preg">Pregunta 1</div>
            <br>

            <div class="titulo_pregunta prog_tpreg"> 
                En un municipio de Colombia, el alcalde desea restringir el tránsito de menores
                de edad por las vías públicas después de las 12 de la noche, pues afirma que las
                condiciones de seguridad en general no son las más adecuadas para que los menores 
                estén a esa hora en la calle y que, además, es una forma de responsabilizar más a 
                los padres de familia de la conducta de sus hijos, para ello dice que quiere convocar 
                al pueblo para que apoye o rechace su decisión por medio de un plebiscito. 
                <br>
                <br>
                La propuesta del alcalde NO es viable porque
            </div>
            <BR>
            <br>
            <div class="pregunta_rta">

                <span> A. &nbsp;</span>
                <br><br>
                <span> B. &nbsp;</span>
                <br><bR>
                <span> C. &nbsp;</span>
                <br><Br>
                <span> D. &nbsp;</span>

            </div>-->


        </div>

    </div>

</div>