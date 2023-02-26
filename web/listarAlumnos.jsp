<%-- 
    Document   : listarEmpleados
    Created on : Feb 25, 2023, 4:11:39 PM
    Author     : Ryzen9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="DAO.Alumno, java.util.ArrayList, java.time.LocalDate" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alumno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pico.min.css">
    </head>
    <body>
        <main class="container">
            <h1>Lista de Alumnos Registrados</h1>
            <%
            ArrayList<Alumno> alumnos = null;
            alumnos = (ArrayList<Alumno>) request.getAttribute("Alumnos");
            %>
            <figure>
                <table role="grid">
                    <thead>
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">DNI</th>
                            <th scope="col">Nombres</th>
                            <th scope="col">Apellidos</th>
                            <th scope="col">f. Nacimiento</th>
                            <th scope="col">Profesion</th>
                            <th scope="col">Facultad</th>
                            <th scope="col">F. Ingreso</th>
                            <th scope="col">Modalidad</th>
                            <th scope="col">Años Estudiando</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Alumno alumno : alumnos) {
                        %>
                        <tr>
                            <td><%=alumno.getIdAlumno()%></td>
                            <td><%=alumno.getDni()%></td>
                            <td><%=alumno.getNombres()%></td>
                            <td><%=alumno.getApellidos()%></td>
                            <td><%=alumno.getFechaNacimiento()%></td>
                            <td><%=alumno.getProfesion().getDescripcion()%></td>
                            <td><%=alumno.getFacultad().getDescripcion()%></td>
                            <td><%=alumno.getFechaIngreso()%></td>
                            <td><%=alumno.getModalidadIngreso()%></td>
                            <%LocalDate fecha_actual = LocalDate.now();
                                int anio_actual = fecha_actual.getYear();
                                int anio_ingreso = Integer.parseInt(alumno.getFechaIngreso().substring(0,4));
                                int anio_antig = anio_actual-anio_ingreso;
                            %>
                            <td><%=anio_antig+" años"%></td>

                        </tr>
                        <% }%>

                    </tbody>
                </table>
            </figure>

            <br>
            <form action="index.jsp" method="post">
                <center>
                    <input type="submit" value="Regresar al Menu de Opciones" style="width: 50%" >
                </center>
                
            </form>

        </main>
    </body>
</html>
