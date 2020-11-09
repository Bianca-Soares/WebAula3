<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 3</title>
</head>
<body>
		<h3>Quest 3</h3>
		<!-- scriptlet -->
		<% java.util.Random geradorDeNumeros = new Random(); %>
		<!-- expression -->
		<h4>Numero aleatorio: 
		<%= geradorDeNumeros.nextInt(100) %>
		</h4>

	<a href="randomico">Question 4</a>
	<p></p>

	<a href="mega-sena">Question 5</a>
	<p></p>

	<a href="/webAula3/template.jsp">Question 6</a>
	
	<p></p>
	<a href="formlogin.jsp">Question 7</a>
</body>
</html>