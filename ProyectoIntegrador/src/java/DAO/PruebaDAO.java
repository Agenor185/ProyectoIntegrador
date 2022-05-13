
package DAO;

import Controlador.ConexionBD;
import VO.PruebaVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PruebaDAO {
    
    public ArrayList<PruebaVO> obetenerPruebas() throws SQLException{
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        
        sql.append("SELECT * FROM prueba");
        
        ResultSet rs = con.obtenerDatos(sql.toString());
        
        ArrayList<PruebaVO> pruebas = new ArrayList<>();
        while (rs.next()) {
            PruebaVO prvo = new PruebaVO(
                    rs.getString("PRUE_CODIGO"), 
                    rs.getString("PRUE_NOMBRE"), 
                    rs.getString("MATE_CODIGO"));
            pruebas.add(prvo);
        }
    
    
     return pruebas;
    }
    
}
