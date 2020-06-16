/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Personas;
import Entidades.Trabajador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author camve
 */
public class TrabajadorDAO {
    private Connection conexion;
    
    public TrabajadorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarTrabajador(Trabajador trabajador){
        boolean filas_afectadas = false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_trabajador(fecha_contratacion,rut) values (?,?);");
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(trabajador.getFechaContrato()));    
            stmt.setInt(2, trabajador.getRut());
            filas_afectadas = (stmt.executeUpdate()==1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return filas_afectadas;
    }
    
    public ArrayList<Trabajador> listarTrabajador(){
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try {
            String sql= "SELECT t.id_trabajador, concat(p.rut,\" - \" , p.digito_verificador) as rut, p.nombre, p.apellido_paterno, p.apellido_materno, t.fecha_contratacion, p.direccion, p.correo, p.telefono \n" +
                        " FROM tbl_persona p" + " INNER JOIN tbl_trabajador t ON p.rut = t.rut" +" ORDER BY t.id_trabajador ;";
            PreparedStatement stmt =this.conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trabajador(rs.getInt("id_trabajador"));
                String rut= rs.getString("rut");
                trabajador.setRut(Integer.parseInt(rut.substring(0,8)));
                trabajador.setDigitoVerificador(rut.charAt(11));
                trabajador.setNombre(rs.getString("nombre"));
                trabajador.setApellidoPaterno(rs.getString("apellido_paterno"));
                trabajador.setApellidoMaterno(rs.getString("apellido_materno"));
                trabajador.setFechaContrato(rs.getDate("fecha_contratacion"));
                trabajador.setDireccion(rs.getString("direccion"));
                trabajador.setCorreo(rs.getString("correo"));
                trabajador.setTelefono(rs.getInt("telefono"));
                trabajadores.add(trabajador);
            }
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        
        return trabajadores;
    }
    
    public Trabajador buscarPorId(int id){
        
        try {
            String sql= "SELECT t.id_trabajador, concat(p.rut,\" - \" , p.digito_verificador) as rut, p.nombre, p.apellido_paterno, p.apellido_materno, t.fecha_contratacion, p.direccion\n" +
                        " FROM tbl_persona p" + " INNER JOIN tbl_trabajador t ON p.rut = t.rut" +" where t.id_trabajador=? ;";
            PreparedStatement stmt =this.conexion.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trabajador(rs.getInt("id_trabajador"));
                String rut= rs.getString("rut");
                trabajador.setRut(Integer.parseInt(rut.substring(0,8)));
                trabajador.setDigitoVerificador(rut.charAt(11));
                trabajador.setNombre(rs.getString("nombre"));
                trabajador.setApellidoPaterno(rs.getString("apellido_paterno"));
                trabajador.setApellidoMaterno(rs.getString("apellido_materno"));
                trabajador.setFechaContrato(rs.getDate("fecha_contratacion"));
                trabajador.setDireccion(rs.getString("direccion"));
                return trabajador;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean eliminarTrabajador(int id){
        boolean fueEliminado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("delete from tbl_trabajador where id_trabajador = ?");
            stmt.setInt(1, id);
            fueEliminado =(stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        return fueEliminado; 
    }
    
    public boolean modificarTrabajador(Trabajador trabajador){
        boolean fueModificado= false;
        
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("update tbl_trabajador set fecha_contratacion = ?, rut =? where id_trabajador = ?");
            stmt.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(trabajador.getFechaContrato()));    
            stmt.setInt(2, trabajador.getRut());
            stmt.setInt(3, trabajador.getId_trabajador());
            
            fueModificado = (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            fueModificado = false;
        }
        
        return fueModificado;
    }
    
    
}
