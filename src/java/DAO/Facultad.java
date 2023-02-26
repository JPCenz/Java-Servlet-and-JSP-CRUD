/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Ryzen9
 */
public class Facultad {
    private static int idCount = 0;
    private int idFacultad;
    private String descripcion;

    public Facultad(String descripcion) {
        this.idFacultad = idCount +1;
        this.descripcion = descripcion;
    }

    public int getIdFacultad() {
        return idFacultad;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
