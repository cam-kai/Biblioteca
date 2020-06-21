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
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class CategoriaDAO {
    private Connection conexion;
    
    public CategoriaDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarCategoria(Categorias categoria){
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_categoria(categoria) values(?);");
            stmt.setString(1, categoria.getCategoria());
            fueAgregado = (stmt.executeUpdate()>1);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        
        return fueAgregado;
    }
    
    public SuperList<Categorias> listarCategorias(){
        SuperList<Categorias> categorias = new SuperList<>();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_categoria;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Categorias categoria = new Categorias ();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setCategoria(rs.getString("categoria"));
                categorias.add(categoria);
            }
        } catch (Exception e) {
        }
        
        return categorias;
    }
    
    public Categorias buscarPorNombre(String cate){
        Categorias categoria = new Categorias();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Select * from tbl_categoria where categoria = ? ;");
            stmt.setString(1, cate);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setCategoria(rs.getString("categoria"));
            }
            return categoria;
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return null ;
        
    }
    
}
