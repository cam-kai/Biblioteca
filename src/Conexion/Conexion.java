/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author camve
 */
public class Conexion {
    
    private static Connection conexion;
    
    private String usuario = "cvega";
    private String pass = "cvega1234";
    
    private String url = "jdbc:mysql://mycm.cl:59162/Biblioteca_131V_Camila_Vega";
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            if(conexion == null){
                this.conexion = (Connection) DriverManager.getConnection(url , usuario, pass);
            }
        }catch(Exception ex){
            
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    
}
