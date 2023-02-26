<%-- 
    Document   : eliminarAlumno
    Created on : Feb 25, 2023, 4:12:24 PM
    Author     : Ryzen9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Alumno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pico.min.css">
    </head>
    <body>
        <%
                String message = null;
                message = (String) request.getAttribute("Message");

        %>
        <main class="container">
            <h1>Eliminar Alumno</h1>
            <p>Ingrese el id del alumno a Eliminar </p>
            <form action="eliminarAlumno", method="POST">
                <div class="grid">
                    <div>
                        <input type="text" id="id" name="id" placeholder="id" required> 
                    </div>
                    <div>
                        <button type="submit">Eliminar</button>
                    </div>

                </div>

            </form>
            <% if(message != null){%>
            <p style="color: red"><%=message%></p>
            <% }%>
            <br>
            <br>
            <form action="index.jsp" method="post">
                <center>
                    <input type="submit" value="Regresar al Menu de Opciones" style="width: 50%" >
                </center>

            </form>
        </main>
    </body>
</html>
