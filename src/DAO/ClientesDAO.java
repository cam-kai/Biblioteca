/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author camve
 */
public class ClientesDAO {
    private Connection conexion;
    
    public ClientesDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarClientes(Cliente cliente){
        boolean filas_afectadas = false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_clientes(fecha_de_nacimiento,rut) values(?,?);");
            stmt.setString(1, new SimpleDateFormat("yyyy/MM/dd").format(cliente.getFechaNacimiento()));
            stmt.setInt(2, cliente.getRut());
            filas_afectadas = (stmt.executeUpdate()==1);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return filas_afectadas;
    }
    
    public ArrayList<Cliente> listarTodo(){
        ArrayList<Cliente> clientes =  new ArrayList<>();
        
        try {
            String sql = "SELECT c.id_clientes, concat(p.rut,\" - \" , p.digito_verificador) as rut, p.nombre, p.apellido_paterno, p.apellido_materno, c.fecha_de_nacimiento, p.direccion , p.correo, p.telefono \n" +
                        " FROM tbl_persona p" + " INNER JOIN tbl_clientes c ON p.rut = c.rut" +" ORDER BY c.id_clientes ;";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_clientes"));
                String rut= rs.getString("rut");
                cliente.setRut(Integer.parseInt(rut.substring(0,8)));
                cliente.setDigitoVerificador(rut.charAt(11));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoPaterno(rs.getString("apellido_paterno"));
                cliente.setApellidoMaterno(rs.getString("apellido_materno"));
                cliente.setFechaNacimiento(rs.getDate("fecha_de_nacimiento"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getInt("telefono"));
                clientes.add(cliente);
                               
            }
            
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
        }
        
        
        return clientes;
    }
    
    public Cliente buscarPorId(int id){
        try {
            String sql = "SELECT c.id_clientes, concat(p.rut,\" - \" , p.digito_verificador) as rut, p.nombre, p.apellido_paterno, p.apellido_materno, c.fecha_de_nacimiento, p.direccion\n" +
                        " FROM tbl_persona p" + " INNER JOIN tbl_clientes c ON p.rut = c.rut" +" where c.id_clientes  = ?;";
            PreparedStatement stmt = this.conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_clientes"));
                String rut= rs.getString("rut");
                cliente.setRut(Integer.parseInt(rut.substring(0,8)));
                cliente.setDigitoVerificador(rut.charAt(11));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoPaterno(rs.getString("apellido_paterno"));
                cliente.setApellidoMaterno(rs.getString("apellido_materno"));
                cliente.setFechaNacimiento(rs.getDate("fecha_de_nacimiento"));
                cliente.setDireccion(rs.getString("direccion"));
                return cliente;
                
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    public boolean eliminarClientes(int id){
        boolean fueEliminado = false;
        
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("delete from tbl_clientes where id_clientes = ?;");
            stmt.setInt(1, id);
            fueEliminado= (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
            fueEliminado= false;
        }
        
        return fueEliminado;
    }
    
    public boolean modificarClientes(Cliente cliente){
    
        boolean fueModificado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("update tbl_clientes set fecha_de_nacimiento =?, rut=? where id_clientes = ?; ");
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(cliente.getFechaNacimiento()));
            stmt.setInt(2, cliente.getRut());
            stmt.setInt(3, cliente.getId_cliente());
            fueModificado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return fueModificado;
    }
    
}
