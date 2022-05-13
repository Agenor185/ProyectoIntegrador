package DAO;

import Controller.ConexionBD;
import VO.PreguntaPruebaVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreguntaPruebaDAO {

    public ArrayList<PreguntaPruebaVO> obtenerPreguntas() throws SQLException {
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

    public ArrayList<PreguntaPruebaVO> obtenerPreguntasEstudiante(String PRUE_CODIGO, String PERS_ID, String PRIN_CODIGO) throws SQLException {
        ArrayList<PreguntaPruebaVO> preguntas;
        ConexionBD con = new ConexionBD();
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM preguntaprueba,alumnopregunta");
        sql.append(" WHERE preguntaprueba.PRUE_CODIGO = alumnopregunta.PREP_CODIGO");
        sql.append(" AND preguntaprueba.PRUE_CODIGO = '");
        sql.append(PRUE_CODIGO);
        sql.append("' AND alumnopregunta.PRUE_CODIGO = preguntaprueba.PREP_CODIGO ");
        sql.append("  AND alumnopregunta.PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("' AND alumnopregunta.PRIN_CODIGO = '");
        sql.append(PRIN_CODIGO);
        sql.append("'");

        ResultSet rs = con.obtenerDatos(sql.toString());
        preguntas = new ArrayList<>();

        while (rs.next()) {

            PreguntaPruebaVO ppvo = new PreguntaPruebaVO(
                    rs.getString("alumnopregunta.ALPR_RESPUESTA"),
                    rs.getString("preguntaprueba.PREP_CODIGO"),
                    rs.getString("preguntaprueba.PREP_PREGUNTA"),
                    Integer.parseInt(rs.getString("alumnopregunta.ALPR_PUNTAJE")),
                    rs.getString("preguntaprueba.PREP_RESPUESTA1"),
                    rs.getString("preguntaprueba.PREP_RESPUESTA2"),
                    rs.getString("preguntaprueba.PREP_RESPUESTA3"),
                    rs.getString("preguntaprueba.PREP_RESPUESTACORRECTA"));

            preguntas.add(ppvo);
        }

        return preguntas;

    }

}
