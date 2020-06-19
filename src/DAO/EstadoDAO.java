/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author camila
 */
public class EstadoDAO {
    private Connection conexion;
    
    public EstadoDAO(){
        this.conexion = new Conexion().getConexion();
    }
    
    public ArrayList<Estado> listarEstados(){
        ArrayList<Estado> estados = new ArrayList<>();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("select*from tbl_estado;");
            ResultSet rs= stmt.executeQuery();
            while(rs.next()){
                Estado estado = new Estado();
                estado.setId_estado(rs.getInt("id_estado"));
                estado.setEstado(rs.getString("estado"));
                estados.add(estado);
            }
        } catch (Exception e) {
        }
        return estados;
    }
    
    public Estado buscarPorID(int id){
        Estado estado = new Estado();
        try {
            PreparedStatement stmt = this.conexion.prepareStatement("Select * from tbl_estado where id_estado = ? ;");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                estado.setId_estado(rs.getInt("id_estado"));
                estado.setEstado(rs.getString("estado"));
            }
                
        } catch (Exception e) {
        }
        return estado;
    }
    
}
