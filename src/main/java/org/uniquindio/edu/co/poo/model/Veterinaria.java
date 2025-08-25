package org.uniquindio.edu.co.poo.model;

public class Veterinaria {

    public String ubicacion;
    public String nombre;
    public String nit;

    //Constructor
    public Veterinaria(String ubicacion, String nombre, String nit) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.nit = nit;

    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
