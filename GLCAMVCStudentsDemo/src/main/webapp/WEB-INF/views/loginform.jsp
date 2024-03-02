<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<center><h3>Welcome to Login Page</h3></center>
<center>
<form:form action="/GLCAMVCStudentsDemo/logins/authenticate" modelAttribute="login">
<table>
<tr><td>Enter Login Id :</td><td><form:input path="loginId"/></td></tr>
<tr><td>Enter Password</td><td><form:password path="password"/></td></tr>
<tr>
<td><input type="submit" value="Login..." /></td>
<td><input type="reset" value="ReSet..." /></td>
</tr>
</table>
</form:form>
</center>

</body>
</html>