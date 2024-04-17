<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Detalle Película </title>
	</head>
	<body>
		<h1> Título: <c:out value="${pelicula.nombre}"/> </h1>
		<h2> Director: <c:out value="${pelicula.director.nombre}"/> <c:out value="${pelicula.director.apellido}"/></h2>
	</body>
</html>