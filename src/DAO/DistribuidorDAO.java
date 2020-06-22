/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Direcciones;
import Entidades.Distribuidores;
import Entidades.Telefono;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class DistribuidorDAO {
    
    private Connection conexion;
    
    public DistribuidorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarDistribuidor(Distribuidores distribuidor){
        int fueAgregado = 0;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_distribuidores(rut, digito_verificador, nombre_empresa, años_de_servicio, direccion, telefono, correo) values(?,?,?,?,?,?,?);");
            stmt.setInt(1, distribuidor.getRut());
            String dv = String.valueOf(distribuidor.getDigitoVerificador());
            stmt.setString(2, dv);
            stmt.setString(3, distribuidor.getNombreEmpresa());
            stmt.setInt(4, distribuidor.getAñosDeServicio());
            stmt.setString(5, distribuidor.getDireccion());
            stmt.setInt(6, distribuidor.getTelefono());
            stmt.setString(7, distribuidor.getCorreo());
            
            fueAgregado = stmt.executeUpdate();
            
        } catch (Exception e) {
            
        }
        return (fueAgregado > 0);
    }
    
    public ArrayList<Distribuidores> listarDistribuidores (){
        ArrayList<Distribuidores> distribuidores = new ArrayList<>();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_distribuidores;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Distribuidores distribuidor = new Distribuidores () ;
                distribuidor.setId_distribuidores(rs.getInt("id_distribuidores"));
                distribuidor.setRut(rs.getInt("rut"));
                distribuidor.setDigitoVerificador(rs.getString("digito_verificador").charAt(0));
                distribuidor.setNombreEmpresa(rs.getString("nombre_empresa"));
                distribuidor.setAñosDeServicio(rs.getInt("años_de_servicio"));
                distribuidor.setDireccion(rs.getString("direccion"));
                distribuidor.setTelefono(rs.getInt("telefono"));
                distribuidor.setCorreo(rs.getString("correo"));
                distribuidores.add(distribuidor);
            }
        } catch (Exception e) {
        }
        
        return distribuidores;
    }
    
    public Distribuidores buscarPorId(int idABuscar){
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_distribuidores where id_distribuidores = ?;");
            stmt.setInt(1, idABuscar);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Distribuidores distribuidor = new Distribuidores();
                distribuidor.setId_distribuidores(rs.getInt("id_distribuidores"));
                distribuidor.setRut(rs.getInt("rut"));
                distribuidor.setDigitoVerificador(rs.getString("digito_verificador").charAt(0));
                distribuidor.setNombreEmpresa(rs.getString("nombre_empresa"));
                distribuidor.setAñosDeServicio(rs.getInt("años_de_servicio"));
                distribuidor.setDireccion(rs.getString("direccion"));
                distribuidor.setTelefono(rs.getInt("telefono"));
                distribuidor.setCorreo(rs.getString("correo"));
                return distribuidor;
            }
        } catch (Exception e) {
            
        }
        return null;
    }
    
    
        
    public Distribuidores buscarPorNombre(String nombre){
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_distribuidores where nombre_empresa = ?;");
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Distribuidores distribuidor = new Distribuidores();
                distribuidor.setId_distribuidores(rs.getInt("id_distribuidores"));
                distribuidor.setRut(rs.getInt("rut"));
                distribuidor.setDigitoVerificador(rs.getString("digito_verificador").charAt(0));
                distribuidor.setNombreEmpresa(rs.getString("nombre_empresa"));
                distribuidor.setAñosDeServicio(rs.getInt("años_de_servicio"));
                distribuidor.setDireccion(rs.getString("direccion"));
                distribuidor.setTelefono(rs.getInt("telefono"));
                distribuidor.setCorreo(rs.getString("correo"));
                return distribuidor;
            }
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public boolean eliminarDistribuidores(int idABuscar){
        
        boolean fueEliminado = false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("delete from tbl_distribuidores where id_distribuidores = ?;");
            stmt.setInt(1, idABuscar);
            fueEliminado= (stmt.executeUpdate()>0);
        } catch (Exception e) {
            fueEliminado = false;
        }
        return fueEliminado;
    }
    
    public boolean actualizarDistribuidores(Distribuidores distribuidor){
        
        boolean fueActualizado =false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("update tbl_distribuidores set rut=?,digito_verificador=?, nombre_empresa=? ,años_de_servicio=?,direccion = ?, telefono=?, correo =? where id_distribuidores=?; ");
            stmt.setInt(1, distribuidor.getRut());
            stmt.setString(2, String.valueOf(distribuidor.getDigitoVerificador()));
            stmt.setString(3, distribuidor.getNombreEmpresa());
            stmt.setInt(4, distribuidor.getAñosDeServicio());
            stmt.setString(5, distribuidor.getDireccion());
            stmt.setInt(6, distribuidor.getTelefono());
            stmt.setString(7, distribuidor.getCorreo());
            stmt.setInt(8, distribuidor.getId_distribuidores());
           
            
            fueActualizado= (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            fueActualizado= false;
        }
        
        return fueActualizado;
    }
    
            
    
}
