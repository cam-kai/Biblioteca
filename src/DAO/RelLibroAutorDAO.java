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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camila
 */
public class RelLibroAutorDAO {
    private Connection conexion;
    
    public RelLibroAutorDAO(){
        
    }
    
    public boolean agregarLibroAutor(Libro libro, int id){
        this.conexion = new Conexion().getConexion();
        boolean fueAgregado= false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_rel_libro_autores(id_libro,id_autores) values(?,?);");
            stmt.setInt(1, libro.getId_libro());
            stmt.setInt(2, id);
            fueAgregado = (stmt.executeUpdate()>0);
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
    
}
