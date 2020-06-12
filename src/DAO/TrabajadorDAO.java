/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author camve
 */
public class TrabajadorDAO {
    private Connection conexion;
    
    public TrabajadorDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarTrabajador(Trabajador trabajador){
        int filas_afectadas = 0;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_trabajador(fecha_contratacion,rut) values (?,?)");
            stmt.setString(1, new SimpleDateFormat("dd/MM/yyyy").format(trabajador.getFechaContrato()));
            stmt.setInt(2, trabajador.getRut());
            filas_afectadas = stmt.executeUpdate();
        } catch (Exception e) {
        }
        return (filas_afectadas >0);
    }
    
    
}
