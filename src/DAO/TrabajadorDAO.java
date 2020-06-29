/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Trabajador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camve
 */
public class TrabajadorDAO {
    private Connection conexion;
    
    public TrabajadorDAO(){
        
    }
    
    public boolean agregarTrabajador(Trabajador trabajador){
        this.conexion = new Conexion().getConexion();
        boolean filas_afectadas = false;
        try {
            String sql = "insert into tbl_trabajador(fecha_contratacion,rut, digito_verificador, nombre, apellido_paterno, apellido_materno, direccion, correo, telefono) values (?,?,?,?,?,?,?,?,?);";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(trabajador.getFechaContrato()));    
            stmt.setInt(2, trabajador.getRutT());
            stmt.setString(3, trabajador.getDigitoVerificadorT());
            stmt.setString(4, trabajador.getNombreT());
            stmt.setString(5, trabajador.getApellido_paternoT());
            stmt.setString(6, trabajador.getApellido_maternoT());
            stmt.setString(7, trabajador.getDireccionT());
            stmt.setString(8, trabajador.getCorreoT());
            stmt.setInt(9, trabajador.getTelefonoT());
            filas_afectadas = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return filas_afectadas;
    }
    
    public ArrayList<Trabajador> listarTrabajador(){
        this.conexion = new Conexion().getConexion();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try {
            String sql= "SELECT * from tbl_trabajador ORDER BY id_trabajador ;";
            PreparedStatement stmt =this.conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trabajador(rs.getInt("id_trabajador"));
                trabajador.setFechaContrato(rs.getDate("fecha_contratacion"));
                trabajador.setRutT(rs.getInt("rut"));
                trabajador.setDigitoVerificadorT(rs.getString("digito_verificador"));
                trabajador.setNombreT(rs.getString("nombre"));
                trabajador.setApellido_paternoT(rs.getString("apellido_paterno"));
                trabajador.setApellido_maternoT(rs.getString("apellido_materno"));                
                trabajador.setDireccionT(rs.getString("direccion"));
                trabajador.setCorreoT(rs.getString("correo"));
                trabajador.setTelefonoT(rs.getInt("telefono"));
                trabajadores.add(trabajador);
            }
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return trabajadores;
    }
    
    public Trabajador buscarPorId(int id){
        this.conexion = new Conexion().getConexion();
        try {
            String sql= "SELECT * from tbl_trabajador where id_trabajador=? ;";
            PreparedStatement stmt =this.conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trabajador(rs.getInt("id_trabajador")); 
                trabajador.setFechaContrato(rs.getDate("fecha_contratacion"));
                trabajador.setRutT(rs.getInt("rut"));
                trabajador.setDigitoVerificadorT(rs.getString("digito_verificador"));
                trabajador.setNombreT(rs.getString("nombre"));
                trabajador.setApellido_paternoT(rs.getString("apellido_paterno"));
                trabajador.setApellido_maternoT(rs.getString("apellido_materno"));                
                trabajador.setDireccionT(rs.getString("direccion"));
                trabajador.setCorreoT(rs.getString("correo"));
                trabajador.setTelefonoT(rs.getInt("telefono"));
                return trabajador;
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
    
    public Trabajador buscarPorRut(int rut){
        this.conexion = new Conexion().getConexion();
        try {
            String sql= "SELECT * from tbl_trabajador where rut=? ;";
            PreparedStatement stmt =this.conexion.prepareStatement(sql);
            stmt.setInt(1, rut);
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trabajador(rs.getInt("id_trabajador")); 
                trabajador.setFechaContrato(rs.getDate("fecha_contratacion"));
                trabajador.setRutT(rs.getInt("rut"));
                trabajador.setDigitoVerificadorT(rs.getString("digito_verificador"));
                trabajador.setNombreT(rs.getString("nombre"));
                trabajador.setApellido_paternoT(rs.getString("apellido_paterno"));
                trabajador.setApellido_maternoT(rs.getString("apellido_materno"));                
                trabajador.setDireccionT(rs.getString("direccion"));
                trabajador.setCorreoT(rs.getString("correo"));
                trabajador.setTelefonoT(rs.getInt("telefono"));
                return trabajador;
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
    
    public boolean eliminarTrabajador(int id){
        this.conexion = new Conexion().getConexion();
        boolean fueEliminado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("delete from tbl_trabajador where id_trabajador = ?");
            stmt.setInt(1, id);
            fueEliminado =(stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return fueEliminado; 
    }
    
    public boolean modificarTrabajador(Trabajador trabajador){
        this.conexion = new Conexion().getConexion();
        boolean fueModificado= false;
        
        try {
            String sql = "update tbl_trabajador set fecha_contratacion = ?, rut =?, digito_verificador = ? , nombre = ?, apellido_paterno = ? , apellido_materno = ?, direccion = ?, correo = ?, telefono = ? where id_trabajador = ?";
            PreparedStatement stmt= this.conexion.prepareStatement(sql);
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(trabajador.getFechaContrato()));    
            stmt.setInt(2, trabajador.getRutT());
            stmt.setString(3, trabajador.getDigitoVerificadorT());
            stmt.setString(4, trabajador.getNombreT());
            stmt.setString(5, trabajador.getApellido_paternoT());
            stmt.setString(6, trabajador.getApellido_maternoT());
            stmt.setString(7, trabajador.getDireccionT());
            stmt.setString(8, trabajador.getCorreoT());
            stmt.setInt(9, trabajador.getTelefonoT());
            stmt.setInt(10, trabajador.getId_trabajador());
            
            fueModificado = (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return fueModificado;
    }
    
    
}
