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
public class Idiomas implements IStringConvertible {
    private int id_idiomas;
    private String idioma;
    private ArrayList<Libro> libro = new ArrayList<>();

    public Idiomas() {
    }

    public int getId_idiomas() {
        return id_idiomas;
    }

    public void setId_idiomas(int id_idiomas) {
        this.id_idiomas = id_idiomas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    @Override
    public String getDataField() {
        return this.idioma;
    }
    
    
}
