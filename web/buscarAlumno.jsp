<%-- 
    Document   : BuscarAlumno
    Created on : Feb 25, 2023, 4:12:34 PM
    Author     : Ryzen9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.Alumno, java.util.ArrayList, java.time.LocalDate" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar Alumno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pico.min.css">
    </head>
    <body>
        <main class="container">
            <%
                Alumno alumno = null ;
                alumno = (Alumno) request.getAttribute("Alumno");
                String message = null;
                message = (String) request.getAttribute("Message");

            %>
            <h1>Buscar Alumno</h1>
            <p>Ingrese el id del alumno a Buscar: </p>

            <form action="getAlumno", method="POST">
                <div class="grid">
                    <div>
                        <input type="text" id="id" name="id" placeholder="id" required> 
                    </div>
                    <div>
                        <button type="submit">Buscar</button>
                    </div>

                </div>
            </form>
            <%
               
               if (alumno != null) {
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
                    </tbody>
                </table>
            </figure>
            <% } else if(message != null){
                
            %>

            <p style="color: red"><%=message%></p>
            <% }%>

            <form action="index.jsp" method="post">
                <center>
                    <input type="submit" value="Regresar al Menu de Opciones" style="width: 50%" >
                </center>

            </form>



        </main>
    </body>
</html>
