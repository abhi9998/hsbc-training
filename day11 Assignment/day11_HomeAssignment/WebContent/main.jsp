<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--For this its jsp is included in main during compilation -->
<%@include file="generalinclude.jsp"%>

<!-- For this its jsp is called from main the content is not merged with main.jsp -->
<jsp:include page="jspinclude.jsp"/>

</body>
</html>