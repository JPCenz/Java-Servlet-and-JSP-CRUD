<%-- 
    Document   : registrarAlumno
    Created on : Feb 25, 2023, 1:03:36 PM
    Author     : Ryzen9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Alumno</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/pico.min.css">
    </head>
    <body>
        <main class="container">

            <h1>Registro de Nuevo Alumno</h1>
            <form action="registrarAlumno", method="POST">
                <!-- Grid -->
                <div class="grid">
                    <!--                    private int idAlumno;
                                        private int dni;
                                        private String nombres;
                                        private String apellidos;
                                        private Profesion profesion;
                                        private Facultad facultad;
                                        private LocalDate fechaNacimiento;
                                        private LocalDate fechaIngreso;
                                        private String modalidadIngreso;-->

                    <!-- Markup example 1: input is inside label -->
                    <label for="nombres">
                        First name
                        <input type="text" id="nombres" name="nombres" placeholder="Nombres" required>
                    </label>

                    <label for="apellidos">
                        Last name
                        <input type="text" id="apellidos" name="apellidos" placeholder="Last name" required>
                    </label>

                </div>

                <!-- Markup example 2: input is after label -->
                <label for="dni">Numero DNI</label>
                <input type="text" id="dni" name="dni" placeholder="DNI" required>

                <label for="fechaNacimiento">Fecha de Nacimiento</label>
                <input type="date" id="fechaNacimiento" name="fechaNacimiento" placeholder="fecha de Nacimiento" required>
                
                <label for="profesion">Profesion</label>
                <input type="text" id="dni" name="profesion" placeholder="profesion" required>
                
                <label for="facultad">Facultad</label>
                <input type="text" id="facultad" name="facultad" placeholder="profesion" required>

                <label for="fechaIngreso">Fecha de ingreso</label>
                <input type="date" id="fechaIngreso" name="fechaIngreso" placeholder="fecha de Ingreso" required>


                <!-- Select -->
                <label for="modalidadIngreso" name="modalidadIngreso">Modalidad de Ingreso</label>
                <select name="modalidadIngreso"  id="modalidadIngreso"   required>
                    <option value="" selected>Seleccione Modalidad</option>
                    <option value="Normal">Normal</option>
                    <option value="PrimerosPuestos">Primeros Puestos</option>
                    <option value="DeportistaCalificado">Deportista Calificado</option>
                    <option value="Traslado">Deportista Calificado</option>
                </select>

                <!-- Button -->
                <button type="submit">Submit</button>
            </form>
        </main>

    </body>
</html>
