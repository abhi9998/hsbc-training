<%if(session.getAttribute("display").equals("false")){ %>
<h1>Login Success</h1>
<form action="list2.jsp">
	<input type="submit" value="List users">
</form>
<% session.setAttribute("display", "true"); }else{%>


<jsp:forward page = "list.jsp"/>

<% }%>