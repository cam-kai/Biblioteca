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
public class Distribuidores {
    private int id_distribuidores;
    private int rut ;
    private char digitoVerificador;
    private String nombreEmpresa;
    private int añosDeServicio;
    private String direccion;
    private int telefono;

    public Distribuidores() {
    }

    public int getId_distribuidores() {
        return id_distribuidores;
    }

    public void setId_distribuidores(int id_distribuidores) {
        this.id_distribuidores = id_distribuidores;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(char digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getAñosDeServicio() {
        return añosDeServicio;
    }

    public void setAñosDeServicio(int añosDeServicio) {
        this.añosDeServicio = añosDeServicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    

    public void setDireccion(ArrayList<Direcciones> direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
