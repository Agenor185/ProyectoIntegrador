
package DAO;

import Controller.ConexionBD;
import VO.AlumnoVO;
import java.sql.ResultSet;
import java.sql.SQLException;


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
    
    public boolean verificarAlumno(String PERS_ID) throws SQLException{
        
        boolean estado = false;
         ConexionBD con = new ConexionBD();
       con.ConexionBD();
       
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT PERS_ID FROM ALUMNO WHERE PERS_ID = '");
       sql.append(PERS_ID);
       sql.append("'");
        System.out.println(sql.toString());
       
      ResultSet rs = con.obtenerDatos(sql.toString());
      
        while (rs.next()) {
            if(rs.getString("PERS_ID").equals(PERS_ID)){
            
            estado = true;
            }
            
            
        }
       
       con.close();
        
        
        return estado;
    
    
    
    }
}
