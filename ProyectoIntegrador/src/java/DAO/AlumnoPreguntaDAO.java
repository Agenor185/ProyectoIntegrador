package DAO;

import Controller.ConexionBD;
import VO.AlumnoPreguntaVO;


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
                + "PRIN_CODIGO ) "
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
        sql.append("')");
        
        System.out.println("CONSULAT:"+sql.toString());

        if (con.ingresarDatos(sql.toString())) {

            estado = true;
        }
        return estado;
    }
}
