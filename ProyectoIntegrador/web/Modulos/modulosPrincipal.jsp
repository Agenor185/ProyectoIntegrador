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

                La prueba de Matemáticas del examen de Estado Saber 11.° evalúa
                las competencias de los estudiantes para enfrentar situaciones que
                pueden resolverse con el uso de algunas herramientas matemáticas. 
                Tanto las competencias definidas para la prueba como los conocimientos 
                matemáticos que el estudiante requiere para resolver las situaciones
                planteadas se contemplan en las definiciones de los Estándares Básicos
                de Competencias en Matemáticas del Ministerio de Educación Nacional (MEN, 2006).
                De acuerdo con lo anterior, se integran competencias y contenidos en 
                distintas situaciones o contextos, en los cuales las herramientas matemáticas
                cobran sentido y son un importante recurso para la comprensión de situaciones, 
                la transformación de información, la justificación de afirmaciones y la solución 
                de problemas


            </div>

            <br>


        </div>

        <div class="modal_ingl" hidden>
            La prueba de Inglés busca que el estudiante
            demuestre sus habilidades comunicativas a nivel de
            lectura y uso del lenguaje en esta lengua. La prueba
            está alineada con el Marco Común Europeo de
            Referencia para las lenguas (MCER), que permite
            clasificar a los evaluados en 5 niveles de desempeño:
            A?, A1, A2, B1 y B+. Esto, teniendo en cuenta que
            para Colombia existe población que se encuentra
            por debajo del primer nivel del MCER (A1), lo
            cual ha llevado a incluir en la prueba de Inglés
            de Saber 11. un nivel inferior a A1, denominado
            A?, que corresponde a aquellos desempeños
            mínimos que involucran el manejo de vocabulario
            y estructuras básicas. De igual forma, se incluye un
            nivel superior al B1 para aquellos estudiantes que
            superan lo evaluado en este nivel, denominado B+. 

        </div>

        <div class="modal_lect" hidden>

            La prueba de Lectura Crítica evalúa las competencias
            necesarias para comprender, interpretar y evaluar
            textos que pueden encontrarse en la vida cotidiana y
            en ámbitos académicos no especializados. Se espera
            que los estudiantes que culminan la educación
            media cuenten con las capacidades lectoras para
            tomar posturas críticas frente a esta clase de textos.
            <br>
            <b> 1. Tipos de textos utilizados</b>
            La prueba de Lectura Crítica utiliza, a grandes
            rasgos, dos tipos de textos: los textos continuos y los
            textos discontinuos. Los primeros se leen de manera
            secuencial y se organizan en frases, párrafos,
            secciones, capítulos, etcétera. Los segundos, en
            contraste, no se leen secuencialmente e incluyen
            cuadros, gráficas, tablas, etcétera. 

        </div>

        <div class="modal_ciud" hidden>
            La prueba de Sociales y Ciudadanas evalúa los conocimientos y habilidades del 
            estudiante que le permiten comprender el mundo social. Evalúa
            también su habilidad para analizar distintos eventos, argumentos, posturas, 
            conceptos, modelos, dimensiones y contextos, así como su capacidad de
            reflexionar y emitir juicios críticos sobre estos. En concordancia con ello, 
            la prueba no le pide al estudiante que responda desde su opinión, ni desde lo
            que se considera "políticamente correcto" o desdeel "deber ser".

        </div>

        <div class="modal_cna" hidden>
            
            La prueba de Ciencias Naturales evalúa la capacidad que tiene el estudiante
            de comprender y usar nociones, conceptos y teorías de las ciencias naturales 
            en la solución de problemas. Evalúa también la habilidad del estudiante para 
            explicar cómo ocurren algunos fenómenos de la naturaleza basado en observaciones,
            patrones y conceptos propios del conocimiento científico. La prueba, además, involucra en 
            la evaluación el proceso de indagar, que incluye observar y relacionar patrones en los 
            datos para derivar conclusiones de fenómenos naturales. La prueba de Ciencias Naturales
            no pretende evaluar conocimientos científicos en sentido estricto,sino más bien la capacidad
            de los estudiantes para reconstruir significativamente el conocimiento existente, aprendiendo
            a razonar, a tomar decisiones, a resolver problemas, a pensar con rigurosidad y a valorar
            de manera crítica el conocimiento y su efecto en la sociedad y en el ambiente.
           

        </div>


        <div class="modal_link">
             <br>
            Fuente: <a href=" https://www.icfes.gov.co/documents/39286/2171114/Gu%C3%ADa+de+orientaci%C3%B3n+Saber+11.%C2%B0+2020-1.pdf" > Icfes Saber 11 Guia</a></div>
        <button type="button" onclick="abrirPrueba()" class="bttn_prueba">Iniciar Prueba</button>
    </div>
</div>