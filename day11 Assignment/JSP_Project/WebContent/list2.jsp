<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.hsbc.tr.web.User" %>
    <jsp:useBean id ="user" class="com.hsbc.tr.web.User" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
<table>
<%
	User u = (User)session.getAttribute("user");
%>
<%for(String us: u.getUsers()){ %>

<tr><td><%=us%></td></tr>
<%} %>
</table>
</body>
</html>