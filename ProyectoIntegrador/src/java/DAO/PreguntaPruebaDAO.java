
package DAO;

import Controller.ConexionBD;
import VO.PreguntaPruebaVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PreguntaPruebaDAO {
    
    public ArrayList<PreguntaPruebaVO> obtenerPreguntas() throws SQLException{
    ArrayList<PreguntaPruebaVO> preguntas;
        ConexionBD con = new ConexionBD();        
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        
        sql.append("SELECT * FROM preguntaprueba WHERE PRUE_CODIGO = 'PR02' ");
        
        ResultSet rs = con.obtenerDatos(sql.toString());
        preguntas = new ArrayList<>();
        
        while (rs.next()) {
            
            PreguntaPruebaVO ppvo = new PreguntaPruebaVO(
                    rs.getString("PRUE_CODIGO"), 
                    rs.getString("PREP_CODIGO"), 
                    rs.getString("PREP_PREGUNTA"),
                    Integer.parseInt(rs.getString("PREP_PUNTAJE")), 
                    rs.getString("PREP_RESPUESTA1"), 
                    rs.getString("PREP_RESPUESTA2"), 
                    rs.getString("PREP_RESPUESTA3"),
                    rs.getString("PREP_RESPUESTACORRECTA"));           
            
            preguntas.add(ppvo);
        }      
        
        
    return preguntas;
    
    
    }
    
}
