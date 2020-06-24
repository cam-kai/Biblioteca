/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author camve
 */
public class Factura {
    private int id_factura;
    private int precioNeto;
    private int precioConIVA;
    private int costoConIVA;
    private String fechaDeCompra;
    private String horaDeCompra;
    private MedioDePago medio_de_pago;

    public Factura() {
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(int precioNeto) {
        this.precioNeto = precioNeto;
    }

    public int getPrecioConIVA() {
        return precioConIVA;
    }

    public void setPrecioConIVA(int precioConIVA) {
        this.precioConIVA = precioConIVA;
    }

    public int getCostoConIVA() {
        return costoConIVA;
    }

    public void setCostoConIVA(int costoConIVA) {
        this.costoConIVA = costoConIVA;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public String getHoraDeCompra() {
        return horaDeCompra;
    }

    public void setHoraDeCompra(String horaDeCompra) {
        this.horaDeCompra = horaDeCompra;
    }

    
    public MedioDePago getMedio_de_pago() {
        return medio_de_pago;
    }

    public void setMedio_de_pago(MedioDePago medio_de_pago) {
        this.medio_de_pago = medio_de_pago;
    }
    
    
}
