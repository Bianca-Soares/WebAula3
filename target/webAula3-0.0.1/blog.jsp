<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 7</title>
</head>
<body>

	<h2>Blog</h2>
	
	<h2>Mensagem:</h2>
	<br>
	
	<form action="controle-blog">
		<textarea rows="3" cols="40" value="" name="mensagem"  required oninvalid="setCustomValidity('Campo obrigatório')"></textarea>
		<input type= "submit" value="ENVIAR"/>
	
	</form>
	
	<jsp:include page="mensagens.jsp" flush="true"/>

</body>
</html>