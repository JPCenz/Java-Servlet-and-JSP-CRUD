/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryzen9
 */
public class eliminaAlumno {

    public static void delete(String id, String path, String temp) {
        File archivo;
        File tempFile;
        FileWriter fw = null;
        FileWriter fw1 = null;
        PrintWriter pw = null;
        PrintWriter pw1 = null;
        String idEmpleado;
        try {
            archivo = new File(path);
            tempFile = new File(temp);
            fw = new FileWriter(archivo, true);
            fw1 = new FileWriter(tempFile, true);
            pw = new PrintWriter(fw);
            pw1 = new PrintWriter(fw1);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String line = null;
            // Leer desde el archivo original y escribir en el nuevo
            // menos que los datos se adapte al contenido que deben eliminarse.
            String[] tokensLinea = null;
            while ((line = br.readLine()) != null) {
                tokensLinea = line.split(",");                
                if (!tokensLinea[0].equals(id)) {
                    pw1.println(line);
                    pw1.flush();
                }
            }

            pw.close();
            pw1.close();
            br.close();

            // Eliminar el archivo original
            if (!archivo.delete()) {
                System.out.println("No se pudo borrar el archivo");
                return;
            }

            // Cambie el nombre del nuevo archivo al nombre de archivo del archivo original tenía .
            if (!tempFile.renameTo(archivo)) {
                System.out.println("No se puede cambiar el nombre de archivo");
            }

        } catch (IOException e) {
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                    pw1.close();
                }
            } catch (Exception e2) {
            }
        }
    }

}
