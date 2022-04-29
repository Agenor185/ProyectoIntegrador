
package DAO;

import Controller.ConexionBD;
import VO.PersonaVO;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {
   
   
  
    
    public boolean validarLogin(PersonaVO lo) throws SQLException{       
        
          
    
    String sql="";
   
    ConexionBD cn = new ConexionBD();
    cn.ConexionBD();
        
        boolean estado  = false;
        sql="SELECT * FROM PERSONA WHERE PERS_USERNAME='"+ lo.getPERS_USERNAME()+"' AND PERS_PASSWORD='"+lo.getPERS_PASSWORD()+"' ";
       ResultSet rs = cn.obtenerDatos(sql);
        System.out.println("CONSULTA: "+sql);
        while (rs.next()) {
              
            if(rs.getString("PERS_USERNAME").equals(lo.getPERS_USERNAME())){

                if(rs.getString("PERS_PASSWORD").equals(lo.getPERS_PASSWORD())){
                  
                 estado = true;
                
                }
            
            }
            
        }
        return estado;
    }
}
