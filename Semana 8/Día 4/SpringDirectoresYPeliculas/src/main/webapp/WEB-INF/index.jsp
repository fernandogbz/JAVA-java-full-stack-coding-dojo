<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	</body>
</html>