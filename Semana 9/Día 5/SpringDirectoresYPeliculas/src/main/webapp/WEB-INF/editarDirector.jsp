<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Editar Director </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/styles.css" rel="stylesheet" />
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-6 d-flex-col align-items-center">
					<h1 class="bg-warning p-3 text-white"> Editar Director </h1>
					<form:form action="/editar" method="POST" modelAttribute="director">
						<input type="hidden" name="_method" value="PUT"/>
						<div>
							<form:label path="nombre" for="nombre">
								Nombre:
							</form:label>
							<form:input class="form-control mb-3" path="nombre" type="text" id="nombre" name="nombre" value="${directorActual.nombre}"/>
							<form:errors class="alert alert-danger" path="nombre" />
						</div>
						<div>
							<form:label path="apellido" for="apellido">
								Apellido:
							</form:label>
							<form:input class="form-control mb-3" path="apellido" type="text" id="apellido" name="apellido" value="${directorActual.apellido}"/>
							<form:errors class="alert alert-danger" path="apellido" />
						</div>
						<div>
							<form:label path="correo" for="correo">
								Correo:
							</form:label>
							<form:input class="form-control mb-3" path="correo" type="email" id="correo" name="correo" value="${directorActual.correo}"/>
							<form:errors class="alert alert-danger" path="correo" />
						</div>
						<div>
							<form:label path="contrasena" for="contrasena">
								Contraseña:
							</form:label>
							<form:input class="form-control mb-3" path="contrasena" type="password" id="contrasena" name="contrasena"/>
							<form:errors class="alert alert-danger" path="contrasena" />
						</div>
						<button class="btn btn-warning text-white">
							Editar
						</button>
					</form:form>
				</div>
				<div class="col-1">
					<form action="/directores" method="GET">
						<button class="btn btn-secondary text-white"> Volver al home </button>
					</form>
				</div>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>