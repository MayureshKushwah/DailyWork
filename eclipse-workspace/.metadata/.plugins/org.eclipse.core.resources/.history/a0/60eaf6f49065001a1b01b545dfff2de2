<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setMaxInactiveInterval(10);
	%>
	<!--  this above line set max time of session ie after 10 sec if we refresh page session timeout -->
	<!--  com.cts.bean.LoginBean ref= new LoginBean(), ie we are creating the object of class -->
	<jsp:useBean id="ref" class="com.cts.bean.LoginBean"
		scope="application" />

	<!--  below line is similar to this... ref.setUserName(request.getParameter("userName"))   -->
	<%-- <jsp:setProperty property="userName" name="ref"/>
<jsp:setProperty property="password" name="ref"/>
 --%>
 <!-- method 2 to for all -->
	<jsp:setProperty property="*" name="ref" />
	<jsp:forward page="view.jsp" />
</body>
</html>