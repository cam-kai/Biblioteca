/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Entidades.Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author camve
 */
public class LibrosDAO {
   private Connection conexion;
   
   public LibrosDAO(){
       this.conexion = new Conexion().getConexion();
   }
   
   public boolean agregarLibro(Libro libro){
       boolean fueAgregado  =false;
       
       try {
           PreparedStatement stmt = this.conexion.prepareStatement("insert into tbl_libro(numero_de_serie, titulo, numero_paginas, precio_referencial, id_estado, id_editorial, anio_publicacion) values(?,?,?,?,?,?,?);");
           stmt.setInt(1, libro.getNumeroSerie());
           stmt.setString(2, libro.getTitulo());
           stmt.setInt(3, libro.getNumeroPaginas());
           stmt.setInt(4, libro.getPrecioReferencial());
           stmt.setInt(5, libro.getEstado().getId_estado());
           stmt.setInt(6, libro.getEditorial().getId_editorial());
           stmt.setInt(7, libro.getAnio_publicacion());
           fueAgregado = (stmt.executeUpdate()>0);
       } catch (Exception e) {
       }
       
       return fueAgregado;
   }
}
