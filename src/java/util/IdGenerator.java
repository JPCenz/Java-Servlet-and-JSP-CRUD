/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import DAO.Alumno;
import Negocios.leerAlumnos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Utilitario para generar nuevos id
 * @author Ryzen9
 */
public class IdGenerator {
    

    public static int generateIdAlumno(String path) {
        ArrayList<Alumno> alumnos;
        alumnos = new ArrayList<>();
        int generatedId;
        alumnos = leerAlumnos.obtenerAlumnos(path);
        if (alumnos.size() == 0) {
            generatedId = 1;
            return generatedId;
        }
        
        //Ordena el array de alumnos de menor a mayor segun el id
        Collections.sort(alumnos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return new Integer(a1.getIdAlumno()).compareTo(new Integer(a2.getIdAlumno()));
            }
        }
        );
//        for (Alumno alumno : alumnos) {
//            System.out.println(alumno.getIdAlumno());
//        }
        int lastelement = alumnos.size() - 1;        
        generatedId =alumnos.get(lastelement).getIdAlumno() + 1;
//        System.out.println("NUEVO ID:");
//        System.out.println(generatedId);
        return generatedId;
    }

}
