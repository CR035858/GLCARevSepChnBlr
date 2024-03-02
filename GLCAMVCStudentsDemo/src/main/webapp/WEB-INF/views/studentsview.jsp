<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<center><h3>Welcome to Students Data Page</h3></center>
<center>
<table border="2">
<tr><th>StudentId</th><th>StudentName</th><th>Stud Address</th><th>Subject1</th><th>Subject2</th><th>Subject3</th><th>Subject4</th><th>Subject5</th></tr>
<c:forEach items="${myStudents}" var="student">
<!-- 
for(Student s:myStudents)
{

}
String studId;
	String studName;
	String studAddress;
	int[] scores=new int[5]; -->
<tr>
<td>${student.studId}</td>
<td>${student.studName}</td>
<td>${student.studAddress}</td>
<td>${student.scores[0]}</td>
<td>${student.scores[1]}</td>
<td>${student.scores[2]}</td>
<td>${student.scores[3]}</td>
<td>${student.scores[4]}</td>
</tr>

</c:forEach>
</table>
</center>


</body>
</html>