<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>formlogin</title>
</head>
<body>
	<form action="controle-usuario">
		<label>Informe seu nome:
			<input type="text" name="nome" required oninvalid="setCustomValidity('Campo obrigatório')">
		</label>
		<button type="submit">Entrar</button>	
	</form>
</body>
</html>