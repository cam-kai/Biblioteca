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
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class EditorialDAO {
    private Connection conexion;
    
    public EditorialDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarEditorial(Editorial editorial){
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt= this.conexion.prepareStatement("insert into tbl_editorial(editorial) values(?);");
            stmt.setString(1, editorial.getEditorial());
            fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        
        return fueAgregado;
    }
    
    public ArrayList<Editorial> listarEditoriales(){
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
        }
        
        return editoriales;
    }
    
    public Editorial buscarPorId(int id){
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
        }
        return editorial;
    }
    
    public Editorial buscarPorEditorial(String edi){
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
        }
        return editorial;
    }
}
