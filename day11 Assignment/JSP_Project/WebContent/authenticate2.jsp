<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date,java.util.ArrayList" %> 
 <%@ page import="com.hsbc.tr.web.User" %>   
 <jsp:useBean id ="user" class="com.hsbc.tr.web.User" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>authenticator</title>
</head>
<body>
<jsp:setProperty name="user" property="userName" value="<%=request.getParameter(\"username\") %>"/>
<jsp:setProperty name="user" property="password" value="<%=request.getParameter(\"password\") %>"/>
<% 		session.setAttribute("display","false");
		User u =(User)session.getAttribute("user");

	if(u.isAuthenticated()){
	%>
	<jsp:forward page="loginsuccess.jsp"/>
	<%}else{ %>
	<jsp:forward page="loginfailue.jsp"/>
	<%}%>
</body>
</html>