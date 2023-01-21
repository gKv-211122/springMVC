<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>${Header}</h3>
	<p>${Desc}</p>
	<h3 style="color: green;" >${msg}</h3>
	<hr>
	
<%-- 	<h3>Welcome, ${name}</h3>
	<h3>Your email address is: ${email}</h3>
	<h3>Your password is: ${password}</h3> --%>
	
	<h3>Welcome, ${user.userName}</h3>
	<h3>Your email address is: ${user.email}</h3>
	<h3>Your password is: ${user.password}</h3>
	
</body>
</html>