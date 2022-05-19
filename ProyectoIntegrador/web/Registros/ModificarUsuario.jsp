<%-- 
    Document   : ModificarUsuario
    Created on : 18/05/2022, 2:07:34 p. m.
    Author     : NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="modal_closeBttn" onclick="cerrarModalMod()"><img src="Images/close_bttn.png" alt="alt"/></div>
<div class="div_form" style="height: 370px; width: 790px; padding: 20px;">
        <div class="div_banner">
          Información Usuario        
        </div>
        <br>
        <form action="ControladorPrincipal" method="post" id="form_user">
            <table>
                <tr>
                    <td>Primer Nombre</td>              
                    <td>Segundo Nombre</td>                
                </tr>
                <tr>
                    <td><input type="text" name="PRI_NOMBRE" disabled></td>
                    <td><input type="text" name="SEG_NOMBRE" disabled></td>
                </tr>
                <tr>
                    <td>Primer Apellido</td>
                    <td>Segundo Apellido</td>  
                </tr>
                <tr>
                    <td><input type="text" name="PRI_APELLIDO" disabled></td>
                    <td><input type="text" name="SEG_APELLIDO" disabled></td>
                </tr>
                <tr>
                    <td>Tipo de Documento</td>              
                    <td>Numero de Documento</td>                
                </tr>
                <tr>
                    <td><select id="tido" name="TIPO_DOC" disabled>
                            <option value="1" disabled selected>Seleccione...</option>
                            <option value="TARJETA DE IDENTIDAD">TARJETA DE IDENTIDAD</option>
                            <option value="CEDULA DE CIUDADANIA">CEDULA DE CIUDADANIA</option>
                            <option value="REGISTRO CIVIL">REGISTRO CIVIL</option>
                            <option value="TARJETA DE EXTRANGERIA">TARJETA DE EXTRANGERIA</option>

                        </select>
                    </td>
                    <td><input type="text" name="NUM_DOC" disabled></td>
                </tr>


                <tr>
                    <td><button type="button" onclick="activarForm()" >Modificar</button> <button type="button" onclick="nuevaUsuario()" class="accept_bttn" disabled>Guardar Cambios</button></td>
                
                    <td>
                    </td>

                <input type="text" name="modulo" value="nuevoUsuario" hidden>
                <input type="text" name="tipo" value="docente" hidden>

            </table>
        </form>
    </div>   