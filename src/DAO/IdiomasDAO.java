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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camila
 */
public class IdiomasDAO {
    private Connection conexion;
    
    public IdiomasDAO(){
        
    }
    
    public boolean agregarIdioma(Idiomas idioma){
        this.conexion = new Conexion().getConexion();
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_idiomas(idioma) values(?);");
            stmt.setString(1, idioma.getIdioma());
            fueAgregado=(stmt.executeUpdate()>0);
            
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
    
    public SuperList<Idiomas> listarIdiomas(){
        this.conexion = new Conexion().getConexion();
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
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return idiomas;
    }
    
    public Idiomas buscarPorId(int id){
        this.conexion = new Conexion().getConexion();
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
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null;
    }
}
