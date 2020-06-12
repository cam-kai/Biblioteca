/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

/**
 *
 * @author camve
 */
public class ClientesDAO {
    private Connection conexion;
    
    public ClientesDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public boolean agregarClientes(Cliente cliente){
        int filas_afectadas = 0;
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_clientes(fecha_nacimiento,rut) values (?,?)");
            stmt.setString(1, new SimpleDateFormat("yyyy/MM/dd").format(cliente.getFechaNacimiento()));
            stmt.setInt(2, cliente.getRut());
            filas_afectadas = stmt.executeUpdate();
        } catch (Exception e) {
        }
        return (filas_afectadas >0);
    }
    
}
