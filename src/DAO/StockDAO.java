/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.StockLibro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author camila
 */
public class StockDAO {
    private Connection conexion;
    
    public StockDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarStock(StockLibro stockLibro){
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_stock_libro(id_libro,stock_libro) values(?,?);");
            stmt.setInt(1, stockLibro.getId_libro());
            stmt.setInt(2, stockLibro.getStock_libro());
            fueAgregado = ( stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        return fueAgregado;
    }
    
    public boolean modificarStock(StockLibro stockLibro){
        boolean fueModificado = false;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("update tbl_stock_libro set  stock_libro =? where id_libro = ?");
            //stmt.setInt(1, stockLibro.getId_libro());
            stmt.setInt(1, stockLibro.getStock_libro());
            stmt.setInt(2, stockLibro.getId_libro());
            fueModificado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        return fueModificado;
    }
    
    public StockLibro bucarPorIdLibro(int id){
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select * from tbl_stock_libro where id_libro=?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                StockLibro stock = new StockLibro();
                stock.setId_stock(rs.getInt("id_stock"));
                stock.setId_libro(rs.getInt("id_libro"));
                stock.setStock_libro(rs.getInt("stock_libro"));
                return stock;
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return null;
    }
}
