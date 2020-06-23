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
            PreparedStatement stmt = this.conexion.prepareStatement("update tbl_stock_libro set id_libro=?, stock_libro =? where id_stock = ?");
            stmt.setInt(1, stockLibro.getId_libro());
            stmt.setInt(2, stockLibro.getStock_libro());
            stmt.setInt(3, stockLibro.getId_stock());
            fueModificado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        return fueModificado;
    }
}
