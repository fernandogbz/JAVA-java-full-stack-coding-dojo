<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Editar Director </title>
	</head>
	<body>
		<h1> Editar Director </h1>
		<form:form action="/editar" method="POST" modelAttribute="director">
			<input type="hidden" name="_method" value="PUT"/>
			<div>
				<form:label path="nombre" for="nombre">
					Nombre:
				</form:label>
				<form:input path="nombre" type="text" id="nombre" name="nombre" value="${directorActual.nombre}"/>
				<form:errors path="nombre" />
			</div>
			<div>
				<form:label path="apellido" for="apellido">
					Apellido:
				</form:label>
				<form:input path="apellido" type="text" id="apellido" name="apellido" value="${directorActual.apellido}"/>
				<form:errors path="apellido" />
			</div>
			<div>
				<form:label path="correo" for="correo">
					Correo:
				</form:label>
				<form:input path="correo" type="email" id="correo" name="correo" value="${directorActual.correo}"/>
				<form:errors path="correo" />
			</div>
			<div>
				<form:label path="contrasena" for="contrasena">
					Contraseña:
				</form:label>
				<form:input path="contrasena" type="password" id="contrasena" name="contrasena"/>
				<form:errors path="contrasena" />
			</div>
			<button>
				Editar
			</button>
		</form:form>
	</body>
</html>