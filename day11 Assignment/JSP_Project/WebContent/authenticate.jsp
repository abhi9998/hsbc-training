<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date,java.util.ArrayList" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>authenticator</title>
</head>
<body>
<% String username = request.getParameter("username");
String password= request.getParameter("password");
	if(username.equals(password)){
	
	ArrayList<String> users = new ArrayList<String>();
	users.add("Abhi");
	users.add("Arjun");
	users.add("Bhargav");
	users.add("Gautum");
	session.setAttribute("data", users);
	session.setAttribute("display", "false");
	%>
	
	
		<jsp:forward page = "loginsuccess.jsp"/>
	<%}else{%>
		
		<jsp:forward page = "loginfailue.jsp"/>
	<% }%>
%>
</body>
</html>