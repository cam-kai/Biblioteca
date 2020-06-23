/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camila
 */
public class CompraDAO {
    private Connection conexion;
    
    public CompraDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    
    public boolean agregarCompra(Compra compra){
        boolean fueAgregada = false;
        
        try {
            
            PreparedStatement stmt = this.conexion.prepareStatement("Insert into tbl_compra(id_factura, id_distribuidor) values(?,?);");
            stmt.setInt(1, compra.getFactura().getId_factura());
            stmt.setInt(2, compra.getDistribuidor().getId_distribuidores());
            fueAgregada = (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregada;
    }
}
