<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
errorPage="ErrorHandler.jsp"
isErrorPage="false"
    pageEncoding="ISO-8859-1"%>
    <!--   When process data will get exception that time ErrorHandle page should execute -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
 int a=20,b=0,result;
%>

<%
b=Integer.parseInt(request.getParameter("t1"));
result=a+b;
out.write("<h1>Result= "+result+"</h1>");
%>
</body>
</html>