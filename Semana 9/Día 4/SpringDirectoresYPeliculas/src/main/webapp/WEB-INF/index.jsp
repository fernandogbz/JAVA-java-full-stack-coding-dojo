<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Login y Registro </title>
	</head>
	<body>
		<h1> Login </h1>
		<form action="/login" method="POST">
			<div>
				<label for="correo">
					Correo:
				</label>
				<input type="email" id="correo" name="correo">
			</div>
			<div>
				<label for="contrasena">
					Contraseña:
				</label>
				<input type="password" id="contrasena" name="contrasena">
			</div>
			<button>
				Login
			</button>
			<div class="mensajeError">
				<c:out value="${errorLogin}"/>
			</div>
		</form>
		<h1> Registro </h1>
		<form:form action="/registro" method="POST" modelAttribute="director">
			<div>
				<form:label path="nombre" for="nombre">
					Nombre:
				</form:label>
				<form:input path="nombre" type="text" id="nombre" name="nombre"/>
				<form:errors path="nombre" />
			</div>
			<div>
				<form:label path="apellido" for="apellido">
					Apellido:
				</form:label>
				<form:input path="apellido" type="text" id="apellido" name="apellido" />
				<form:errors path="apellido" />
			</div>
			<div>
				<form:label path="correo" for="correo">
					Correo:
				</form:label>
				<form:input path="correo" type="email" id="correo" name="correo" />
				<form:errors path="correo" />
			</div>
			<div>
				<form:label path="contrasena" for="contrasena">
					Contraseña:
				</form:label>
				<form:input path="contrasena" type="password" id="contrasena" name="contrasena" />
				<form:errors path="contrasena" />
			</div>
			<button>
				Registro
			</button>
		</form:form>
	</body>
</html>