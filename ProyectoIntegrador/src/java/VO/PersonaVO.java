
package VO;

public class PersonaVO {
    
    String PERS_ID;
    String PERS_NUMDOC;
    String PERS_TIPODOC;
    String PERS_PRINOMBRE;
    String PERS_SEGNOMBRE;
    String PERS_PRIAPELLIDO;
    String PERS_SEGAPELLIDO;
    String PERS_USERNAME;
    String PERS_PASSWORD;
    
    String GRAD_NOMBRE;
    String GRAD_CODIGO;

    public PersonaVO(String PERS_ID, String PERS_NUMDOC, String PERS_TIPODOC, String PERS_PRINOMBRE, String PERS_SEGNOMBRE, String PERS_PRIAPELLIDO, String PERS_SEGAPELLIDO, String PERS_USERNAME, String PERS_PASSWORD) {
        this.PERS_ID = PERS_ID;
        this.PERS_NUMDOC = PERS_NUMDOC;
        this.PERS_TIPODOC = PERS_TIPODOC;
        this.PERS_PRINOMBRE = PERS_PRINOMBRE;
        this.PERS_SEGNOMBRE = PERS_SEGNOMBRE;
        this.PERS_PRIAPELLIDO = PERS_PRIAPELLIDO;
        this.PERS_SEGAPELLIDO = PERS_SEGAPELLIDO;
        this.PERS_USERNAME = PERS_USERNAME;
        this.PERS_PASSWORD = PERS_PASSWORD;
    }

    public PersonaVO(String PERS_ID, String PERS_NUMDOC, String PERS_TIPODOC, String PERS_PRINOMBRE, String PERS_SEGNOMBRE, String PERS_PRIAPELLIDO, String PERS_SEGAPELLIDO, String PERS_USERNAME, String PERS_PASSWORD, String GRAD_NOMBRE, String GRAD_CODIGO) {
        this.PERS_ID = PERS_ID;
        this.PERS_NUMDOC = PERS_NUMDOC;
        this.PERS_TIPODOC = PERS_TIPODOC;
        this.PERS_PRINOMBRE = PERS_PRINOMBRE;
        this.PERS_SEGNOMBRE = PERS_SEGNOMBRE;
        this.PERS_PRIAPELLIDO = PERS_PRIAPELLIDO;
        this.PERS_SEGAPELLIDO = PERS_SEGAPELLIDO;
        this.PERS_USERNAME = PERS_USERNAME;
        this.PERS_PASSWORD = PERS_PASSWORD;
        this.GRAD_NOMBRE = GRAD_NOMBRE;
        this.GRAD_CODIGO = GRAD_CODIGO;
    }
    
    

    public String getGRAD_NOMBRE() {
        return GRAD_NOMBRE;
    }

    public void setGRAD_NOMBRE(String GRAD_NOMBRE) {
        this.GRAD_NOMBRE = GRAD_NOMBRE;
    }

    public String getGRAD_CODIGO() {
        return GRAD_CODIGO;
    }

    public void setGRAD_CODIGO(String GRAD_CODIGO) {
        this.GRAD_CODIGO = GRAD_CODIGO;
    }
    
    

    public PersonaVO(String PERS_USERNAME, String PERS_PASSWORD) {
        this.PERS_USERNAME = PERS_USERNAME;
        this.PERS_PASSWORD = PERS_PASSWORD;
    }

    
    public String getPERS_ID() {
        return PERS_ID;
    }

    public void setPERS_ID(String PERS_ID) {
        this.PERS_ID = PERS_ID;
    }

    public String getPERS_NUMDOC() {
        return PERS_NUMDOC;
    }

    public void setPERS_NUMDOC(String PERS_NUMDOC) {
        this.PERS_NUMDOC = PERS_NUMDOC;
    }

    public String getPERS_TIPODOC() {
        return PERS_TIPODOC;
    }

    public void setPERS_TIPODOC(String PERS_TIPODOC) {
        this.PERS_TIPODOC = PERS_TIPODOC;
    }

    public String getPERS_PRINOMBRE() {
        return PERS_PRINOMBRE;
    }

    public void setPERS_PRINOMBRE(String PERS_PRINOMBRE) {
        this.PERS_PRINOMBRE = PERS_PRINOMBRE;
    }

    public String getPERS_SEGNOMBRE() {
        return PERS_SEGNOMBRE;
    }

    public void setPERS_SEGNOMBRE(String PERS_SEGNOMBRE) {
        this.PERS_SEGNOMBRE = PERS_SEGNOMBRE;
    }

    public String getPERS_PRIAPELLIDO() {
        return PERS_PRIAPELLIDO;
    }

    public void setPERS_PRIAPELLIDO(String PERS_PRIAPELLIDO) {
        this.PERS_PRIAPELLIDO = PERS_PRIAPELLIDO;
    }

    public String getPERS_SEGAPELLIDO() {
        return PERS_SEGAPELLIDO;
    }

    public void setPERS_SEGAPELLIDO(String PERS_SEGAPELLIDO) {
        this.PERS_SEGAPELLIDO = PERS_SEGAPELLIDO;
    }

    public String getPERS_USERNAME() {
        return PERS_USERNAME;
    }

    public void setPERS_USERNAME(String PERS_USERNAME) {
        this.PERS_USERNAME = PERS_USERNAME;
    }

    public String getPERS_PASSWORD() {
        return PERS_PASSWORD;
    }

    public void setPERS_PASSWORD(String PERS_PASSWORD) {
        this.PERS_PASSWORD = PERS_PASSWORD;
    }
    
    
    
}
