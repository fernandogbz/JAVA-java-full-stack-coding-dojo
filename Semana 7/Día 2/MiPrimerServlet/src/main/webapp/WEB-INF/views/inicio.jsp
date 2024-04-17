<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Mi primer JSP </title>
	</head>
	<body>
		<h1> Hola desde el JSP </h1>
		<p>
			Estaremos cargando contenido y combinandolo con Java a partir de ahora
		</p>
		
		<%
			int edad = 20;
			String nombre = "Alex";
		%>
		<h2>Nombre: <%= nombre %> </h2>
		<p> Edad: <%= edad %> </p>
		<ul>
		<%
			for(int i = 1; i <= 10; i ++){ %>
				<li> <%= i %> </li>
		<%	} %>
		</ul>
		
		<%!
			public int suma(int num1, int num2 ){
				return num1+ num2;
			}
		%>
		
		<p> 4 + 5 = <%= suma(4,5) %></p>
		
	</body>
</html>