

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://kit.fontawesome.com/712575d4a5.js"
                crossorigin="anonymus"></script>
        <link rel="stylesheet" href="Styles/buscador.css">
        <script src="https://kit.fontawesome.com/b6298344a2.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Busquedad</title>
    </head>
    <body>
        
        <div class="buscar">
            <input type="text" placeholder="Buscar" required>
            <div class="btn">
                <i class="fas fa-search icon"></i>
            </div>
        </div>
        <input type="text" placeholder="Nombre" class="name">
        <input type="text" placeholder="Documento" class="document">
        <input type="text" placeholder="Curso" class="curse">
        <div>
            
            <table class="table">
                <thead>
                <th>Nombre</th>
                <th>Documento Identidad</th>
                <th>Grado</th>
                <th>Materia</th>
                <th>Ver Resultados</th>
                </thead>
                
                <tbody>
                    <tr>
                        <td data-label="Nombre">Karla</td> 
                        <td data-label="Documento_Identidad">1072642906</td>
                        <td data-label="Grado">Once</td> 
                        <td data-label="Materia">Matematicas</td> 
                        <td data-label="Ver Resultados"><button><i class="fa-light fa-book-open-reader"></i></button></td> 
                    </tr>
                </tbody>
                
                
            </table>
            
            
        </div>
    </body>
</html>
