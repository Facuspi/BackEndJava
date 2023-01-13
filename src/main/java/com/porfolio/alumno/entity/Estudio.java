
package com.porfolio.alumno.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Estudio {
     @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    @Temporal (TemporalType.DATE)
    private Date inicio;
    @Temporal (TemporalType.DATE)
    private Date fin;
    private String intitucion;

    public Estudio() {
    }

    public Estudio(String titulo, Date inicio, Date fin, String intitucion) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.intitucion = intitucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getIntitucion() {
        return intitucion;
    }

    public void setIntitucion(String intitucion) {
        this.intitucion = intitucion;
    }

  
}