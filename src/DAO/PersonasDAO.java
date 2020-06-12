/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Personas;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camve
 */
public class PersonasDAO {
    
    private Connection conexion;
    
    public PersonasDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarPersona(Personas personas){
        int filas_afectadas = 0;
        
        try {
            PreparedStatement stmt = 
                    this.conexion.prepareStatement("insert into tbl_persona(rut, digito_verificador,nombre,apellido_paterno,apellido_materno, direccion) values(?,?,?,?,?,?)");
            stmt.setInt(1, personas.getRut() );
            stmt.setShort(2, (short) personas.getDigitoVerificador());
            stmt.setString(3, personas.getNombre());
            stmt.setString(4, personas.getApellidoPaterno());
            stmt.setString(5, personas.getApellidoMaterno());
            stmt.setArray(6, (Array) personas.getDireccion());
            
            filas_afectadas= stmt.executeUpdate();
            
        } catch (Exception e) {
        }
        return(filas_afectadas>0);
    }
}
