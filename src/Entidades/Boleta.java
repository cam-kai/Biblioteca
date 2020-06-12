/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author camve
 */
public class Boleta {
    private int id_boleta;
    private int precioNeto;
    private int precioConIVA;
    private int costoConIVA;
    private Date fechaBoleta;
    private Time horaBoleta;
    private MedioDePago medio_de_pago;

    public Boleta() {
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
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

    public Date getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(Date fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public Time getHoraBoleta() {
        return horaBoleta;
    }

    public void setHoraBoleta(Time horaBoleta) {
        this.horaBoleta = horaBoleta;
    }

    public MedioDePago getMedio_de_pago() {
        return medio_de_pago;
    }

    public void setMedio_de_pago(MedioDePago medio_de_pago) {
        this.medio_de_pago = medio_de_pago;
    }
    
    
}
