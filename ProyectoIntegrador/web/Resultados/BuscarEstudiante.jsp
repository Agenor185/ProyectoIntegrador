<% request.setCharacterEncoding("UTF-8"); %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        
        <div class="div_buscarEstu">
            <div class="div_banner">Buscar Estudiantes</div>
            <div class="div_busqueda">
 
          <!--  <div class="btn">
                <i class="fas fa-search icon"></i>
            </div> -->
          <select id="grados" onchange="obtenerEstudiantes(this.value)">
            
            <option disabled selected>Grado</option>
            <option value="1">Noveno</option>
            <option value="2">Decimo</option>
            <option value="3">Once</option>
        </select>&nbsp;&nbsp;
        <select id="estudiantes" name="nomEstu" style="width: 380px;">
       
          </select>    
    
     
        <button type="button" onclick="obtenerInfoEstu($('#estudiantes').val(),$('#grados').val())" style="float: none;" >Buscar &nbsp;<img style="width: 20px; height: 20px;" src="Styles/Icons/search.png" alt="alt"/></button>

             </div>
        
            <div class="div_rBusqueda">
            
            <table class="table">
                <thead>
                <th>Nombre</th>
                <th>Documento Identidad</th>
                <th>Grado</th>          
                <th>Ver Resultados</th>
                </thead>
                
                <tbody id="rows_est">
                   
                </tbody>
                
                
            </table>
            
            </div>
        </div>

