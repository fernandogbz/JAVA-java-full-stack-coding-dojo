<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Nueva Receta</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1 class="col-6"> Agregar nueva receta </h1>
				<a class="col-2" href="/recetas"> Todas las recetas </a>
				<a class="col-2" href="/logout"> Logout </a>
			</div>
			<div class="row">
				<form:form modelAttribute="receta" action="/procesa/receta" method="POST">
					<div>
						<form:label path="nombre" for="nombre">
							Nombre:
						</form:label>
						<form:input path="nombre" id="nombre" name="nombre" type="text" />
						<form:errors path="nombre" />
					</div>
					<div>
						<form:label path="descripcion" for="descripcion">
							Descripcion:
						</form:label>
						<form:input path="descripcion" id="descripcion" name="descripcion" type="text" />
						<form:errors path="descripcion" />
					</div>
					<div>
						<form:label path="instrucciones" for="instrucciones">
							Instrucciones:
						</form:label>
						<form:input path="instrucciones" id="instrucciones" name="instrucciones" type="text" />
						<form:errors path="instrucciones" />
					</div>
					<div>
						<form:label path="fechaCoccion" for="fechaCoccion">
							Fecha de cocción:
						</form:label>
						<form:input path="fechaCoccion" id="fechaCoccion" name="fechaCoccion" type="date"/>
						<form:errors path="fechaCoccion"/>
					</div>
					<div>
						<h3> Se cocina en menos de 30 minutos? </h3>
						<form:label path="menosTreinta" for="si">
							Si
						</form:label>
						<form:radiobutton path="menosTreinta" id="si" name="menosTreinta" value="1"/>
						<form:label path="menosTreinta" for="no">
							No
						</form:label>
						<form:radiobutton path="menosTreinta" id="no" name="menosTreinta" value="2"/>
					</div>
					<button>
						Agregar receta
					</button>
				</form:form>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	
	</body>
</html>