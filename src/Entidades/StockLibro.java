/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author camila
 */
public class StockLibro {
    private int id_stock ;
    private int id_libro;
    private int stock_libro;

    public StockLibro() {
    }

    
    public StockLibro(int id_stock, int id_libro, int stock_libro) {
        this.id_stock = id_stock;
        this.id_libro = id_libro;
        this.stock_libro = stock_libro;
    }

    public int getStock_libro() {
        return stock_libro;
    }

    public void setStock_libro(int stock_libro) {
        this.stock_libro = stock_libro;
    }

    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }
    
    
    
}
