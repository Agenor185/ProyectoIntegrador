
<%@page import="DAO.AlumnoDAO"%>
<%@page import="DAO.PersonaDAO"%>
<% 
    
    if(session.getAttribute("sesion") == null){
response.sendRedirect("InicioSesion.jsp");
} else { 

String PERS_ID = session.getAttribute("sesion").toString();

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
                <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>ASaber - Plataforma Educativa</title>
        
        <link rel="icon" type="image/ico" href="Images/logo.ico"/>
        <link rel="stylesheet" href="Styles/EstilosPrincipal.css"/>
        <link rel="stylesheet" href="Styles/BasicStyles.css"/>
        <script type="text/javascript" charset="UTF-8" src="Js/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/Controlador.js"></script>
        <script type="text/javascript" src="Js/jqueryForms.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/alerts.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
     
        <div class="div_container" >
            <img src="Images/logo.png" style="width: 620px; height: 620px; opacity: .3; margin-left: 300px;" alt="alt"/>
        </div>
        <div class="div_topBar">
            <img src="Images/logoTxt.png" style="width: 172px; height: 40px; margin-top: 8px;" alt="alt"/>
            
            <div class="icon_session">
                <img title="Cerrar Sesion" id="cerrarsesion" onclick="cerrarSesion(this.id)" src="Styles/Icons/close_session.png" />
            
            </div>
            <div class="icon_user" onclick="cargarPagPerfil()">
                
                <%      
                PersonaDAO pdao = new  PersonaDAO();                
                %>
                
                <%=pdao.obtenerNombre(PERS_ID).charAt(0) %>
            </div>
            <div class="name_user">
               
                
                <%=pdao.obtenerNombre(PERS_ID)%>
          
            </div>         

        </div>

        <div class="div_leftBar">
            <br><br>
            <div class="div_menu">
                <ul class="ul_menu">
                    
                    <% 
                                           
                        AlumnoDAO adao = new AlumnoDAO();                        
                           if(adao.verificarAlumno(PERS_ID)){                    
                    %>
                    
                    <li id ="li_home" class="selected" onclick="cargarInicio(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/home.png" alt="alt"/>&nbsp;&nbsp; Inicio</li>
                    <li id="li_mod" onclick="cargarPagModulo(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/module.png" alt="alt"/>&nbsp;&nbsp; Modulos</li>      
                    
                    <% } else { %>
                    
                    
                    <li id ="li_home" class="selected" onclick="cargarInicio(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/home.png" alt="alt"/>&nbsp;&nbsp; Inicio</li>
                    <li id="li_mod" onclick="cargarPagModulo(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/module.png" alt="alt"/>&nbsp;&nbsp; Modulos</li> 
                    <li id="li_res" onclick="verResultados(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/result.png" alt="alt"/>&nbsp;&nbsp;Resultados</li>
                    <li id="li_reg" onclick="verMenuRegistro(this.id)"><img style="width: 25px; height: 25px;" src="Styles/Icons/form.png" alt="alt"/>&nbsp;&nbsp;Registar Usuarios</li>
                    <ul class="ul_regMenu" hidden>
                        <li id="alumno" onclick="cargarForms(this.id)"> Alumno</li>
                        <li id="docente" onclick="cargarForms(this.id)">Docente</li>
                    </ul>
                    
                    <% }%>
                </ul>
            </div>
        </div>
     

    </body>

</html>

<% }%>
