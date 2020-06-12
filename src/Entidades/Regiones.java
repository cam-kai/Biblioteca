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
public class Regiones {
    private int id_regiones;
    private String region;
    private Pais pais;

    public Regiones() {
    }

    public int getId_regiones() {
        return id_regiones;
    }

    public void setId_regiones(int id_regiones) {
        this.id_regiones = id_regiones;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
}
