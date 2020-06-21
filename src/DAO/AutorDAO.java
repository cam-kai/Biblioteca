/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Autores;
import Utilidades.SuperList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class AutorDAO {
    private Connection conexion;
    
    public AutorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarAutor(Autores autor){
        boolean fueAgregado =  false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_autores(nombre, apellido_paterno, apellido_materno) values(?,?,?);");
            stmt.setString(1, autor.getNombre());
            stmt.setString(2, autor.getApellidoPaterno());
            stmt.setString(3, autor.getApellidoMaterno());
            fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return fueAgregado;
    }
    
    public SuperList<Autores> listarAutores(){
        SuperList<Autores> autores = new SuperList<>();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_autores ;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Autores autor = new Autores();
                autor.setId_autores(rs.getInt("id_autores"));
                autor.setNombre(rs.getString("nombre"));
                autor.setApellidoPaterno(rs.getString("apellido_paterno"));
                autor.setApellidoMaterno(rs.getString("apellido_materno"));
                autores.add(autor);
            }
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return autores;
    }
    
    public Autores buscarPorId(int id){
        Autores autor = new Autores();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_autores where id_autores = ?;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                autor.setId_autores(rs.getInt("id_autores"));
                autor.setNombre(rs.getString("nombre"));
                autor.setApellidoPaterno(rs.getString("apellido_paterno"));
                autor.setApellidoMaterno(rs.getString("apellido_materno"));
                return autor;
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return null;
    }
    
}
