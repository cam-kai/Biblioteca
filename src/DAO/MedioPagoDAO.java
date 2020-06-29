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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camila
 */
public class MedioPagoDAO {
    private Connection conexion;
    
    public MedioPagoDAO(){
        
    }
    
    
    public ArrayList<MedioDePago> listarMediosDePago(){
        this.conexion = new Conexion().getConexion();
        ArrayList<MedioDePago> medios = new ArrayList<>();
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Select * from tbl_medio_pago ; ");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MedioDePago medio = new MedioDePago ();
                medio.setId_medio_de_pago(rs.getInt("id_medio_de_pago"));
                medio.setMedioDePago(rs.getString("medio_de_pago"));
                medios.add(medio);
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }finally{
            try {
                this.conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
        return medios;
    }
}
