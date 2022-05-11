package VO;

public class AlumnoPreguntaVO {

    String PERS_ID;
    String PREP_CODIGO;
    String PRUE_CODIGO;
    String ALPR_RESPUESTA;
    String ALPR_PUNTAJE;
    String PRIN_CODIGO;

    public AlumnoPreguntaVO(String PERS_ID, String PRUE_CODIGO,  String PREP_CODIGO,String ALPR_RESPUESTA, String ALPR_PUNTAJE, String PRIN_CODIGO) {
        this.PERS_ID = PERS_ID;
        this.PREP_CODIGO = PREP_CODIGO;
        this.PRUE_CODIGO = PRUE_CODIGO;
        this.ALPR_RESPUESTA = ALPR_RESPUESTA;
        this.ALPR_PUNTAJE = ALPR_PUNTAJE;
        this.PRIN_CODIGO = PRIN_CODIGO;
    }

    public String getPERS_ID() {
        return PERS_ID;
    }

    public void setPERS_ID(String PERS_ID) {
        this.PERS_ID = PERS_ID;
    }

    public String getPREP_CODIGO() {
        return PREP_CODIGO;
    }

    public void setPREP_CODIGO(String PREP_CODIGO) {
        this.PREP_CODIGO = PREP_CODIGO;
    }

    public String getPRUE_CODIGO() {
        return PRUE_CODIGO;
    }

    public void setPRUE_CODIGO(String PRUE_CODIGO) {
        this.PRUE_CODIGO = PRUE_CODIGO;
    }

    public String getALPR_RESPUESTA() {
        return ALPR_RESPUESTA;
    }

    public void setALPR_RESPUESTA(String ALPR_RESPUESTA) {
        this.ALPR_RESPUESTA = ALPR_RESPUESTA;
    }

    public String getALPR_PUNTAJE() {
        return ALPR_PUNTAJE;
    }

    public void setALPR_PUNTAJE(String ALPR_PUNTAJE) {
        this.ALPR_PUNTAJE = ALPR_PUNTAJE;
    }

    public String getPRIN_CODIGO() {
        return PRIN_CODIGO;
    }

    public void setPRIN_CODIGO(String PRIN_CODIGO) {
        this.PRIN_CODIGO = PRIN_CODIGO;
    }
    
    
    
    

}
