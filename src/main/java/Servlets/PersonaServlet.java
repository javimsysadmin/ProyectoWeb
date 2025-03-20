package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import Model.persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/persona")
public class PersonaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener parámetros de la URL
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));


        // Crear objeto Persona
        persona persona = new persona(nombre, edad);

        // Respuesta HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Datos de la Persona</h2>");
        out.println("<p>Nombre: " + persona.getNombre() + "</p>");
        out.println("<p>Edad: " + persona.getEdad() + "</p>");
        out.println("</body></html>");
    }
}
