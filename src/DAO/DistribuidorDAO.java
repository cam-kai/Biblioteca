/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Direcciones;
import Entidades.Distribuidores;
import Entidades.Telefono;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class DistribuidorDAO {
    
    private Connection conexion;
    
    public DistribuidorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarDistribuidor(Distribuidores distribuidor){
        int fueAgregado = 0;
        
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_distribuidores (rut, digitoVerificador, nombre empresa , años de servicio, direccion , telefono ) values(?,?,?,?,?,?);");
            stmt.setInt(1, distribuidor.getRut());
            String dv = String.valueOf(distribuidor.getDigitoVerificador());
            stmt.setString(2, dv);
            stmt.setString(3, distribuidor.getNombreEmpresa());
            stmt.setInt(4, distribuidor.getAñosDeServicio());
            ArrayList<Direcciones> direccion = new ArrayList<>();
            direccion.add(distribuidor.getDireccion());
            stmt.setArray(5, (Array) direccion);
            ArrayList<Telefono> telefono = new ArrayList<>();
            telefono.add(distribuidor.getTelefono());
            stmt.setArray(6, (Array) telefono);
            
            fueAgregado = stmt.executeUpdate();
            
        } catch (Exception e) {
        }
        return (fueAgregado > 0);
    }
    
}
