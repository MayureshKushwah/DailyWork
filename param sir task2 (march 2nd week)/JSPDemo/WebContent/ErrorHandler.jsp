<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
isErrorPage="true"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
When process data will get exeption that time this page should execute
<h1 style="font-size: 30; color: red">An Internal Error Occured</h1>
<%
exception.printStackTrace(); 
%>
<!-- upper we have make isErrorPage="true", this will show error at the console and developer can now see that error occured -->
</body>
</html>