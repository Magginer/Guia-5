/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.univers.entidades;

import java.time.LocalDate;

/**
 *
 * @author marti
 */
public class Materia {
    private int IdMateria;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(int IdMateria, String nombre, int anio, boolean estado) {
        this.IdMateria = IdMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    
    
    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "IdMateria=" + IdMateria + ", nombre=" + nombre + ", anio=" + anio + ", estado=" + estado + '}';
    }
    
            
}
