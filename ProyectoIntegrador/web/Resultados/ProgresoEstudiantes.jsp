

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="div_progreso">
    <div class="banner_prog">
        Progreso Estudiante
    </div>
    <br>
    <br>

    <div class="info_estu">
        <div class="prog_nombre"><b>Nombre Estudiante:</b> FERNANDO ALEXANDER MAIGUAL DELGADO </div>
        <div class="prog_grado"><b>Grado:</b> DECIMO  </div>        
    </div>
    <br>
    <br>
    <div class="prog_estu" >
        <div class="nom_prueba"><b>Prueba:</b> <select id="id">
                <option value="first">Matematicas</option>
                <option value="second">Lectura Critica</option>
                <option value="third">Ingles</option>
                <option value="third">Ciencias Sociales y Ciudadania</option>
                <option value="third">Ciencias Naturales</option>
            </select>
        </div>
        
        <div class="inten_prueba" onclick="abrirModalProg()">
            <div class="int_txt"> Intento 1 </div>
            <div class="int_nota">50/100</div> 
            <div class="int_fecha">     Fecha 10/05/2022</div>
        </div>
             <div class="inten_prueba">
             <div class="int_txt"> Intento 1 </div>
            <div class="int_nota">50/100</div> 
            <div class="int_fecha">     Fecha 10/05/2022</div>
        </div>
    
             <div class="inten_prueba">
          <div class="int_txt"> Intento 1 </div>
            <div class="int_nota">50/100</div> 
            <div class="int_fecha">     Fecha 10/05/2022</div>
        </div>  
    </div>
</div>

<div class="modal_fondo">
    <div class="div_modal div_modal_prog"> 
          <div class="modal_closeBttn" onclick="cerrarModalMod()"><img src="Images/close_bttn.png" alt="alt"/></div>
        <div class="prog_result"> Puntaje: 50/100 </div>
        <div class="prog_prueb"> 
            <div class="prog_preg">Pregunta 1</div>
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
                
            </div>
        
        
        </div>
    
    </div>
    
</div>