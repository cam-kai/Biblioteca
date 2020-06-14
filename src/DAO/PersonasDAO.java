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
import java.sql.ResultSet;

/**
 *
 * @author camve
 */
public class PersonasDAO {
    
    private Connection conexion;
    
    public PersonasDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarPersona(Personas persona){
        boolean filas_afectadas = false;
        int filasAfectadas = 0;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_persona(rut, digito_verificador, nombre, apellido_paterno, apellido_materno, direccion) values(?,?,?,?,?,?);");
            stmt.setInt(1, persona.getRut() );
            stmt.setString(2, String.valueOf(persona.getDigitoVerificador()));
            stmt.setString(3, persona.getNombre());
            stmt.setString(4, persona.getApellidoPaterno());
            stmt.setString(5, persona.getApellidoMaterno());
            stmt.setString(6, persona.getDireccion());  
            filasAfectadas = stmt.executeUpdate();
            if(filasAfectadas>0){
                filas_afectadas = true;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return filas_afectadas;
    }
    
    public Personas buscarPorRut(int rutABuscar){
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_persona where rut = ?");
            stmt.setInt(1, rutABuscar);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Personas persona = new Personas();
                persona.setRut(rs.getInt("rut"));
                persona.setDigitoVerificador((rs.getString("digito_verificador").charAt(0)));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellidoPaterno(rs.getString("apellido_paterno"));
                persona.setApellidoMaterno(rs.getString("apellido_materno"));
                persona.setDireccion(rs.getString("direccion"));
                return persona;
                
            }
        } catch (Exception e) {
        }
        return null;
        
    }
    
    public boolean modificarPersona(Personas persona){
        boolean fueModificado = false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("update tbl_persona set digito_verificador = ?, nombre =?, apellido_paterno = ?, apellido_materno = ?, direccion = ?  where rut =?;");
            stmt.setString(1, String.valueOf(persona.getDigitoVerificador()));
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellidoPaterno());
            stmt.setString(4, persona.getApellidoMaterno());
            stmt.setString(5, persona.getDireccion());
            stmt.setInt(6, persona.getRut());
            
            fueModificado = (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            fueModificado = false;
        }
        return fueModificado;
    }
}
