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
public class Direcciones {
    private int id_direccion;
    private String calle;
    private int numero;
    private String villa;
    private Comunas comuna;
    
    public Direcciones() {
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVilla() {
        return villa;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

    public Comunas getComuna() {
        return comuna;
    }

    public void setComuna(Comunas comuna) {
        this.comuna = comuna;
    }

    
    
}
