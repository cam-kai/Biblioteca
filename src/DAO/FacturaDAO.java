/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Factura;
import Entidades.MedioDePago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_factura(precio_neto, precio_con_IVA, costo_con_IVA, fecha_de_compra, hora_de_compra, id_medio_de_pago, numero_factura) values(?,?,?,?,?,?,?);");
            stmt.setInt(1, factura.getPrecioNeto());
            stmt.setInt(2, factura.getPrecioConIVA());
            stmt.setInt(3, factura.getCostoConIVA());
            stmt.setString(4, factura.getFechaDeCompra());
            stmt.setString(5, factura.getHoraDeCompra());
            stmt.setInt(6, factura.getMedio_de_pago().getId_medio_de_pago());
            stmt.setInt(7, factura.getNumeroFactura());
            fueAgregado = (stmt.executeUpdate()>0);
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregado;
    }
    
    public Factura buscarUltimo(){
        Factura factura = new Factura();
        try {
            PreparedStatement stmt =  this.conexion.prepareStatement("select * from tbl_factura order by id_factura desc limit 1 ; ");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                factura.setId_factura(rs.getInt("id_factura"));
                factura.setPrecioNeto(rs.getInt("precio_neto"));
                factura.setPrecioConIVA(rs.getInt("precio_con_IVA"));
                factura.setCostoConIVA(rs.getInt("costo_con_IVA"));
                factura.setFechaDeCompra(String.valueOf(rs.getDate("fecha_de_compra")));
                factura.setHoraDeCompra(String.valueOf(rs.getTime("hora_de_compra")));
                MedioDePago medio = new MedioDePago();
                medio.setId_medio_de_pago(rs.getInt("id_medio_de_pago"));
                factura.setMedio_de_pago(medio);
                factura.setNumeroFactura(rs.getInt("numero_factura"));
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return factura;
    }
            
}
