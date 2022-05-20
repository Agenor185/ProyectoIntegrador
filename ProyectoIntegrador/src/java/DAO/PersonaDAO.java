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

        System.out.println(persona.getPERS_NUMDOC() + "NUM DOCUMENTO");

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

    public boolean llavesPrimarias(String PERS_ID) throws SQLException {

        ConexionBD con = new ConexionBD();
        boolean estado = false;
        con.ConexionBD();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT PERS_ID FROM PERSONA WHERE PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("'");

        ResultSet rs = con.obtenerDatos(sql.toString());

        while (rs.next()) {
            if (rs.getString("PERS_ID") != null) {
                System.out.println(rs.getString("PERS_ID") + " NO ES NULO");
                estado = true;
            }

        }

        con.close();
        return estado;
    }

    public String obtenerIdPersona(PersonaVO lo) throws SQLException {
        String PERS_ID = "";

        String sql = "";

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql = "SELECT * FROM PERSONA WHERE PERS_USERNAME='" + lo.getPERS_USERNAME() + "' AND PERS_PASSWORD='" + lo.getPERS_PASSWORD() + "' ";
        ResultSet rs = cn.obtenerDatos(sql);
        System.out.println("CONSULTA: " + sql);
        while (rs.next()) {

            if (rs.getString("PERS_USERNAME").equals(lo.getPERS_USERNAME())) {

                if (rs.getString("PERS_PASSWORD").equals(lo.getPERS_PASSWORD())) {

                    PERS_ID = rs.getString("PERS_ID");
                }

            }

        }
        return PERS_ID;
    }

    public String obtenerNombre(String PERS_ID) throws SQLException {
        String NOMBRE = "";

        String sql = "";

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql = "SELECT * FROM PERSONA WHERE PERS_ID ='" + PERS_ID + "'  ";
        ResultSet rs = cn.obtenerDatos(sql);

        while (rs.next()) {

            NOMBRE = rs.getString("PERS_PRINOMBRE") + " "
                    + rs.getString("PERS_SEGNOMBRE") + " "
                    + rs.getString("PERS_PRIAPELLIDO") + " "
                    + rs.getString("PERS_SEGAPELLIDO");
        }

        return NOMBRE;
    }

    public ArrayList<PersonaVO> obetenerEstudiantes(String GRAD_CODIGO) throws SQLException {

        ArrayList<PersonaVO> persona;
        StringBuilder sql = new StringBuilder();

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql.append("  SELECT * FROM persona, alumno WHERE persona.PERS_ID = alumno.PERS_ID and alumno.GRAD_CODIGO = '");
        sql.append(GRAD_CODIGO);
        sql.append("'");

        ResultSet rs = cn.obtenerDatos(sql.toString());
        System.out.println("CONSULTA: " + sql.toString());
        persona = new ArrayList<>();

        while (rs.next()) {

            PersonaVO pvo = new PersonaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PERS_NUMDOC"),
                    rs.getString("PERS_TIPODOC"),
                    rs.getString("PERS_PRINOMBRE"),
                    rs.getString("PERS_SEGNOMBRE"),
                    rs.getString("PERS_PRIAPELLIDO"),
                    rs.getString("PERS_SEGAPELLIDO"),
                    rs.getString("PERS_USERNAME"),
                    rs.getString("PERS_PASSWORD"));
            persona.add(pvo);

        }
        return persona;
    }

    public ArrayList<PersonaVO> obetenerDocentes() throws SQLException {

        ArrayList<PersonaVO> persona;
        StringBuilder sql = new StringBuilder();

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql.append("  SELECT * FROM persona, docente WHERE persona.PERS_ID = docente.PERS_ID ");
        System.out.println("DOCENTE" + sql.toString());

        ResultSet rs = cn.obtenerDatos(sql.toString());
        System.out.println("CONSULTA: " + sql.toString());
        persona = new ArrayList<>();
        while (rs.next()) {

            PersonaVO pvo = new PersonaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PERS_NUMDOC"),
                    rs.getString("PERS_TIPODOC"),
                    rs.getString("PERS_PRINOMBRE"),
                    rs.getString("PERS_SEGNOMBRE"),
                    rs.getString("PERS_PRIAPELLIDO"),
                    rs.getString("PERS_SEGAPELLIDO"),
                    rs.getString("PERS_USERNAME"),
                    rs.getString("PERS_PASSWORD"));
            persona.add(pvo);

        }
        return persona;
    }

    public ArrayList<PersonaVO> obetenerDocentesPorId(String PERS_ID) throws SQLException {

        ArrayList<PersonaVO> persona;
        StringBuilder sql = new StringBuilder();

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql.append(" SELECT * FROM persona, docente WHERE persona.PERS_ID = docente.PERS_ID  AND docente.PERS_ID ='");
        sql.append(PERS_ID);
        sql.append("'");
        System.out.println("DOCENTE" + sql.toString());

        ResultSet rs = cn.obtenerDatos(sql.toString());
        System.out.println("CONSULTA: " + sql.toString());
        persona = new ArrayList<>();
        while (rs.next()) {

            PersonaVO pvo = new PersonaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PERS_NUMDOC"),
                    rs.getString("PERS_TIPODOC"),
                    rs.getString("PERS_PRINOMBRE"),
                    rs.getString("PERS_SEGNOMBRE"),
                    rs.getString("PERS_PRIAPELLIDO"),
                    rs.getString("PERS_SEGAPELLIDO"),
                    rs.getString("PERS_USERNAME"),
                    rs.getString("PERS_PASSWORD"));
            persona.add(pvo);

        }
        return persona;
    }

    public ArrayList<PersonaVO> obetenerInfoEstu(String PERS_ID, String GRADO_CODIGO) throws SQLException {

        ArrayList<PersonaVO> persona;
        String sql = "";

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        if (!PERS_ID.equals("")) {

            sql = "SELECT * FROM PERSONA,ALUMNO,GRADO "
                    + "WHERE persona.PERS_ID = alumno.PERS_ID"
                    + " and grado.GRAD_CODIGO = alumno.GRAD_CODIGO"
                    + " and persona.PERS_ID = '" + PERS_ID + "' ";
        } else {

            sql = "SELECT * FROM PERSONA,ALUMNO,GRADO "
                    + "WHERE persona.PERS_ID = alumno.PERS_ID"
                    + " and grado.GRAD_CODIGO = alumno.GRAD_CODIGO"
                    + " and alumno.GRAD_CODIGO = '" + GRADO_CODIGO + "' ";

        }

        ResultSet rs = cn.obtenerDatos(sql);
        System.out.println("CONSULTA: " + sql);

        persona = new ArrayList<>();
        while (rs.next()) {

            PersonaVO pvo = new PersonaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PERS_NUMDOC"),
                    rs.getString("PERS_TIPODOC"),
                    rs.getString("PERS_PRINOMBRE"),
                    rs.getString("PERS_SEGNOMBRE"),
                    rs.getString("PERS_PRIAPELLIDO"),
                    rs.getString("PERS_SEGAPELLIDO"),
                    rs.getString("GRAD_NOMBRE"),
                    rs.getString("PERS_PASSWORD"));
            persona.add(pvo);

        }
        return persona;
    }

    public ArrayList<PersonaVO> infoEstudianteId(String PERS_ID) throws SQLException {

        ArrayList<PersonaVO> persona;
        StringBuilder sql = new StringBuilder();

        ConexionBD cn = new ConexionBD();
        cn.ConexionBD();

        sql.append("  SELECT * FROM persona, alumno WHERE persona.PERS_ID = alumno.PERS_ID and alumno.PERS_ID = '");
        sql.append(PERS_ID);
        sql.append("'");

        ResultSet rs = cn.obtenerDatos(sql.toString());
        System.out.println("CONSULTA: " + sql.toString());
        persona = new ArrayList<>();

        while (rs.next()) {

            PersonaVO pvo = new PersonaVO(
                    rs.getString("PERS_ID"),
                    rs.getString("PERS_NUMDOC"),
                    rs.getString("PERS_TIPODOC"),
                    rs.getString("PERS_PRINOMBRE"),
                    rs.getString("PERS_SEGNOMBRE"),
                    rs.getString("PERS_PRIAPELLIDO"),
                    rs.getString("PERS_SEGAPELLIDO"),
                    rs.getString("PERS_USERNAME"),
                    rs.getString("PERS_PASSWORD"),
                    "n",
                    rs.getString("alumno.GRAD_CODIGO")
            );

            persona.add(pvo);

        }
        return persona;
    }

    public boolean ActualizarDatos(PersonaVO persona, String TIPO_USER) {
        boolean estado = false;
        StringBuilder sql = new StringBuilder();
        StringBuilder sql_2 = new StringBuilder();
        ConexionBD con = new ConexionBD();
        con.ConexionBD();

        System.out.println(persona.getPERS_NUMDOC() + "NUM DOCUMENTO");

        sql.append("UPDATE persona SET ");
        sql.append("PERS_NUMDOC = '");
        sql.append(persona.getPERS_NUMDOC());
        sql.append("', PERS_TIPODOC = '");
        sql.append(persona.getPERS_TIPODOC());
        sql.append("', PERS_PRINOMBRE = '");
        sql.append(persona.getPERS_PRINOMBRE());
        sql.append("', PERS_SEGNOMBRE = '");
        sql.append(persona.getPERS_SEGNOMBRE());
        sql.append("', PERS_PRIAPELLIDO = '");
        sql.append(persona.getPERS_PRIAPELLIDO());
        sql.append("', PERS_SEGAPELLIDO = '");
        sql.append(persona.getPERS_SEGAPELLIDO());
        sql.append("', PERS_USERNAME = '");
        sql.append(persona.getPERS_USERNAME());
        sql.append("', PERS_PASSWORD = '");
        sql.append(persona.getPERS_PASSWORD());
        sql.append("' WHERE PERS_ID = '");
        sql.append(persona.getPERS_ID());
        sql.append("' ");

        if (TIPO_USER.equals("2")) {
            sql_2.append("UPDATE alumno SET GRAD_CODIGO = '");
            sql_2.append(persona.getGRAD_CODIGO());
            sql_2.append("' WHERE PERS_ID = '");
            sql_2.append(persona.getPERS_ID());
            sql_2.append("' ");

            if (con.ingresarDatos(sql.toString()) && con.ingresarDatos(sql_2.toString())) {
                estado = true;

            }

        } else {
            if (con.ingresarDatos(sql.toString())) {
                estado = true;
            }

        }

        System.out.println(sql.toString());

        return estado;
    }

}
