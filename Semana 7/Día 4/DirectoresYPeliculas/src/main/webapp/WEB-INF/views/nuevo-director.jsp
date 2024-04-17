<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Nuevo Director </title>
	</head>
	<body>
		<h1> Nuevo Director </h1>
		<form method="POST" action="/DirectoresYPeliculas/NuevoDirector">
			<div>
				<label for="nombre">
					Nombre:
				</label>
				<input type="text" id="nombre" name="nombre">
			</div>
			<div>
				<label for="apellido">
					Apellido:
				</label>
				<input type="text" id="apellido" name="apellido">
			</div>
			<div>
				<label for="nacionalidad">
					Nacionalidad:
				</label>
				<select id="nacionalidad" name="nacionalidad">
					<option value="Americana"> USA </option>
					<option value="Canadiense"> Canada </option>
					<option value="Mexicana"> Mexico </option>
					<option value="Chilena"> Chile </option>
				</select>
			</div>
			<div>
				<label for="edad">
					Edad:
				</label>
				<input type="number" id="edad" name="edad">
			</div>
			<button>
				Agregar director
			</button>
		</form>
	</body>
</html>