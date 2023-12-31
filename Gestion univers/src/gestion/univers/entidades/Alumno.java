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
public class Alumno {
 private LocalDate fechadenacimiento;
 private String nombre;
 private String apellido;
 private int IdAlumno;
 private int dni;
 private boolean estado;

    public Alumno() {
    }

    public Alumno(LocalDate fechadenacimiento, String nombre, String apellido, int dni, boolean estado) {
        this.fechadenacimiento = fechadenacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public Alumno(LocalDate fechadenacimiento, String nombre, String apellido, int IdAlumno, int dni, boolean estado) {
        this.fechadenacimiento = fechadenacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.IdAlumno = IdAlumno;
        this.dni = dni;
        this.estado = estado;
    }

 
 
    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  IdAlumno + ", " +nombre + ", " + apellido + ", " + dni;
    }
 
}
