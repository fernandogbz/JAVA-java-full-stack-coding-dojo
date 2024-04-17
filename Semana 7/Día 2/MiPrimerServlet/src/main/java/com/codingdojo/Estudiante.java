package com.codingdojo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Estudiante
 */
@WebServlet("/Estudiante")
public class Estudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/estudiantes.jsp");
		
		ArrayList<String> listaEstudiantes = new ArrayList<String>();
		listaEstudiantes.add("Alex");
		listaEstudiantes.add("Martha");
		listaEstudiantes.add("Julieta");
		listaEstudiantes.add("Alan");
		
		String nombre1 = request.getParameter("nombre1");
		String nombre2 = request.getParameter("nombre2");
		
		listaEstudiantes.add(nombre1);
		listaEstudiantes.add(nombre2);
		
		String titulo = "Lista de estudiantes!!!!!";
			
		request.setAttribute("listaEstudiantes", listaEstudiantes);
		request.setAttribute("titulo", titulo);
		
		view.forward(request, response);
		/*
		response.setContentType("text/html");
		System.out.println("Hola desde doGet/Estudiante");
		PrintWriter out = response.getWriter();
		out.write("<h1> Hola futuro estudiante Full-Stack Java </h1>");
		
		
		for(int i = 0; i < listaEstudiantes.size(); i ++) {
			out.write("<p> " + listaEstudiantes.get(i) + "</p>");
		}
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
