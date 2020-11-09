<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question 5</title>
</head>
<body>
	<h3>Quest 5</h3>
	
	${param.nome}
	
		<% java.util.Random geradorDeNumeros = new Random(); 
		String quantText = request.getParameter("quant");
		if(quantText == null || quantText.trim().length() == 0) {
			request.getRequestDispatcher("/webAula3/mega-sena?erro=CAMPO VAZIU");
		}else
		{
			 String qunttext = request.getParameter("quant");
				int i= 0, quant = Integer.parseInt(qunttext) ;
				while(i < quant){
					
				
			   		int n= 0 ;
			   		String valores = " ";	
					while(n< 7){
						valores = valores +" "+ geradorDeNumeros.nextInt(60);
						n++;
					}%>  <p> </p><%
					out.println("Rodada "+(i+1)+": " +valores+"\n   ");
					%><p> </p> <%
					i++;
				}
			
		}%>
		<a href="template.jsp">Question 6</a>
		<p></p>
		<a href="formlogin.jsp">Question 7 não terminei</a>
	
</body>
</html>