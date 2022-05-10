package DAO;

import Controller.ConexionBD;
import VO.PruebaIntentoVO;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaIntentoDAO {

    public boolean nuevoIntento(PruebaIntentoVO pivo) {
        boolean estado = false;
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO pruebaintento (PRIN_CODIGO,PRIN_INTENTO, PRUE_CODIGO, PERS_ID) values ('");
        sql.append(pivo.getPRIN_CODIGO());
        sql.append("',");
        sql.append(pivo.getPRIN_INTENTO());
        sql.append(",'");
        sql.append(pivo.getPRUE_CODIGO());
        sql.append("','");
        sql.append(pivo.getPERS_ID());
        sql.append("')");

        if (con.ingresarDatos(sql.toString())) {

            estado = true;
        }
        return estado;
    }

    public String ultimoRegistro() throws SQLException {
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM pruebaintento order by PRIN_FECHA asc");
        String PRIN_CODIGO = null;

        ResultSet rs = con.obtenerDatos(sql.toString());
        try{
        while (rs.next()) {
            PRIN_CODIGO = rs.getString("PRIN_CODIGO");
        }
        }catch(Exception ex){
        
        }
        return PRIN_CODIGO;
    }
    
      public String ultimoIntento(String PERS_ID) throws SQLException {
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM pruebaintento where PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("'order by PRIN_FECHA asc");
        String PRIN_INTENTO = null;

        ResultSet rs = con.obtenerDatos(sql.toString());
        try{
        while (rs.next()) {
            PRIN_INTENTO= rs.getString("PRIN_INTENTO");
        }
        }catch(Exception ex){
        
        }
        return PRIN_INTENTO;
    }

}
