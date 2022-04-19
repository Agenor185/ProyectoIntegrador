/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Controller.ConexionBD;
import VO.DocenteVO;


/**
 *
 * @author NITRO
 */
public class DocenteDAO {
    
     public boolean nuevoDocente(DocenteVO docente){
    
       ConexionBD con = new ConexionBD();
       con.ConexionBD();
       
       StringBuilder sql = new StringBuilder();
       sql.append("INSERT INTO DOCENTE (PERS_ID) VALUES ('");
       sql.append(docente.getPERS_ID());   
       sql.append("')");
       
       con.ingresarDatos(sql.toString());
       
       
       con.close();
        
        
        return true;
    }
    
}
