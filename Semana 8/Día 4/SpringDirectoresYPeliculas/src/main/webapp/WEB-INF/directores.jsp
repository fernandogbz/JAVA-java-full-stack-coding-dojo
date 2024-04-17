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
			<li> <c:out value="${director.nombre}" /> <c:out value="${director.apellido}" /></li>
			</c:forEach>
		</ul>
		<script src="js/directores.js"></script>
	</body>
</html>