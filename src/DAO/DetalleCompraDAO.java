/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camila
 */
public class DetalleCompraDAO {
    private Connection conexion;
    
    public DetalleCompraDAO(){
        
    }
    
    public boolean agregarDetalleCompra(DetalleCompra detalleCompra){
        this.conexion = new Conexion().getConexion();
        boolean fueAgregado = false;
        
        try {
           PreparedStatement stmt = this.conexion.prepareStatement("Insert into tbl_detalle_compra(id_compra, id_libro) values (?,?); ");
           stmt.setInt(1, detalleCompra.getIdCompra());
           stmt.setInt(2, detalleCompra.getIdLibro());
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
