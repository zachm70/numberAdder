<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userNumbers.getNumber1()} <br />
${userNumbers.getNumber2()} <br />
${userNumbers.getNumber3()} <br />
</p>

<a href="index.jsp">Choose new numbers </a>
</body>
</html>