<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Login y Registro </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/styles.css" rel="stylesheet" />
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-6 d-flex-col align-items-center">
					<h1 class="bg-primary p-3 text-white"> Login </h1>
					<form action="/login" method="POST">
						<div>
							<label for="correo">
								Correo:
							</label>
							<input class="form-control mb-3" type="email" id="correo" name="correo">
						</div>
						<div>
							<label for="contrasena">
								Contraseña:
							</label>
							<input class="form-control mb-3" type="password" id="contrasena" name="contrasena">
						</div>
						<button class="btn btn-primary text-white">
							Login
						</button>
						<c:if test="${errorLogin != null}"> 
							<div class="mensajeError alert alert-danger">
								<c:out value="${errorLogin}"/>
							</div>
						</c:if>
					</form>
				</div>
				<div class="col-6 d-flex-col align-items-center">
					<h1 class="bg-success p-3 text-white"> Registro </h1>
					<form:form action="/registro" method="POST" modelAttribute="director">
						<div>
							<form:label path="nombre" for="nombre">
								Nombre:
							</form:label>
							<form:input class="form-control mb-3" path="nombre" type="text" id="nombre" name="nombre"/>
							<form:errors path="nombre" class="alert alert-danger"/>
						</div>
						<div>
							<form:label path="apellido" for="apellido">
								Apellido:
							</form:label>
							<form:input class="form-control mb-3" path="apellido" type="text" id="apellido" name="apellido" />
							<form:errors path="apellido" class="alert alert-danger"/>
						</div>
						<div>
							<form:label path="correo" for="correo">
								Correo:
							</form:label>
							<form:input class="form-control mb-3" path="correo" type="email" id="correo" name="correo" />
							<form:errors path="correo" class="alert alert-danger"/>
						</div>
						<div>
							<form:label path="contrasena" for="contrasena">
								Contraseña:
							</form:label>
							<form:input class="form-control mb-3" path="contrasena" type="password" id="contrasena" name="contrasena" />
							<form:errors path="contrasena" class="alert alert-danger"/>
						</div>
						<button class="btn btn-success text-white">
							Registro
						</button>
					</form:form>
				</div>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>