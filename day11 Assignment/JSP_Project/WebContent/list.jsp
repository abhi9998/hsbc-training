<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
<table>
<%
ArrayList<String> users = (ArrayList)session.getAttribute("data");
%>
<%for(String user: users){ %>

<tr><td><%=user%></td></tr>
<%} %>
</table>
</body>
</html>