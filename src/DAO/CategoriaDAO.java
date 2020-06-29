/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Categorias;
import Utilidades.SuperList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camila
 */
public class CategoriaDAO {
    private Connection conexion;
    
    public CategoriaDAO(){
        
    }
    
    public boolean agregarCategoria(Categorias categoria){
        this.conexion = new Conexion().getConexion();
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_categoria(categoria) values(?);");
            stmt.setString(1, categoria.getCategoria());
            fueAgregado = (stmt.executeUpdate()>1);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return fueAgregado;
    }
    
    public SuperList<Categorias> listarCategorias(){
        Connection conn =  new Conexion().getConexion();
        SuperList<Categorias> categorias = new SuperList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from tbl_categoria;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Categorias categoria = new Categorias ();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setCategoria(rs.getString("categoria"));
                categorias.add(categoria);
            }
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return categorias;
    }
    
    public Categorias buscarPorNombre(String cate){
        Connection conn = new Conexion().getConexion();
        Categorias categoria = new Categorias();
        try {
            PreparedStatement stmt = conn.prepareStatement("Select * from tbl_categoria where categoria = ? ;");
            stmt.setString(1, cate);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setCategoria(rs.getString("categoria"));
            }
            return categoria;
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null ;
        
    }
    
}
