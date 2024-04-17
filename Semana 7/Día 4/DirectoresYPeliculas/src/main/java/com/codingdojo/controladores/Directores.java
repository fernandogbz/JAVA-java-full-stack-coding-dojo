package com.codingdojo.controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.modelos.Director;


@WebServlet("/Directores")
public class Directores extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static ArrayList<Director> directores = new ArrayList<Director>();   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/directores.jsp");
		
		HttpSession session = request.getSession();
		Integer contador = (Integer)session.getAttribute("contador");
		
		if(contador == null) {
			session.setAttribute("contador", 1);
		}
		else {
			session.setAttribute("contador", contador + 1);
		}
		
		// session.removeAttribute("contador");
		
		request.setAttribute("directores", directores);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String nacionalidad = request.getParameter("nacionalidad");
		int edad = Integer.parseInt(request.getParameter("edad"));
		
		Director nuevoDirector = new Director(nombre, apellido, nacionalidad, edad);
		directores.add(nuevoDirector);
		
		// El redirect siempre va a ejecutar el método doGet()
		response.sendRedirect("/DirectoresYPeliculas/Directores");
		
	}

}
