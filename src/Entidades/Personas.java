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
public class Personas {
    private int rut;
    private char digitoVerificador;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    ArrayList<Correo> correo= new ArrayList<>();
    ArrayList<Telefono> telefono = new ArrayList<>();

    public Personas() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    public ArrayList<Correo> getCorreo() {
        return correo;
    }

    public void setCorreo(ArrayList<Correo> correo) {
        this.correo = correo;
    }

    public ArrayList<Telefono> getTelefono() {
        return telefono;
    }

    public void setTelefono(ArrayList<Telefono> telefono) {
        this.telefono = telefono;
    }

    
    
    
}
