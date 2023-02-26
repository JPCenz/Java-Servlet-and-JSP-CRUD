/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import DAO.Alumno;
import DAO.Profesion;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ryzen9
 */
public class buscarAlumno {

    public static Alumno buscarAlumnoById(String id, String path) {
        try {
            ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
            alumnos = leerAlumnos.obtenerAlumnos(path);
            for (Alumno alumno : alumnos) {
                if (alumno.getIdAlumno() == Integer.parseInt(id)) {
                    return alumno;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }

    }

}
