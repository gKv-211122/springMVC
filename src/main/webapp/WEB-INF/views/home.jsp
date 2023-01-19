<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h5>this is home page</h5>
	<p>called by home controller</p>
	<p>url /home</p>
	
	<%
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("id");
	
	%>
	<p>Name is: <%=name%> || Id is: <%=id%> </p>
	
	
	<% 
		List<String> friends = (List<String>) request.getAttribute("f");
		for(String s: friends) {
			out.print(s);
		}
	%>
	
</body>
</html>