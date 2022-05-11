

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        
        <div class="div_buscarEstu">
            <div class="div_banner">Buscar Estudiantes</div>
            <div class="div_busqueda">
 
          <!--  <div class="btn">
                <i class="fas fa-search icon"></i>
            </div> -->
   
        <input type="text" placeholder="Nombre" class="name">&nbsp;&nbsp;
        <input type="text" placeholder="Documento" class="document">&nbsp;&nbsp;
        <select id="id">
            <option disabled selected>Grado</option>
            <option value="9">Noveno</option>
            <option value="10">Decimo</option>
            <option value="11">Once</option>
        </select>&nbsp;&nbsp;
        <button type="button" style="float: none;" >Buscar</button>

             </div>
        
            <div class="div_rBusqueda">
            
            <table class="table">
                <thead>
                <th>Nombre</th>
                <th>Documento Identidad</th>
                <th>Grado</th>          
                <th>Ver Resultados</th>
                </thead>
                
                <tbody>
                    <tr>
                        <td data-label="Nombre">JULIAN DAVID FLOREZ RACHEZ</td> 
                        <td data-label="Documento_Identidad">1072642906</td>
                        <td data-label="Grado">Once</td> 
               
                        <td data-label="Ver Resultados"> <img onclick="cargarResultados()" src="Styles/Icons/see.png"/></td> 
                    </tr>
                     <tr>
                        <td data-label="Nombre">Karla</td> 
                        <td data-label="Documento_Identidad">1072642906</td>
                        <td data-label="Grado">Once</td> 
                      
                        <td data-label="Ver Resultados"> <img src="Styles/Icons/see.png"/></td> 
                    </tr>
                       <tr>
                        <td data-label="Nombre">Karla</td> 
                        <td data-label="Documento_Identidad">1072642906</td>
                        <td data-label="Grado">Once</td> 
                        
                        <td data-label="Ver Resultados"> <img src="Styles/Icons/see.png"/></td> 
                    </tr>
                       <tr>
                        <td data-label="Nombre">Karla</td> 
                        <td data-label="Documento_Identidad">1072642906</td>
                        <td data-label="Grado">Once</td> 
                      
                        <td data-label="Ver Resultados"><img src="Styles/Icons/see.png"/></td> 
                    </tr>
                </tbody>
                
                
            </table>
            
            </div>
        </div>

