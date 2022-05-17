

    <div class="div_formUser">     
    <div class="div_form">
        <div class="div_banner">
            Formulario de Registro Estudiante     

        </div>
        <br>
        <form action="ControladorPrincipal" method="post" id="form_persona">
            <table>
                <tr>
                    <td>Primer Nombre</td>              
                    <td>Segundo Nombre</td>                
                </tr>
                <tr>
                    <td><input type="text" name="PRI_NOMBRE"></td>
                    <td><input type="text" name="SEG_NOMBRE"></td>
                </tr>
                <tr>
                    <td>Primer Apellido</td>
                    <td>Segundo Apellido</td>  
                </tr>
                <tr>
                    <td><input type="text" name="PRI_APELLIDO"></td>
                    <td><input type="text" name="SEG_APELLIDO"></td>
                </tr>
                <tr>
                    <td>Tipo de Documento</td>              
                    <td>Numero de Documento</td>                
                </tr>
                <tr>
                    <td><select id="tido" name="TIPO_DOC">
                            <option value="1" disabled selected>Seleccione...</option>
                            <option value="1">TARJETA DE IDENTIDAD</option>
                            <option value="2">CEDULA DE CIUDADANIA</option>
                            <option value="3">REGISTRO CIVIL</option>
                            <option value="4">TARJETA DE EXTRANGERIA</option>                      
                        </select>
                    </td>
                    <td><input type="text" name="NUM_DOC"></td>
                </tr>
                <tr>
                    <td>Grado</td>                    
                </tr>
                <tr>
                    <td><select id="grado" name="GRADO">
                            <option value="0" disabled selected>Seleccione...</option>
                            <option value="1">Noveno</option>
                            <option value="2">Decimo</option>
                            <option value="3">Once</option>
                        </select>
                    </td>

                </tr>
                <tr>
                    <td><button type="button" onclick="nuevaUsuario()" class="accept_bttn">Enviar</button> </td>
                    <td>
                    </td>

            </table>
            <input type="text" name="modulo" value="nuevoUsuario" hidden>
            <input type="text" name="tipo" value="estudiante" hidden>
        </form>
    </div>

</div>



<!-- FORMLUARIO DOCENTE ------------------------------------------- -->


<div class="div_formUser2">
    <div class="div_form">
        <div class="div_banner">
            Formulario de Registro Docente          
        </div>
        <br>
        <form action="ControladorPrincipal" method="post" id="form_persona">
            <table>
                <tr>
                    <td>Primer Nombre</td>              
                    <td>Segundo Nombre</td>                
                </tr>
                <tr>
                    <td><input type="text" name="PRI_NOMBRE"></td>
                    <td><input type="text" name="SEG_NOMBRE"></td>
                </tr>
                <tr>
                    <td>Primer Apellido</td>
                    <td>Segundo Apellido</td>  
                </tr>
                <tr>
                    <td><input type="text" name="PRI_APELLIDO"></td>
                    <td><input type="text" name="SEG_APELLIDO"></td>
                </tr>
                <tr>
                    <td>Tipo de Documento</td>              
                    <td>Numero de Documento</td>                
                </tr>
                <tr>
                    <td><select id="tido" name="TIPO_DOC">
                            <option value="1" disabled selected>Seleccione...</option>
                            <option value="TARJETA DE IDENTIDAD">TARJETA DE IDENTIDAD</option>
                            <option value="CEDULA DE CIUDADANIA">CEDULA DE CIUDADANIA</option>
                            <option value="REGISTRO CIVIL">REGISTRO CIVIL</option>
                            <option value="TARJETA DE EXTRANGERIA">TARJETA DE EXTRANGERIA</option>

                        </select>
                    </td>
                    <td><input type="text" name="NUM_DOC"></td>
                </tr>


                <tr>
                    <td><button type="button" onclick="nuevaUsuario()" class="accept_bttn">Enviar</button> </td>
                    <td>
                    </td>

                <input type="text" name="modulo" value="nuevoUsuario" hidden>
                <input type="text" name="tipo" value="docente" hidden>

            </table>
        </form>
    </div>   

</div> 


  <div class="modal_fondo">
    <div class="div_modal">

    </div>
</div>








