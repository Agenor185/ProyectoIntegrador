package DAO;

import Controller.ConexionBD;
import VO.AlumnoPreguntaVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlumnoPreguntaDAO {

    public boolean nuevoIntento(AlumnoPreguntaVO apvo) {
        boolean estado = false;
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO alumnopregunta"
                + " (PERS_ID,"
                + "PREP_CODIGO, "
                + "PRUE_CODIGO,"
                + "ALPR_RESPUESTA,"
                + "ALPR_PUNTAJE,"
                + "PRIN_CODIGO,"
                + "ALPR_POCISIONRESP ) "
                + "values ('");

        sql.append(apvo.getPERS_ID());
        sql.append("','");
        sql.append(apvo.getPREP_CODIGO());
        sql.append("','");
        sql.append(apvo.getPRUE_CODIGO());
        sql.append("','");
        sql.append(apvo.getALPR_RESPUESTA());
        sql.append("','");
        sql.append(apvo.getALPR_PUNTAJE());
        sql.append("','");
        sql.append(apvo.getPRIN_CODIGO());
        sql.append("','");
        sql.append(apvo.getALPR_POCISIONRESP());
        sql.append("')");

        System.out.println("CONSULAT:" + sql.toString());

        if (con.ingresarDatos(sql.toString())) {

            estado = true;
        }
        return estado;
    }

    public ArrayList<AlumnoPreguntaVO> respuestasAlumno(String PERS_ID, String PREP_CODIGO, String PRIN_CODIGO) throws SQLException {

        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM alumnopregunta WHERE PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("' and PREP_CODIGO = '");
        sql.append(PREP_CODIGO);
        sql.append("' AND PRIN_CODIGO = '");
        sql.append(PRIN_CODIGO);
        sql.append("' ");

        ResultSet rs = con.obtenerDatos(sql.toString());
        ArrayList<AlumnoPreguntaVO> respuestas = new ArrayList<>();
        while (rs.next()) {
            AlumnoPreguntaVO apvo = new AlumnoPreguntaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PRUE_CODIGO"),
                    rs.getString("PREP_CODIGO"),
                    rs.getString("ALPR_RESPUESTAS"),
                    rs.getString("ALPR_PUNTAJE"),
                    rs.getString("PRIN_CODIGO"),
                    rs.getString("ALPR_POCISIONRESP"));
            respuestas.add(apvo);
        }
        return respuestas;
    }
}
