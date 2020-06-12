/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author camve
 */
public class Arriendo {
    private int id_arriendo;
    private int costoTotal;
    private Date fechaDeArriendo;
    private Date fechaDevolucionEstimada;
    private Date fechaEntregaReal;
    private int diasRetraso;
    private int multa;
    private int costoArriendo;
    private Trabajador trabajador;
    private Cliente cliente;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Arriendo() {
    }

    public int getId_arriendo() {
        return id_arriendo;
    }

    public void setId_arriendo(int id_arriendo) {
        this.id_arriendo = id_arriendo;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaDeArriendo() {
        return fechaDeArriendo;
    }

    public void setFechaDeArriendo(Date fechaDeArriendo) {
        this.fechaDeArriendo = fechaDeArriendo;
    }

    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public Date getFechaEntregaReal() {
        return fechaEntregaReal;
    }

    public void setFechaEntregaReal(Date fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(int costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
}
