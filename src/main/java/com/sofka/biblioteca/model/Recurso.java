package com.sofka.biblioteca.model;

import com.sofka.biblioteca.utils.Area;
import com.sofka.biblioteca.utils.Tipo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Recursos")
public class Recurso {

    @Id
    private String id;
    private Tipo tipo;
    private boolean disponible = true;
    private Area area;
    private String nombre;
    private Date fecha;

    public Recurso(){
    }

    public Recurso(String id, Tipo tipo, Area area, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.area = area;
        this.nombre = nombre;
    }

    public Recurso(Tipo tipo, Area area, String nombre) {
        this.tipo = tipo;
        this.area = area;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
