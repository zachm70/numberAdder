<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Adder</title>
</head>
<body>

	<h1>Number Adder</h1>
	<form action="getAddServlet" method="post">
	Enter two numbers: <input type="text" name="userNumber1" size="10">
	<input type="text" name="userNumber2" size="10">
	<input type="submit" value="Calculate"/>
	</form>


</body>
</html>