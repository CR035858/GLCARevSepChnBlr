<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<center>
<form:form action="/GLCAMVCStudentsDemo/trainticket/process" modelAttribute="reservation">
<!-- String passengerName;
	String address;
	int age;
	String gender;
	int numberOfTickets;
	String sourceCity;
	String destinationCity;
	String dateOfJourney;
	String[] preferences;
	String classOfJourney; -->
<table>
<tr>
	<td>Enter Passenger Name </td>
	<td><form:input path="passengerName"/></td>
</tr>
<tr>
	<td>Enter Address</td>
	<td><form:textarea path="address"/></td>
</tr>
<tr>
	<td>Enter Age</td>
	<td><form:input path="age"/></td>
</tr>
<tr>
	<td>Select Gender</td>
	<td>
		Male : <form:radiobutton  path="gender" value="Male"/>
		FeMale : <form:radiobutton  path="gender" value="FeMale"/></td>
</tr>
<tr>
	<td>No Of Tickets</td>
	<td><form:input path="numberOfTickets"/>  </td>
</tr>
<tr>
	<td>Select Source City </td>
	<td>
		<form:select path="sourceCity">
			<form:option value="Bangalore" label="Bangalore"></form:option>
			<form:option value="Chennai" label="Chennai"></form:option>
			<form:option value="New Delhi" label="New Delhi"></form:option>		
			<form:option value="Mumbai" label="Mumbai"></form:option>	
			<form:option value="Kolkata" label="Kolkata"></form:option>
			<form:option value="Coimbatore" label="Coimbatore"></form:option>			
		</form:select>
	</td>
</tr>
<tr>
	<td>Select Source City </td>
	<td>
		<form:select path="destinationCity">
			<form:option value="Bangalore" label="Bangalore"></form:option>
			<form:option value="Chennai" label="Chennai"></form:option>
			<form:option value="New Delhi" label="New Delhi"></form:option>		
			<form:option value="Mumbai" label="Mumbai"></form:option>	
			<form:option value="Kolkata" label="Kolkata"></form:option>
			<form:option value="Coimbatore" label="Coimbatore"></form:option>			
		</form:select>
	</td>
</tr>
<tr>
	<td>Date Of Journey</td>
	<td><form:input path="dateOfJourney"/> </td>
</tr>
<tr>
	<td>Preferences :</td>
	<td>
		Vegetarian <form:checkbox path="preferences" value="Vegetarian"/>
		Non Vegetarian<form:checkbox path="preferences" value="NonVegetarian"/>
		Wifi<form:checkbox path="preferences" value="WifiEnabled"/>
		Smoking<form:checkbox path="preferences" value="Smoking"/>
		NonSmoking<form:checkbox path="preferences" value="NonSmoking"/>	
	</td>
</tr>
<tr>
	<td>Class Of Journey:</td>
	<td>
	FirstClass AC<form:radiobutton path="classOfJourney" value="FirstClass AC"/> 
	FirstClass NonAC<form:radiobutton path="classOfJourney" value="FirstClass NonAC"/> 
	SecondClass AC<form:radiobutton path="classOfJourney" value="SecondClass AC"/> 
	SecondClass NonAC<form:radiobutton path="classOfJourney" value="SecondClass NonAC"/> 
	</td>
</tr>
<tr>
	<td><input type="submit" value="Reserve Ticket" /></td>
	<td><input type="reset" value="ReSet Ticket Details" /></td>
</tr>

</table>
</form:form>
</center>
</body>
</html>