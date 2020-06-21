/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Idiomas;
import Utilidades.SuperList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class IdiomasDAO {
    private Connection conexion;
    
    public IdiomasDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarIdioma(Idiomas idioma){
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_idiomas(idioma) values(?);");
            stmt.setString(1, idioma.getIdioma());
            fueAgregado=(stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
                
        return fueAgregado;
    }
    
    public SuperList<Idiomas> listarIdiomas(){
        SuperList<Idiomas> idiomas = new SuperList<>();
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("select * from tbl_idiomas ;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Idiomas idioma = new Idiomas();
                idioma.setId_idiomas(rs.getInt("id_idiomas"));
                idioma.setIdioma(rs.getString("idioma"));
                idiomas.add(idioma);
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return idiomas;
    }
    
    public Idiomas buscarPorId(int id){
        Idiomas idioma = new Idiomas();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_idiomas where id_idiomas = ? ;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                idioma.setId_idiomas(rs.getInt("id_idiomas"));
                idioma.setIdioma(rs.getString("idioma"));
                return idioma;
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return null;
    }
}
