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
public class Categorias implements IStringConvertible {
    private int id_categoria;
    private String categoria;
    private ArrayList<Libro> libro= new ArrayList<>();

    public Categorias() {
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    @Override
    public String getDataField() {
        return this.categoria;
    }
    
    
}
