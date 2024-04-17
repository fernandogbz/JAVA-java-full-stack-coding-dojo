<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Lista de estudiantes </title>
	</head>
	<body>
		<h1> <c:out value="${titulo}"/> </h1>
		
		<ul>
			<c:forEach var="estudiante" items="${listaEstudiantes}">
			<li>
				<c:out value="${estudiante}" />
			</li>
			</c:forEach>
		</ul>
	</body>
</html>
