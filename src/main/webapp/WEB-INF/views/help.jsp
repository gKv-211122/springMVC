<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

	<%
		String name = (String)request.getAttribute("name");
		Integer rollNumber = (Integer)request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	
	<h4>this is help page</h4>
	
	<%
		out.print("Name: " + name + "  ||  " + "Roll Number: " + rollNumber);
		out.print("\nTime: " + time.toString());
	%>
	<%-- <%= time.toString()%> --%>
	
</body>
</html>