/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import DAO.*;
import Negocios.guardarAlumno;
import jakarta.servlet.ServletContext;
import static util.IdGenerator.generateIdAlumno;

/**
 *
 * @author Ryzen9
 */
public class registrarAlumno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            String dni = request.getParameter("dni");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String fechaIngreso = request.getParameter("fechaIngreso");
            String modalidadIngreso = request.getParameter("modalidadIngreso");
            String profesion = request.getParameter("profesion");
            String facultad = request.getParameter("facultad");
            request.getParameterValues("modalidadIngreso");
            //System.out.println(request.getParameterValues("modalidadIngreso"));

            if (nombres != null && apellidos != null && dni != null && fechaNacimiento != null
                    && fechaIngreso != null && modalidadIngreso != null
                    && profesion != null && facultad != null) {

                Profesion NuevaProfesion = new Profesion(profesion);
                Facultad NuevaFacultad = new Facultad(facultad);

                Alumno alumno = new Alumno(dni, nombres, apellidos,
                        NuevaProfesion, NuevaFacultad,
                        fechaNacimiento, fechaIngreso, modalidadIngreso);
                //System.out.println(alumno);

                ServletContext sc = this.getServletContext();
                String path = sc.getRealPath("/WEB-INF/alumnos.txt");
                path = path.replace('\\', '/');

                int generatedId = generateIdAlumno(path);  //Genera un nuevo id
                alumno.setIdAlumno(generatedId);
                guardarAlumno.registrar(alumno, path);

                request.setAttribute("alumno", alumno);

            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet registrarAlumno</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet registrarAlumno at " + request.getContextPath() + "</h1>");
                out.println("<h1>Servlet registrarAlumno at " + "ERROR DE DATOS" + "</h1>");
                out.println("</body>");
                out.println("</html>");

            }

            System.out.println(fechaNacimiento);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Mensaje de Exito del Registro de Alumno</title>");
            out.println("<link rel=\"stylesheet\" href=\"css/pico.min.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Alumno Registrado Correctamente</center></h1>");
            out.println("</body>");
            out.println("</html>");
            out.println("<form action = index.jsp method=post>");
            out.println("<center><input type=submit value=\"Retornar al Menu de Opciones\"></center>");
            out.println("</form>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
