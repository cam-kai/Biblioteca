/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camila
 */
public class RelLibroCategoriaDAO {
    private Connection conexion;
    
    public RelLibroCategoriaDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarRelLibroCategoria(Libro libro , int id){
        boolean fueAgregada = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Insert into tbl_rel_libro_categoria(id_libro, id_categoria) values(?,?);");
            stmt.setInt(1, libro.getId_libro());
            stmt.setInt(2, id);
            fueAgregada= (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregada;
        
    }
}
