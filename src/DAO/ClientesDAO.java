/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Cliente;
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
public class ClientesDAO {
    private Connection conexion;
    
    public ClientesDAO(){
        
    }
    
    public boolean agregarClientes(Cliente cliente){
        this.conexion = new Conexion().getConexion();
        boolean filas_afectadas = false;
        try {
            
            String sql = "insert into tbl_clientes(fecha_de_nacimiento,rut,digito_verificador,nombre,apellido_paterno,apellido_materno,direccion,correo,telefono) values(?,?,?,?,?,?,?,?,?);";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setString(1, new SimpleDateFormat("yyyy/MM/dd").format(cliente.getFechaNacimiento()));
            stmt.setInt(2, cliente.getRut());
            stmt.setString(3, cliente.getDigitoVerificador());
            stmt.setString(4, cliente.getNombre());
            stmt.setString(5, cliente.getApellido_paterno());
            stmt.setString(6, cliente.getApellido_materno());
            stmt.setString(7, cliente.getDireccion());
            stmt.setString(8, cliente.getCorreo());
            stmt.setInt(9, cliente.getTelefono());
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
    
    public ArrayList<Cliente> listarTodo(){
        this.conexion = new Conexion().getConexion();
        ArrayList<Cliente> clientes =  new ArrayList<>();
        
        try {
            String sql = "SELECT * from tbl_clientes ;";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_clientes"));
                cliente.setFechaNacimiento(rs.getDate("fecha_de_nacimiento"));
                cliente.setRut(rs.getInt("rut"));
                cliente.setDigitoVerificador(rs.getString("digito_verificador"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido_paterno(rs.getString("apellido_paterno"));
                cliente.setApellido_materno(rs.getString("apellido_materno"));                
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getInt("telefono"));
                clientes.add(cliente);
                               
            }
            
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return clientes;
    }
    
    public Cliente buscarPorId(int id){
        this.conexion = new Conexion().getConexion();
        try {
            String sql = "SELECT * from tbl_clientes where id_clientes = ?;";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_clientes"));
                cliente.setFechaNacimiento(rs.getDate("fecha_de_nacimiento"));
                cliente.setRut(rs.getInt("rut"));
                cliente.setDigitoVerificador(rs.getString("digito_verificador"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido_paterno(rs.getString("apellido_paterno"));
                cliente.setApellido_materno(rs.getString("apellido_materno"));                
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getInt("telefono"));
                return cliente;
                
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
    
    
    public Cliente buscarPorRut(int rut){
        this.conexion = new Conexion().getConexion();
        
        try {
            String sql = "SELECT * from tbl_cientes where rut = ?;";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setInt(1, rut);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_clientes"));
                cliente.setFechaNacimiento(rs.getDate("fecha_de_nacimiento"));
                cliente.setRut(rs.getInt("rut"));
                cliente.setDigitoVerificador(rs.getString("digito_verificador"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido_paterno(rs.getString("apellido_paterno"));
                cliente.setApellido_materno(rs.getString("apellido_materno"));                
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getInt("telefono"));
                return cliente;
                
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
    
    
    public boolean eliminarClientes(int id){
        this.conexion = new Conexion().getConexion();
        boolean fueEliminado = false;
        
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("delete from tbl_clientes where id_clientes = ?;");
            stmt.setInt(1, id);
            fueEliminado= (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
            fueEliminado= false;
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return fueEliminado;
    }
    
    public boolean modificarClientes(Cliente cliente){
        this.conexion = new Conexion().getConexion();
        boolean fueModificado = false;
        
        try {
            String sql = "update tbl_clientes set fecha_de_nacimiento =?, rut=?, digito_verificador = ?, nombre = ?, apellido_paterno=?, apellido_materno = ?, direccion = ?, correo =?, telefono=? where id_clientes = ?; ";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(cliente.getFechaNacimiento()));
            stmt.setInt(2, cliente.getRut());
            stmt.setString(3, cliente.getDigitoVerificador());
            stmt.setString(4, cliente.getNombre());
            stmt.setString(5, cliente.getApellido_paterno());
            stmt.setString(6, cliente.getApellido_materno());
            stmt.setString(7, cliente.getDireccion());
            stmt.setString(8, cliente.getCorreo());
            stmt.setInt(9, cliente.getTelefono());
            stmt.setInt(10, cliente.getId_cliente());
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
