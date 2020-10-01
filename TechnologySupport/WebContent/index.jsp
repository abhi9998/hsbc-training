<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<div align="center">
<h1>Technical Support Request</h1>
<hr><br/><br/>
<form action="registerandcheck" method="post">
<table>
<tr><td>Email:</td><td><input type="email" name="email"></td></tr>
<tr>
<td>Software:</td><td><input type="text" name="software"></td>
<td><div style="margin-left: 50px">OS:</td><td><input type="text" name="os"></div></td><br/><br/>

</tr>
</table>
<br/><br/>
<p>Problem Description</p>
<textarea rows="10" cols="100" placeholder="Enter Description" name="description"></textarea>
<br/><br/>
<input type="submit" name="button" value="Submit Request">

</form>
<hr>
</div>

</body>
</html>