<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
		<title> Directores</title>
	</head>
	<body>
		<h1> Lista de directores </h1>
		<ul>
			<c:forEach var="director" items="${directores}">
				<li>
					<c:out value="${director.nombre}" />
					<c:out value="${director.apellido}" /> -
					<c:out value="${director.edad}" />
				</li>
			</c:forEach>
		</ul>
		<h1> Nuevo Director </h1>
		<form method="POST" action="/DirectoresYPeliculas/Directores">
			<div>
				<label for="nombre">
					Nombre:
				</label>
				<input type="text" id="nombre" name="nombre">
			</div>
			<div>
				<label for="apellido">
					Apellido:
				</label>
				<input type="text" id="apellido" name="apellido">
			</div>
			<div>
				<label for="nacionalidad">
					Nacionalidad:
				</label>
				<select id="nacionalidad" name="nacionalidad">
					<option value="Americana"> USA </option>
					<option value="Canadiense"> Canada </option>
					<option value="Mexicana"> Mexico </option>
					<option value="Chilena"> Chile </option>
				</select>
			</div>
			<div>
				<label for="edad">
					Edad:
				</label>
				<input type="number" id="edad" name="edad">
			</div>
			<button>
				Agregar director
			</button>
		</form>
		<h2> Has visitado esta página <%= session.getAttribute("contador") %></h2>
	</body>
</html>