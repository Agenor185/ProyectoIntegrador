
package VO;


public class GradoVO {
    
    String GRAD_CODIGO;
    String GRAD_NOMBRE;

    public GradoVO(String GRAD_CODIGO, String GRAD_NOMBRE) {
        this.GRAD_CODIGO = GRAD_CODIGO;
        this.GRAD_NOMBRE = GRAD_NOMBRE;
    }

    public String getGRAD_CODIGO() {
        return GRAD_CODIGO;
    }

    public void setGRAD_CODIGO(String GRAD_CODIGO) {
        this.GRAD_CODIGO = GRAD_CODIGO;
    }

    public String getGRAD_NOMBRE() {
        return GRAD_NOMBRE;
    }

    public void setGRAD_NOMBRE(String GRAD_NOMBRE) {
        this.GRAD_NOMBRE = GRAD_NOMBRE;
    }
    
    
}
