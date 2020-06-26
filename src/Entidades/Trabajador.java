/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author camve
 */
public class Trabajador {
    private int id_trabajador;
    private Date fechaContrato;
    private int rutT;
    private String digitoVerificadorT;
    private String nombreT;
    private String apellido_paternoT;
    private String apellido_maternoT;
    private String direccionT;
    private String correoT;
    private int telefonoT;

    public Trabajador() {
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getRutT() {
        return rutT;
    }

    public void setRutT(int rutT) {
        this.rutT = rutT;
    }

    public String getDigitoVerificadorT() {
        return digitoVerificadorT;
    }

    public void setDigitoVerificadorT(String digitoVerificadorT) {
        this.digitoVerificadorT = digitoVerificadorT;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getApellido_paternoT() {
        return apellido_paternoT;
    }

    public void setApellido_paternoT(String apellido_paternoT) {
        this.apellido_paternoT = apellido_paternoT;
    }

    public String getApellido_maternoT() {
        return apellido_maternoT;
    }

    public void setApellido_maternoT(String apellido_maternoT) {
        this.apellido_maternoT = apellido_maternoT;
    }

    public String getDireccionT() {
        return direccionT;
    }

    public void setDireccionT(String direccionT) {
        this.direccionT = direccionT;
    }

    public String getCorreoT() {
        return correoT;
    }

    public void setCorreoT(String correoT) {
        this.correoT = correoT;
    }

    public int getTelefonoT() {
        return telefonoT;
    }

    public void setTelefonoT(int telefonoT) {
        this.telefonoT = telefonoT;
    }
    
    
    
}
