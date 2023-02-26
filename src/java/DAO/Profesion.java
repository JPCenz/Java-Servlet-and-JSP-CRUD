/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Ryzen9
 */
public class Profesion {
    private static int idCount = 0;
    private int idProfesion;
    private String descripcion;

    public Profesion(String descripcion) {
        this.idProfesion = idCount + 1 ;
        this.descripcion = descripcion;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
