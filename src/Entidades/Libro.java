/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author camve
 */
public class Libro {
    private int id_libro;
    private int numeroSerie;
    private String titulo;
    private int numeroPaginas;
    private int precioReferencial;
    private Estado estado;
    private Editorial editorial;
    private int anio_publicacion;
    private ArrayList<Idiomas> idiomas = new ArrayList<>();
    private ArrayList<Categorias> categorias = new ArrayList<>();
    private ArrayList<Autores> autores= new ArrayList<>();
    private StockLibro stock;
    
    
    public Libro() {
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPrecioReferencial() {
        return precioReferencial;
    }

    public void setPrecioReferencial(int precioReferencial) {
        this.precioReferencial = precioReferencial;
    }

    

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public ArrayList<Idiomas> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idiomas> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<Categorias> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categorias> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Autores> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autores> autores) {
        this.autores = autores;
    }

    public StockLibro getStock() {
        return stock;
    }

    public void setStock(StockLibro stock) {
        this.stock = stock;
    }
    
    
    
}
