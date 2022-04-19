
package VO;


public class AlumnoVO {
    
    String PERS_ID;
  
    String GRAD_CODIGO;

    public AlumnoVO(String PERS_ID, String GRAD_CODIGO) {
        this.PERS_ID = PERS_ID;
       
        this.GRAD_CODIGO = GRAD_CODIGO;
    }

  

    public String getPERS_ID() {
        return PERS_ID;
    }

    public void setPERS_ID(String PERS_ID) {
        this.PERS_ID = PERS_ID;
    }

 

    public String getGRAD_CODIGO() {
        return GRAD_CODIGO;
    }

    public void setGRAD_CODIGO(String GRAD_CODIGO) {
        this.GRAD_CODIGO = GRAD_CODIGO;
    }
    
    
    
    
    
}
