/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.MedioDePago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class MedioPagoDAO {
    private Connection conexion;
    
    public MedioPagoDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    
    public ArrayList<MedioDePago> listarMediosDePago(){
        ArrayList<MedioDePago> medios = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Select * from tbl_medio_pago ; ");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MedioDePago medio = new MedioDePago ();
                medio.setId_medio_de_pago(rs.getInt("id_medio_pago"));
                medio.setMedioDePago(rs.getString("medio_pago"));
                medios.add(medio);
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
        return medios;
    }
}
