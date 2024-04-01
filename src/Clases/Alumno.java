package Clases;

import java.util.Objects;

public class Alumno {
    private String dni;
    private String nombre;
    private String curso;
    private boolean becado;

    public Alumno(String dni, String nombre, String curso, boolean becado) {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        this.becado = becado;
    }

    public Alumno(String dni, String nombre, String curso) {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        this.becado = false;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", becado=" + becado +
                '}';
    }
}
