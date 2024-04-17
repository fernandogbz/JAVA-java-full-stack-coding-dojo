<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Directores </title>
		<link rel="stylesheet" href="css/styles.css">
	</head>
	<body>
		<div class="encabezado">
			<h1 class="titulo"> Bienvenid@ de vuelta <c:out value="${nombre}"/> a la lista de directores </h1>
			<form action="/logout" method="GET">
				<button> Logout </button>
			</form>
		</div>
		<ul>
			<c:forEach var="director" items="${directores}">
			<li> 
				<c:out value="${director.nombre}" /> <c:out value="${director.apellido}" />
				<c:if test="${director.id == id}">
					<form action="/director/eliminar/${director.id}" method="POST">
						<input type="hidden" name="_method" value="DELETE"/>
						<button> Eliminar mi cuenta </button>
					</form>
					<form action="/director/editar/${director.id}" method="GET">
						<button> Editar mi cuenta </button>
					</form>
				</c:if>
				<ul>
				<c:forEach var="pelicula" items="${director.peliculas}">
					<li> <a href="/pelicula/${pelicula.id}"><c:out value="${pelicula.nombre}"/></a></li>
				</c:forEach>
				</ul>
			</li>
			</c:forEach>
		</ul>
		<script src="js/directores.js"></script>
	</body>
</html>