<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Aplicación de Recetas</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-6">
					<h1> Registro </h1>
					<form:form modelAttribute="usuario" action="/registro" method="POST">
						<div>
							<form:label path="nombre" for="nombre">
								Nombre:
							</form:label>
							<form:input path="nombre" id="nombre" name="nombre" type="text" />
							<form:errors path="nombre" />
						</div>
						<div>
							<form:label path="apellido" for="apellido">
								Apellido:
							</form:label>
							<form:input path="apellido" id="apellido" name="apellido" type="text" />
							<form:errors path="apellido" />
						</div>
						<div>
							<form:label path="correo" for="correo">
								Correo:
							</form:label>
							<form:input path="correo" id="correo" name="correo" type="text" />
							<form:errors path="correo" />
						</div>
						<div>
							<form:label path="contraseña" for="contraseña">
								Contraseña:
							</form:label>
							<form:input path="contraseña" id="contraseña" name="contraseña" type="password" />
							<form:errors path="contraseña" />
						</div>
						<div>
							<form:label path="confirmacionContraseña" for="confirmacionContraseña">
								Confirmar contraseña:
							</form:label>
							<form:input path="confirmacionContraseña" id="confirmacionContraseña" name="confirmacionContraseña" type="password" />
							<form:errors path="confirmacionContraseña" />
						</div>
						<button> Registro </button>
					</form:form>
				</div>
				<div class="col-6">
					<h1> Login </h1>
					<form:form modelAttribute="loginUsuario" action="/login" method="POST">
						<div>
							<form:label path="correoLogin" for="correoLogin">
								Correo:
							</form:label>
							<form:input path="correoLogin" id="correoLogin" name="correoLogin" type="text" />
							<form:errors path="correoLogin" />
						</div>
						<div>
							<form:label path="contraseñaLogin" for="contraseñaLogin">
								Contraseña:
							</form:label>
							<form:input path="contraseñaLogin" id="contraseñaLogin" name="contraseñaLogin" type="password" />
							<form:errors path="contraseñaLogin" />
						</div>
						<button> Login </button>
					</form:form>
				</div>
			</div>
		</div>
	
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>