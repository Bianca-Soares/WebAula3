<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 1 e 2</title>
</head>
<body>
	<p>Question 1</p>
	<h1>Bem-vindo!</h1>

	<p></p>

	<p>Question 2</p>
	<%--<%=request.getParameter("erro")--%>
	<form action="ola-mundo">
		<label for="nome">Entre com seu nome: </label> <input type="text"
			name="nome"><br>
		<br> <input type="submit" value="Enviar">
	</form>

	<p></p>
	
	<a href="randomico.jsp">Question 3</a>
	<p></p>

	<a href="randomico">Question 4</a>
	<p></p>

	<a href="mega-sena">Question 5</a>
	<p></p>

	<a href="template.jsp">Question 6</a>
	<p></p>
	
	<a href="formlogin.jsp">Question 7</a>
	<p></p>
</body>
</html>