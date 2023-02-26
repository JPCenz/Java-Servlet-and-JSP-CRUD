/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.time.LocalDate;

/**
 *
 * @author Ryzen9
 */
public class Alumno {

    private static int idCount = 0;

    private int idAlumno;
    private String dni;
    private String nombres;
    private String apellidos;
    private Profesion profesion;
    private Facultad facultad;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String modalidadIngreso;

    public Alumno(int idAlumno, String dni, String nombres, String apellidos, Profesion profesion, Facultad facultad, String fechaNacimiento, String fechaIngreso, String modalidadIngreso) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.profesion = profesion;
        this.facultad = facultad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.modalidadIngreso = modalidadIngreso;
    }
    
    

    public Alumno(String dni, String nombres, String apellidos, Profesion profesion,
            Facultad facultad, String fechaNacimiento, String fechaIngreso,
            String modalidadIngreso) {
        this.idAlumno = Alumno.idCount + 1;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.profesion = profesion;
        this.facultad = facultad;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.modalidadIngreso = modalidadIngreso;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }
    
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getModalidadIngreso() {
        return modalidadIngreso;
    }

    public void setModalidadIngreso(String modalidadIngreso) {
        this.modalidadIngreso = modalidadIngreso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", nombres=" + nombres + ", apellidos=" + apellidos + ", profesion=" + profesion + ", facultad=" + facultad + ", fechaNacimiento=" + fechaNacimiento + ", fechaIngreso=" + fechaIngreso + ", modalidadIngreso=" + modalidadIngreso + '}';
    }

}
