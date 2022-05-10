<div class="div_modulos">

    <div class="div_modMat mod_mate" id="math" onclick="moduloInfo(this.id)">
        Matematicas
        
        <img src="Styles/Icons/icon_math.png" />
    </div>


    <div class="div_modMat mod_esp" id="esp" onclick="moduloInfo(this.id)" >
        Lectura Critica
       
        <img src="Styles/Icons/icon_esp.png" />
    </div>

    <div class="div_modMat mod_ing"  id="ing" onclick="moduloInfo(this.id)">
        Ingles
       
        <img src="Styles/Icons/icon_ing.png"  />
    </div>


    <div class="div_modMat mod_syc"  id="syc" onclick="moduloInfo(this.id)">
        Ciencias Sociales y Ciudadanas
      
        <img src="Styles/Icons/icon_ciu.png" >
    </div>


    <div class="div_modMat mod_cna" id="cna" onclick="moduloInfo(this.id)">
        Ciencias Naturales
    
        <img src="Styles/Icons/icon_nat.png" >
    </div>


</div>
<div class="modal_fondo">
    <div class="div_modal">
        <div class="modal_closeBttn" onclick="cerrarModalMod()"><img src="Images/close_bttn.png" alt="alt"/></div>
        <div class="modal_titulo">Prueba de Matematicas</div>
        <div class="modal_img">
            <img src="Images/math_img.png" alt="alt"/>
            
          <!--  <div class="img_link">Illustration by <a href="https://icons8.com/illustrations/author/RogqKjMRAQ79">Polina Orlova
                </a> from <a href="https://icons8.com/illustrations">icons8</a> </div>
 -->
        </div>
        <div class="modal_mmath" hidden>

            <div class="modalM_info">

                La prueba de Matem�ticas del examen de Estado Saber 11.� eval�a
                las competencias de los estudiantes para enfrentar situaciones que
                pueden resolverse con el uso de algunas herramientas matem�ticas. 
                Tanto las competencias definidas para la prueba como los conocimientos 
                matem�ticos que el estudiante requiere para resolver las situaciones
                planteadas se contemplan en las definiciones de los Est�ndares B�sicos
                de Competencias en Matem�ticas del Ministerio de Educaci�n Nacional (MEN, 2006).
                De acuerdo con lo anterior, se integran competencias y contenidos en 
                distintas situaciones o contextos, en los cuales las herramientas matem�ticas
                cobran sentido y son un importante recurso para la comprensi�n de situaciones, 
                la transformaci�n de informaci�n, la justificaci�n de afirmaciones y la soluci�n 
                de problemas


            </div>

            <br>


        </div>

        <div class="modal_ingl" hidden>
            La prueba de Ingl�s busca que el estudiante
            demuestre sus habilidades comunicativas a nivel de
            lectura y uso del lenguaje en esta lengua. La prueba
            est� alineada con el Marco Com�n Europeo de
            Referencia para las lenguas (MCER), que permite
            clasificar a los evaluados en 5 niveles de desempe�o:
            A?, A1, A2, B1 y B+. Esto, teniendo en cuenta que
            para Colombia existe poblaci�n que se encuentra
            por debajo del primer nivel del MCER (A1), lo
            cual ha llevado a incluir en la prueba de Ingl�s
            de Saber 11. un nivel inferior a A1, denominado
            A?, que corresponde a aquellos desempe�os
            m�nimos que involucran el manejo de vocabulario
            y estructuras b�sicas. De igual forma, se incluye un
            nivel superior al B1 para aquellos estudiantes que
            superan lo evaluado en este nivel, denominado B+. 

        </div>

        <div class="modal_lect" hidden>

            La prueba de Lectura Cr�tica eval�a las competencias
            necesarias para comprender, interpretar y evaluar
            textos que pueden encontrarse en la vida cotidiana y
            en �mbitos acad�micos no especializados. Se espera
            que los estudiantes que culminan la educaci�n
            media cuenten con las capacidades lectoras para
            tomar posturas cr�ticas frente a esta clase de textos.
            <br>
            <b> 1. Tipos de textos utilizados</b>
            La prueba de Lectura Cr�tica utiliza, a grandes
            rasgos, dos tipos de textos: los textos continuos y los
            textos discontinuos. Los primeros se leen de manera
            secuencial y se organizan en frases, p�rrafos,
            secciones, cap�tulos, etc�tera. Los segundos, en
            contraste, no se leen secuencialmente e incluyen
            cuadros, gr�ficas, tablas, etc�tera. 

        </div>

        <div class="modal_ciud" hidden>
            La prueba de Sociales y Ciudadanas eval�a los conocimientos y habilidades del 
            estudiante que le permiten comprender el mundo social. Eval�a
            tambi�n su habilidad para analizar distintos eventos, argumentos, posturas, 
            conceptos, modelos, dimensiones y contextos, as� como su capacidad de
            reflexionar y emitir juicios cr�ticos sobre estos. En concordancia con ello, 
            la prueba no le pide al estudiante que responda desde su opini�n, ni desde lo
            que se considera "pol�ticamente correcto" o desdeel "deber ser".

        </div>

        <div class="modal_cna" hidden>
            
            La prueba de Ciencias Naturales eval�a la capacidad que tiene el estudiante
            de comprender y usar nociones, conceptos y teor�as de las ciencias naturales 
            en la soluci�n de problemas. Eval�a tambi�n la habilidad del estudiante para 
            explicar c�mo ocurren algunos fen�menos de la naturaleza basado en observaciones,
            patrones y conceptos propios del conocimiento cient�fico. La prueba, adem�s, involucra en 
            la evaluaci�n el proceso de indagar, que incluye observar y relacionar patrones en los 
            datos para derivar conclusiones de fen�menos naturales. La prueba de Ciencias Naturales
            no pretende evaluar conocimientos cient�ficos en sentido estricto,sino m�s bien la capacidad
            de los estudiantes para reconstruir significativamente el conocimiento existente, aprendiendo
            a razonar, a tomar decisiones, a resolver problemas, a pensar con rigurosidad y a valorar
            de manera cr�tica el conocimiento y su efecto en la sociedad y en el ambiente.
           

        </div>


        <div class="modal_link">
             <br>
            Fuente: <a href=" https://www.icfes.gov.co/documents/39286/2171114/Gu%C3%ADa+de+orientaci%C3%B3n+Saber+11.%C2%B0+2020-1.pdf" > Icfes Saber 11 Guia</a></div>
        <button type="button" onclick="abrirPrueba()" class="bttn_prueba">Iniciar Prueba</button>
    </div>
</div>