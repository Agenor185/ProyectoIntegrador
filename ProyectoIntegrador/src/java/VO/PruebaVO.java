
package VO;


public class PruebaVO {
    
    String PRUE_CODIGO;
    String PRUE_NOMBRE;
    String MATE_CODIGO;

    public PruebaVO(String PRUE_CODIGO, String PRUE_NOMBRE, String MATE_CODIGO) {
        this.PRUE_CODIGO = PRUE_CODIGO;
        this.PRUE_NOMBRE = PRUE_NOMBRE;
        this.MATE_CODIGO = MATE_CODIGO;
    }

    public String getPRUE_CODIGO() {
        return PRUE_CODIGO;
    }

    public void setPRUE_CODIGO(String PRUE_CODIGO) {
        this.PRUE_CODIGO = PRUE_CODIGO;
    }

    public String getPRUE_NOMBRE() {
        return PRUE_NOMBRE;
    }

    public void setPRUE_NOMBRE(String PRUE_NOMBRE) {
        this.PRUE_NOMBRE = PRUE_NOMBRE;
    }

    public String getMATE_CODIGO() {
        return MATE_CODIGO;
    }

    public void setMATE_CODIGO(String MATE_CODIGO) {
        this.MATE_CODIGO = MATE_CODIGO;
    }
    
    
    
}
