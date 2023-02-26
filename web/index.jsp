<%-- 
    Document   : index.jsp
    Created on : Feb 25, 2023, 11:41:27 AM
    Author     : Ryzen9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Gestion Alumnos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pico.min.css">
    </head>
    <body>
        <main class="container" style="">
            
            <center>
                <h1>Alumnos</h1>
                <h2 class="container">Menu de Opciones</h1>
            </center>
            
            <form action="menuOpciones" method="POST" class="center">
                <!-- Radios -->

                <fieldset>
                    <legend>Seleccione una Opcion:</legend>
                    <label for="small">
                        <input type="radio" id="opcion" name="opcion" value="1" checked>
                        Registrar alumno
                    </label>
                    <label for="medium">
                        <input type="radio" id="opcion" name="opcion" value="2">
                        Buscar alumno
                    </label>
                    <label for="large">
                        <input type="radio" id="opcion" name="opcion" value="3">
                        Eliminar
                    </label>
                    <label for="extralarge">
                        <input type="radio" id="opcion" name="opcion" value="4">
                        Listar Alumno
                    </label>
                </fieldset>
                <button type="submit">Seleccionar</button>
            </form>

        </main>
    </body>
</html>
