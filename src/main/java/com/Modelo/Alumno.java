
package com.Modelo;

public class Alumno {
    private String universidad;
    private String curso;
    private String alumno;
    private String periodo;
    private String lenguajeProgra;
    private String aspGrado;

    public Alumno(String universidad, String curso, String alumno, String periodo, String lenguajeProgra, String aspGrado) {
        this.universidad = universidad;
        this.curso = curso;
        this.alumno = alumno;
        this.periodo = periodo;
        this.lenguajeProgra = lenguajeProgra;
        this.aspGrado = aspGrado;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLenguajeProgra() {
        return lenguajeProgra;
    }

    public void setLenguajeProgra(String lenguajeProgra) {
        this.lenguajeProgra = lenguajeProgra;
    }

    public String getAspGrado() {
        return aspGrado;
    }

    public void setAspGrado(String aspGrado) {
        this.aspGrado = aspGrado;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "Universidad: " + universidad + ",  Curso: " + curso + ", Alumno: " + alumno + ", Período: " + periodo + ", Lenguaje de programación preferido: " + lenguajeProgra + ", Aspiración PostGraduación: " + aspGrado + '}';
    }
    
}
