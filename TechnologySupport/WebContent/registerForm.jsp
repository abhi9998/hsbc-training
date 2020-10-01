<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1>Customer Registration Form</h1>
<hr>
<h2>Please register</h2>
<form action="registerandcheck" method="post">
<table>
<tr><td>Email</td><td><input type="email", name="email"></td></tr>
<tr><td>First Name</td><td><input type="text", name="fname"></td></tr>
<tr><td>Last Name</td><td><input type="text", name="lname"></td></tr>
<tr><td>Mobile Number</td><td><input type="text", name="mobile"><br/></td></tr>
<tr><td><input type="submit" name = "button" value="Register"></td></tr>
</table>
</form>

</body>
</html>