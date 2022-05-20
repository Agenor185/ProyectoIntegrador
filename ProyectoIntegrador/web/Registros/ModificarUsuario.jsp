<%@page import="java.util.ArrayList"%>
<%@page import="VO.PersonaVO"%>
<%
    ArrayList<PersonaVO> usuario = (ArrayList<PersonaVO>) session.getAttribute("InfoUsuario");

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="modal_closeBttn" onclick="cerrarModalMod()"><img src="Images/close_bttn.png" alt="alt"/></div>
<div class="div_form" style="height: 370px; width: 790px; padding: 20px;">
    <div class="div_banner">
        Información Usuario        
    </div>
    <br>
    <form action="ControladorPrincipal" method="post" id="form_user">

        <%                for (PersonaVO personaVO : usuario) {

        %>
        <table>
            <tr>
                <td>Primer Nombre</td>              
                <td>Segundo Nombre</td>                
            </tr>
            <tr>
                <td><input type="text" name="PRI_NOMBRE" value="<%=personaVO.getPERS_PRINOMBRE()%>" disabled></td>
                <td><input type="text" name="SEG_NOMBRE" value="<%=personaVO.getPERS_SEGNOMBRE()%>"disabled></td>
            </tr>
            <tr>
                <td>Primer Apellido</td>
                <td>Segundo Apellido</td>  
            </tr>
            <tr>
                <td><input type="text" name="PRI_APELLIDO" value="<%=personaVO.getPERS_PRIAPELLIDO()%>" disabled></td>
                <td><input type="text" name="SEG_APELLIDO" value="<%=personaVO.getPERS_SEGAPELLIDO()%>"disabled></td>
            </tr>
            <tr>
                <td>Tipo de Documento</td>              
                <td>Numero de Documento</td>                
            </tr>
            <tr> 
                <td><select id="tido" name="TIPO_DOC" disabled>
                        <%

                            System.out.println("TIPO DOC:" + personaVO.getPERS_TIPODOC());
                            if (personaVO.getPERS_TIPODOC().equals("TARJETA DE IDENTIDAD")) {

                        %>
                        <option value="TARJETA DE IDENTIDAD" selected>TARJETA DE IDENTIDAD</option>
                        <option value="CEDULA DE CIUDADANIA" >CEDULA DE CIUDADANIA</option>
                        <% } else if (personaVO.getPERS_TIPODOC().equals("CEDULA DE CIUDADANIA")) { %>

                        <option value="CEDULA DE CIUDADANIA" selectd>CEDULA DE CIUDADANIA</option>
                        <option value="TARJETA DE IDENTIDAD">TARJETA DE IDENTIDAD</option>

                        <% }%>



                        <option value="REGISTRO CIVIL">REGISTRO CIVIL</option>
                        <option value="TARJETA DE EXTRANGERIA">TARJETA DE EXTRANGERIA</option>

                    </select>
                </td>
                <td><input type="text" name="NUM_DOC" value="<%=personaVO.getPERS_NUMDOC()%>" disabled></td>
            </tr>
            <tr>
                <td>Nombre de Usuario</td>              
                <td>Contraseña</td>                
            </tr>
            <tr>
                <td> <input type="text" name="USERNAME" value="<%=personaVO.getPERS_USERNAME()%>" disabled> </td>
                <td> <input type="password" name="PASSWORD" value="<%=personaVO.getPERS_PASSWORD()%>" disabled> </td>
            </tr>
            <% if( session.getAttribute("tUser").equals("2")) { %>
            <tr>
                <td>Grado</td>
                <td></td>
            </tr>
            <tr>

                <td>
                    <select id="grado" name="GRAD_CODIGO" disabled>
                        <%  if (personaVO.getGRAD_CODIGO() != null && personaVO.getGRAD_CODIGO().equals("1")) {
                        %>
                        <option value="1" selected>Noveno</option>
                        <option value="2">Decimo</option>
                        <option value="3">Once</option>
                        <% } else if (personaVO.getGRAD_CODIGO().equals("2")) {  %>
                        <option value="1" >Noveno</option>
                        <option value="2" selected>Decimo</option>
                        <option value="3">Once</option>

                        <% } else if (personaVO.getGRAD_CODIGO().equals("3")) {  %>
                        <option value="1" >Noveno</option>
                        <option value="2">Decimo</option>
                        <option value="3" selected>Once</option>
                        <% } %>

                    </select>


                </td>
            </tr>
  
            <% } %> 
          <input type="text" name="PERS_ID" value="<%=personaVO.getPERS_ID() %>" hidden>

            <tr>
                <td><button type="button" id="mod_b" onclick="activarForm()" >Modificar</button> <button type="button" id="mod_user" onclick="modificarUsuario()" class="accept_bttn" disabled>Guardar Cambios</button></td>

                <td>
                </td>

            <input type="text" name="modulo" value="ModificarUsuario" hidden>
            <input type="text" name="TIPO_USER" value="<%=session.getAttribute("tUser")%>" hidden>
            

        </table>
        <% }%>
    </form>
</div>   