<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<strong>Mensagens postadas</strong>
	
	<display:table name="list_msg_bean"
     pagesize="10" requestURI="controle-blog" export="true" sort="list">
     <display:column title="text" property="text" sortable="true" /> 
     <display:column title="data" property="date" sortable="true" />
   </display:table>
	
	
	
	
</body>
</html>