/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;
import java.io.FileWriter;



import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryzen9
 */
public class menuOpciones extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String opcion = request.getParameter("opcion");
            RequestDispatcher rd1;
            request.setAttribute("opcion", opcion);

            if (opcion == null) {
                opcion = "0";
            }
            switch (opcion) {
                case "1"://Registrar Alumno
                    rd1 = request.getRequestDispatcher("registrarAlumno.jsp");
                    rd1.forward(request, response);
                    break;
                case "2"://Buscar Alumno
                    rd1 = request.getRequestDispatcher("buscarAlumno.jsp");
                    rd1.forward(request, response);
                    break;
                case "3"://Eliminar Alumno
                    rd1 = request.getRequestDispatcher("eliminarAlumno.jsp");
                    rd1.forward(request, response);
                    break;
                case "4"://Listar Alumno
                    rd1 = request.getRequestDispatcher("listarAlumnos");
                    rd1.forward(request, response);
                    break;
                default:
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Mensaje del Menu de Opciones</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<center><h1>Se debe de seleccionar una opcion a ejecutar</h1></center>");
                    out.println("<form action=index.jsp method=post>");
                    out.println("<center><input type=submit value=\"Retornar al Menu de Opciones\"></center>");
                    out.println("</form>");
                    out.println("</body>");
                    out.println("</html>");
            }
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
