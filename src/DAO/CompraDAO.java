/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Compra;
import Entidades.Distribuidores;
import Entidades.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author camila
 */
public class CompraDAO {
    private Connection conexion;
    
    public CompraDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    
    public boolean agregarCompra(int idD, int idF){
        boolean fueAgregada = false;
        
        try {
            
            PreparedStatement stmt = this.conexion.prepareStatement("Insert into tbl_compra(id_factura, id_distribuidores) values(?,?);");
            stmt.setInt(1, idF);
            stmt.setInt(2, idD);
            fueAgregada = (stmt.executeUpdate()>0);
            
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return fueAgregada;
    }
    public Compra buscarUltimo(){
        Compra compra = new Compra();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Select * from tbl_compra order by id_compra desc limit 1;");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                compra.setId_compra(rs.getInt("id_compra"));
                Factura factura =new Factura();
                factura.setId_factura(rs.getInt("id_factura"));
                compra.setFactura(factura);
                Distribuidores distribuidor = new Distribuidores();
                distribuidor.setId_distribuidores(rs.getInt("id_distribuidores"));
                compra.setDistribuidor(distribuidor);
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return compra;
    }
}
