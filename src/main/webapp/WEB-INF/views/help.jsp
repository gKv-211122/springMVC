<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	
	<h3>this is help page</h3>
	<%
	/* 	String name = (String)request.getAttribute("name");
		Integer rollNumber = (Integer)request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
		
	%>
	
	
	
	<%
		/* out.print("Name: " + name + "  ||  " + "Roll Number: " + rollNumber);
		out.print("\nTime: " + time.toString()); */
	%>
	<%-- <%= time.toString()%> --%>
	<h4>
		Name: ${name} <br>
		Roll Number: ${rollNumber} <br>
		Date Time: ${time}
		
	</h4>
	<hr>
	
	<c:forEach var="item" items="${list}">
		${item}
		<c:out value="${item}"></c:out>
	
	</c:forEach>
	
</body>
</html>