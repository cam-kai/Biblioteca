/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camila
 */
public class FacturaDAO {
    private Connection conexion;
    
    public FacturaDAO(){
        this.conexion= new Conexion().getConexion();
    }
    
    public boolean fueAgregado(Factura factura){
        boolean fueAgregado = false;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_factura(precio_neto, precio_con_IVA, costo_con_IVA, fecha_de_compra, hora_de_compra, id_medio_de_pago) values(?,?,?,?,?,?);");
            stmt.setInt(1, factura.getPrecioNeto());
            stmt.setInt(2, factura.getPrecioConIVA());
            stmt.setInt(3, factura.getCostoConIVA());
            stmt.setDate(4, factura.getFechaDeCompra());
            stmt.setTime(5, factura.getHoraDeCompra());
            stmt.setInt(6, factura.getMedio_de_pago().getId_medio_de_pago());
            
            fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregado;
    }
            
}
