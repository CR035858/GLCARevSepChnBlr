<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<!-- 
String trainId;
	String trainName;
	String routeNo;
	String sourceCity;
	String destinationCity;
	int distanceInKms; -->
<center>
<h3>Welcome to Train details Page!!!</h3>
<h3>Following are the Trains Available....</h3>
<table border="2">
<tr><th>Train Id</th><th>Train Name</th><th>Route NO</th><th>Source City</th><th>Destination City</th><th>Distance(kms)</th></tr>
<c:forEach items="${trainDetails}" var="train">
<tr>
<td>${train.trainId}</td>
<td>${train.trainName}</td>
<td>${train.routeNo}</td>
<td>${train.sourceCity}</td>
<td>${train.destinationCity}</td>
<td>${train.distanceInKms}</td>
</tr>
</c:forEach>
</table>
<a href="/GLCAMVCStudentsDemo/greet/traindetails">Go Back to Train Reservation Page...</a>
</center>
</body>
</html>