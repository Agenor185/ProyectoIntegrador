
package VO;


public class PruebaIntentoVO {
    
    String PRIN_CODIGO;
    int PRIN_INTENTO;
    String PRUE_CODIGO;
    String PERS_ID;
    String PRIN_FECHA;

    public PruebaIntentoVO(String PRIN_CODIGO, int PRIN_INTENTO, String PRUE_CODIGO, String PERS_ID,String PRIN_FECHA) {
        this.PRIN_CODIGO = PRIN_CODIGO;
        this.PRIN_INTENTO = PRIN_INTENTO;
        this.PRUE_CODIGO = PRUE_CODIGO;
        this.PERS_ID = PERS_ID;
        this.PRIN_FECHA = PRIN_FECHA;
    }

    public String getPRIN_FECHA() {
        return PRIN_FECHA;
    }

    public void setPRIN_FECHA(String PRIN_FECHA) {
        this.PRIN_FECHA = PRIN_FECHA;
    }
    
    

    public String getPRIN_CODIGO() {
        return PRIN_CODIGO;
    }

    public void setPRIN_CODIGO(String PRIN_CODIGO) {
        this.PRIN_CODIGO = PRIN_CODIGO;
    }

    public int getPRIN_INTENTO() {
        return PRIN_INTENTO;
    }

    public void setPRIN_INTENTO(int PRIN_INTENTO) {
        this.PRIN_INTENTO = PRIN_INTENTO;
    }

    public String getPRUE_CODIGO() {
        return PRUE_CODIGO;
    }

    public void setPRUE_CODIGO(String PRUE_CODIGO) {
        this.PRUE_CODIGO = PRUE_CODIGO;
    }

    public String getPERS_ID() {
        return PERS_ID;
    }

    public void setPERS_ID(String PERS_ID) {
        this.PERS_ID = PERS_ID;
    }
    
    
    
}
