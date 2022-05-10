
<%@page import="DAO.AlumnoDAO"%>
<%@page import="DAO.PersonaDAO"%>
<% 
    
    if(session.getAttribute("sesion") == null){
response.sendRedirect("InicioSesion.jsp");
} else { 

String PERS_ID = session.getAttribute("sesion").toString();

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
        <link rel="stylesheet" href="Styles/EstilosPrincipal.css"/>
        <link rel="stylesheet" href="Styles/BasicStyles.css"/>
        <script type="text/javascript" src="Js/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" src="Js/Controlador.js"></script>
        <script type="text/javascript" src="Js/jqueryForms.js"></script>
        <script type="text/javascript" src="Js/alerts.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="div_container">

        </div>
        <div class="div_topBar">
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
                    
                    <li>Inicio</li>
                    <li id="li_mod" onclick="cargarPagModulo()">Modulos</li>      
                    
                    <% } else { %>
                    
                    
                    <li>Inicio</li>
                    <li id="li_mod" onclick="cargarPagModulo()">Modulos</li> 
                    <li id="li_reg" onclick="verMenuRegistro(this.id)">Registar Usuarios</li>
                    <ul class="ul_regMenu" hidden>
                        <li id="alumno" onclick="cargarPagina(this.id)"> Alumno</li>
                        <li id="docente" onclick="cargarPagina(this.id)">Docente</li>
                    </ul>
                    
                    <% }%>
                </ul>
            </div>
        </div>


    </body>

</html>

<% }%>
