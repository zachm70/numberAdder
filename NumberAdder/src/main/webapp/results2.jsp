<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>

<h1>Results</h1>
<p>${userNumber.getNumber()} <br />
${userNumber.print()} <br />
</p>

<a href="index.jsp">Choose new number </a>

</body>
</html>