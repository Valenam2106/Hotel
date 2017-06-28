
package com.accenture.model;


public class HotelesModel {
    
    //Genero los atributos
    private int id;
    private String nombre;
    private String direccion;
    private String numEstrellas;
    private String huespedes;
    private int estado;
    private String tripAdvisor;
    
    //Genero los constructores

    public HotelesModel() {
    
    }

    public HotelesModel(String nombre, String direccion, String numEstrellas, String huespedes, int estado, String tripAdvisor) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEstrellas = numEstrellas;
        this.huespedes = huespedes;
        this.estado = estado;
        this.tripAdvisor = tripAdvisor;
    }

    public HotelesModel(int id, String nombre, String direccion, String numEstrellas, String huespedes, int estado, String tripAdvisor) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEstrellas = numEstrellas;
        this.huespedes = huespedes;
        this.estado = estado;
        this.tripAdvisor = tripAdvisor;
    }
    
    //Genero los sets y gets

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(String numEstrellas) {
        this.numEstrellas = numEstrellas;
    }

    public String getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(String huespedes) {
        this.huespedes = huespedes;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getTripAdvisor() {
        return tripAdvisor;
    }

    public void setTripAdvisor(String tripAdvisor) {
        this.tripAdvisor = tripAdvisor;
    }
    
    
}
