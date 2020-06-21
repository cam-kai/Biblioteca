/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Idiomas;
import Entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camila
 */
public class RelLibroIdiomaDAO {
    private Connection conexion;
    
    public RelLibroIdiomaDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarRelLibroIdioma(Libro libro, Idiomas idioma){
        boolean fueAgregado = false;
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("insert into tbl_rel_libro_idiomas(id_idiomas, id_libro ) values(?,?);");
            stmt.setInt(1, idioma.getId_idiomas());
            stmt.setInt(2, libro.getId_libro());
            fueAgregado= (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
        }
        return fueAgregado;
    }
}
