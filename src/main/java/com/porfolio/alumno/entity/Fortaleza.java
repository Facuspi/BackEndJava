
package com.porfolio.alumno.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fortaleza {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id; 
    private String nombre;
    private String porcentaje;

    public Fortaleza() {
    }

    public Fortaleza(String nombre, String porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

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

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}
