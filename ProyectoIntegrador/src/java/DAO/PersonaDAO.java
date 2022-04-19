package DAO;

import Controller.ConexionBD;
import VO.PersonaVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonaDAO {

  

    public boolean NuevaPersona(PersonaVO persona) {

        StringBuilder sql = new StringBuilder();
       ConexionBD con = new ConexionBD();
        con.ConexionBD();
        
        System.out.println(persona.getPERS_NUMDOC()+"NUM DOCUMENTO");

        sql.append("INSERT INTO persona (");
        sql.append("PERS_ID,PERS_NUMDOC,PERS_TIPODOC,PERS_PRINOMBRE,PERS_SEGNOMBRE,PERS_PRIAPELLIDO,PERS_SEGAPELLIDO,PERS_USERNAME,PERS_PASSWORD)");
        sql.append(" VALUES ('");
        sql.append(persona.getPERS_ID());
        sql.append("','");
        sql.append(persona.getPERS_NUMDOC());
        sql.append("','");
        sql.append(persona.getPERS_TIPODOC());
        sql.append("','");
        sql.append(persona.getPERS_PRINOMBRE());
        sql.append("','");
        sql.append(persona.getPERS_SEGNOMBRE());
        sql.append("','");
        sql.append(persona.getPERS_PRIAPELLIDO());
        sql.append("','");
        sql.append(persona.getPERS_SEGAPELLIDO());
        sql.append("','");
        sql.append(persona.getPERS_USERNAME());
        sql.append("','");
        sql.append(persona.getPERS_PASSWORD());
        sql.append("')");
        System.out.println(sql.toString());
        con.ingresarDatos(sql.toString());

        return true;
    }
    
    public boolean llavesPrimarias(String PERS_ID) throws SQLException{
        
        ConexionBD con = new ConexionBD();
        boolean estado = false;
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT PERS_ID FROM PERSONA WHERE PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("'");
        
        ResultSet rs = con.obtenerDatos(sql.toString());
        
         while (rs.next()){
               if(rs.getString("PERS_ID") != null){
                   System.out.println(rs.getString("PERS_ID")+ " NO ES NULO");
               estado = true;
               }
              
            }
        
    con.close();
    return estado;
    }

}
