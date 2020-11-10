<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Data Page</title>
</head>
<body>
	<h4>Emp Data Page</h4>
	<pre>
	Employee Data : ${emp} 
	ID     :${emp.id}
	Name   :${emp.name} 
	Salary :${emp.salary}
	
	<a href="/api/home">Home</a>
	</pre>
</body>
</html>