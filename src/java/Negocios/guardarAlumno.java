/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import DAO.Alumno;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static util.IdGenerator.generateIdAlumno;

/**
 *
 * @author Ryzen9
 */
public class guardarAlumno {

    public static void registrar(Alumno alumno, String path) throws IOException {
        File archivo;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            
            archivo = new File(path);
            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);
            pw.println(alumno.getIdAlumno() + "," + alumno.getDni()+ "," + alumno.getNombres() + "," + alumno.getApellidos()
                    + "," + alumno.getFechaNacimiento() + "," + alumno.getFechaIngreso()+ "," + alumno.getModalidadIngreso()
                    + "," + alumno.getFacultad().getDescripcion() + "," + alumno.getProfesion().getDescripcion());

        } catch (IOException e) {
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } catch (Exception e2) {
            }
        }
    }

}
