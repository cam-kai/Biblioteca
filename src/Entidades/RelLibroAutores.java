/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author camve
 */
public class RelLibroAutores {
    private int id_rel_libro_autores;
    private int id_libro;
    private int id_autores;

    public RelLibroAutores() {
    }

    public int getId_rel_libro_autores() {
        return id_rel_libro_autores;
    }

    public void setId_rel_libro_autores(int id_rel_libro_autores) {
        this.id_rel_libro_autores = id_rel_libro_autores;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_autores() {
        return id_autores;
    }

    public void setId_autores(int id_autores) {
        this.id_autores = id_autores;
    }

    
}
