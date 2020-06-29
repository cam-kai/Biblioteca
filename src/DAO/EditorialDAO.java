/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Editorial;
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
public class EditorialDAO {
    private Connection conexion;
    
    public EditorialDAO(){
        
    }
    
    public boolean agregarEditorial(Editorial editorial){
        this.conexion = new Conexion().getConexion();
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("insert into tbl_editorial(editorial) values(?);");
            stmt.setString(1, editorial.getEditorial());
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
    
    public ArrayList<Editorial> listarEditoriales(){
        this.conexion = new Conexion().getConexion();
        ArrayList<Editorial> editoriales = new ArrayList<>();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_editorial;");
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                Editorial editorial = new Editorial();
                editorial.setId_editorial(rs.getInt("id_editorial"));
                editorial.setEditorial(rs.getString("editorial"));
                editoriales.add(editorial);
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
        
        return editoriales;
    }
    
    public Editorial buscarPorId(int id){
        this.conexion = new Conexion().getConexion();
        Editorial editorial = new Editorial();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_editorial where id_editorial=?;");
            stmt.setInt(1, id);
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                
                editorial.setId_editorial(rs.getInt("id_editorial"));
                editorial.setEditorial(rs.getString("editorial"));
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
        return editorial;
    }
    
    public Editorial buscarPorEditorial(String edi){
        this.conexion = new Conexion().getConexion();
        Editorial editorial = new Editorial();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_editorial where editorial=?;");
            stmt.setString(1, edi);
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                
                editorial.setId_editorial(rs.getInt("id_editorial"));
                editorial.setEditorial(rs.getString("editorial"));
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
        return editorial;
    }
}
