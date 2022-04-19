
package DAO;

import Controller.ConexionBD;
import VO.AlumnoVO;


public class AlumnoDAO {
    
    public boolean nuevoAlumno(AlumnoVO alumno){
    
       ConexionBD con = new ConexionBD();
       con.ConexionBD();
       
       StringBuilder sql = new StringBuilder();
       sql.append("INSERT INTO ALUMNO (PERS_ID,GRAD_CODIGO) VALUES ('");
       sql.append(alumno.getPERS_ID());
       sql.append("','");
       sql.append(alumno.getGRAD_CODIGO());
       sql.append("')");
       
       con.ingresarDatos(sql.toString());
       
       
       con.close();
        
        
        return true;
    }
}
