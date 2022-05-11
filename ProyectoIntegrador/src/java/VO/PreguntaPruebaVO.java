package VO;

public class PreguntaPruebaVO {
    
    String PRUE_CODIGO;
    String PREP_CODIGO;
    String PREP_PREGUNTA;
    int PREP_PUNTAJE;
    String PRE_RESPUESTA1;
    String PRE_RESPUESTA2;
    String PRE_RESPUESTA3; 
    String PRE_RESPUESTACORRECTA;

    public PreguntaPruebaVO(String PRUE_CODIGO, String PREP_CODIGO, String PREP_PREGUNTA, int PREP_PUNTAJE, String PRE_RESPUESTA1, String PRE_RESPUESTA2, String PRE_RESPUESTA3, String PRE_RESPUESTACORRECTA) {
        this.PRUE_CODIGO = PRUE_CODIGO;
        this.PREP_CODIGO = PREP_CODIGO;
        this.PREP_PREGUNTA = PREP_PREGUNTA;
        this.PREP_PUNTAJE = PREP_PUNTAJE;
        this.PRE_RESPUESTA1 = PRE_RESPUESTA1;
        this.PRE_RESPUESTA2 = PRE_RESPUESTA2;
        this.PRE_RESPUESTA3 = PRE_RESPUESTA3;
        this.PRE_RESPUESTACORRECTA = PRE_RESPUESTACORRECTA;
    }

    public String getPRUE_CODIGO() {
        return PRUE_CODIGO;
    }

    public void setPRUE_CODIGO(String PRUE_CODIGO) {
        this.PRUE_CODIGO = PRUE_CODIGO;
    }

    public String getPREP_CODIGO() {
        return PREP_CODIGO;
    }

    public void setPREP_CODIGO(String PREP_CODIGO) {
        this.PREP_CODIGO = PREP_CODIGO;
    }

    public String getPREP_PREGUNTA() {
        return PREP_PREGUNTA;
    }

    public void setPREP_PREGUNTA(String PREP_PREGUNTA) {
        this.PREP_PREGUNTA = PREP_PREGUNTA;
    }

    public int getPREP_PUNTAJE() {
        return PREP_PUNTAJE;
    }

    public void setPREP_PUNTAJE(int PREP_PUNTAJE) {
        this.PREP_PUNTAJE = PREP_PUNTAJE;
    }

    public String getPRE_RESPUESTA1() {
        return PRE_RESPUESTA1;
    }

    public void setPRE_RESPUESTA1(String PRE_RESPUESTA1) {
        this.PRE_RESPUESTA1 = PRE_RESPUESTA1;
    }

    public String getPRE_RESPUESTA2() {
        return PRE_RESPUESTA2;
    }

    public void setPRE_RESPUESTA2(String PRE_RESPUESTA2) {
        this.PRE_RESPUESTA2 = PRE_RESPUESTA2;
    }

    public String getPRE_RESPUESTA3() {
        return PRE_RESPUESTA3;
    }

    public void setPRE_RESPUESTA3(String PRE_RESPUESTA3) {
        this.PRE_RESPUESTA3 = PRE_RESPUESTA3;
    }

    public String getPRE_RESPUESTACORRECTA() {
        return PRE_RESPUESTACORRECTA;
    }

    public void setPRE_RESPUESTACORRECTA(String PRE_RESPUESTACORRECTA) {
        this.PRE_RESPUESTACORRECTA = PRE_RESPUESTACORRECTA;
    }
    
    
}
