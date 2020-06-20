/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Autores;
import Entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camila
 */
public class RelLibroAutorDAO {
    private Connection conexion;
    
    public RelLibroAutorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarLibroAutor(Libro libro, Autores autor){
        boolean fueAgregado= false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_rel_libro_autores(id_libro,id_autores) values(?,?);");
            stmt.setInt(1, libro.getId_libro());
            stmt.setInt(2, autor.getId_autores());
            fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregado;
    }
    
}
