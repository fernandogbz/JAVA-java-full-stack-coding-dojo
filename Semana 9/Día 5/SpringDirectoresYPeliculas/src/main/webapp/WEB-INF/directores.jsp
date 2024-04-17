<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Directores </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
		<link href="/css/styles.css" rel="stylesheet" />
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-8">
					<h1 class="bg-primary p-3 text-white"> Bienvenid@ de vuelta <c:out value="${nombre}"/> a la lista de directores </h1>
				</div>
				<div class="col-2">
					<form action="/logout" method="GET">
						<button class="btn btn-secondary"> Logout </button>
					</form>
				</div>
				
			</div>
			<div class="row">
				<div class="col-6 d-flex-col align-items-center">
					<ul class="list-group">
						<c:forEach var="director" items="${directores}">
						<li class="list-group-item list-group-item-dark"> 
							<div class="row">
								<p class="col-6"> 
									<c:out value="${director.nombre}" /> <c:out value="${director.apellido}" />
								</p>
								<c:if test="${director.id == id}">
									<div class="col-3">
										<form action="/director/eliminar/${director.id}" method="POST">
											<input type="hidden" name="_method" value="DELETE"/>
											<button class="btn btn-danger"> Eliminar  </button>
										</form>
									</div>
									<div class="col-3">
										<form action="/director/editar/${director.id}" method="GET">
											<button class="btn btn-warning"> Editar </button>
										</form>
									</div>
									
								</c:if>
							</div>
							<ul class="list-group">
							<c:forEach var="pelicula" items="${director.peliculas}">
								<li class="list-group-item list-group-item-light"> 
									<a class="rounded" href="/pelicula/${pelicula.id}"><c:out value="${pelicula.nombre}"/></a>
								</li>
							</c:forEach>
							</ul>
						</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
		<script src="js/directores.js"></script>
	</body>
</html>