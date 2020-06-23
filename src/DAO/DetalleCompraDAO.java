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

/**
 *
 * @author camila
 */
public class DetalleCompraDAO {
    private Connection conexion;
    
    public DetalleCompraDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarDetalleCompra(DetalleCompra detalleCompra){
        boolean fueAgregado = false;
        
        try {
           PreparedStatement stmt = this.conexion.prepareStatement("Insert into tbl_detalle_compra(id_compra, id_libro) values (?,?); ");
           stmt.setInt(1, detalleCompra.getIdCompra());
           stmt.setInt(2, detalleCompra.getIdLibro());
           fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
        }
        
        return fueAgregado;
    }
}
