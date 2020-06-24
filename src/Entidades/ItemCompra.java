/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Utilidades.IStringConvertible;

/**
 *
 * @author camila
 */
public class ItemCompra implements IStringConvertible {
    private int id_libro;
    private int cantidad;
    private int precioUnitario;
    private int total;

    public ItemCompra() {
    }

    
    
   
    
    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public String getDataField() {
        return Integer.toString(this.id_libro)+" " +Integer.toString(this.cantidad)+" " + Integer.toString(this.precioUnitario)+" " + Integer.toString(this.total);
    }

}
