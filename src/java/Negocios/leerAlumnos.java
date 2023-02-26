/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import DAO.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ryzen9
 */
public class leerAlumnos {

    private static int cont = 0;
    private static File archivo = null;
    private static FileReader fr;
    private static BufferedReader br = null;
    //public static ArrayList<Alumno> alumnos;

    public static ArrayList<Alumno> obtenerAlumnos(String path) {
        ArrayList<Alumno> alumnos;
        alumnos = new ArrayList<>();
        try {

            if (archivo == null) {
                archivo = new File(path);

            }
            br = null;
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea = null;
            String[] tokensLinea = null;
            String idAlumno;
            String dni;
            String nombres;
            String apellidos;
            String descProfesion;
            String descFacultad;
            String fechaNacimiento;
            String fechaIngreso;
            String modalidadIngreso;

            Facultad facultad;
            Profesion profesion;

            Alumno alumno;
            linea = br.readLine();

            while (linea != null) {
                tokensLinea = linea.split(",");
                idAlumno = tokensLinea[0];
                dni = tokensLinea[1];
                nombres = tokensLinea[2];
                apellidos = tokensLinea[3];
                fechaNacimiento = tokensLinea[4];
                fechaIngreso = tokensLinea[5];
                modalidadIngreso = tokensLinea[6];
                descFacultad = tokensLinea[7];
                descProfesion = tokensLinea[8];
                facultad = new Facultad(descFacultad);
                profesion = new Profesion(descProfesion);
                alumno = new Alumno(Integer.parseInt(idAlumno),dni, nombres, apellidos, profesion, facultad, fechaNacimiento, fechaIngreso, modalidadIngreso);
                alumnos.add(alumno);
                cont++;
                linea = br.readLine();
            }
        } catch (IOException | NumberFormatException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();

                }
            } catch (IOException e2) {
            }
        }
        return alumnos;
    }

    public static int getCont() {
        return cont;
    }

    public static void clearCont() {
        cont = 0;
    }

}
