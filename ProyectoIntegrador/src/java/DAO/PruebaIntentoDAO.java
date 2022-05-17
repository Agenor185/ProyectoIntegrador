package DAO;

import Controller.ConexionBD;
import VO.PruebaIntentoVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        try {
            while (rs.next()) {
                PRIN_CODIGO = rs.getString("PRIN_CODIGO");
            }
        } catch (Exception ex) {

        }
        return PRIN_CODIGO;
    }

    public String ultimoIntento(String PERS_ID, String PRUE_CODIGO) throws SQLException {
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM pruebaintento where PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("' AND PRUE_CODIGO = '");
        sql.append(PRUE_CODIGO);
        sql.append("' order by PRIN_FECHA asc");
        String PRIN_INTENTO = null;

        ResultSet rs = con.obtenerDatos(sql.toString());
        System.out.println("INTENTOS: "+sql.toString());
        try {
            while (rs.next()) {
                PRIN_INTENTO = rs.getString("PRIN_INTENTO");
            }
        } catch (Exception ex) {

        }
        return PRIN_INTENTO;
    }

    public ArrayList<PruebaIntentoVO> obtenerIntentos(String PERS_ID, String PRUE_CODIGO) throws SQLException {
        ConexionBD con = new ConexionBD();
        ArrayList<PruebaIntentoVO> intentos;
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM pruebaintento WHERE PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("' AND PRUE_CODIGO = '");
        sql.append(PRUE_CODIGO);
        sql.append("' order by PRIN_FECHA asc");
        System.out.println(sql.toString());

        ResultSet rs = con.obtenerDatos(sql.toString());
        intentos = new ArrayList<>();    
                   
            while (rs.next()) {
                
                PruebaIntentoVO pivo = new PruebaIntentoVO(
                        rs.getString("PRIN_CODIGO"), 
                        rs.getInt("PRIN_INTENTO"), 
                       rs.getString("PRUE_CODIGO"),
                        rs.getString("PERS_ID"), 
                        rs.getString("PRIN_FECHA"));
                intentos.add(pivo);
               
            }
       
        return intentos;
    }

}
