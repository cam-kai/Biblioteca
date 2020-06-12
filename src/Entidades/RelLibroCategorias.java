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
public class RelLibroCategorias {
    private int id_rel_libro_categorias;
    private int id_libro;
    private int id_categorias;

    public RelLibroCategorias() {
    }

    public int getId_rel_libro_categorias() {
        return id_rel_libro_categorias;
    }

    public void setId_rel_libro_categorias(int id_rel_libro_categorias) {
        this.id_rel_libro_categorias = id_rel_libro_categorias;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(int id_categorias) {
        this.id_categorias = id_categorias;
    }
    
    
}
