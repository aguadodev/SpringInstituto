package com.ejemplo.instituto.dto;

import java.time.LocalDate;

public class RegistroDTO {
    int id, id_alumno;
    String nombre;
    LocalDate fecha;
    Integer puntuacion;

    public RegistroDTO(String nombre, LocalDate fecha, int id_alumno, Integer puntuacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id_alumno = id_alumno;
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "RegistroDTO [id=" + id + ", id_alumno=" + id_alumno + ", puntuacion=" + puntuacion + ", nombre="
                + nombre + ", fecha=" + fecha + "]";
    }
}
