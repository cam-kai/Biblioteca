/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Utilidades.IStringConvertible;
import java.util.ArrayList;

/**
 *
 * @author camve
 */
public class Autores implements IStringConvertible{
    private int id_autores;
    private String Nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private ArrayList<Libro> libro = new ArrayList<>();

    public Autores() {
    }

    public int getId_autores() {
        return id_autores;
    }

    public void setId_autores(int id_autores) {
        this.id_autores = id_autores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    @Override
    public String getDataField() {
        return this.Nombre +" "+ this.apellidoPaterno +" "+ this.apellidoMaterno; 
    }
    
    
    
}
