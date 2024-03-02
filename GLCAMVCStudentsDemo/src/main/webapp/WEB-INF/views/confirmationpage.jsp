<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<!-- 
String passengerName;
	String address;
	int age;
	String gender;
	int numberOfTickets;
	String sourceCity;
	String destinationCity;
	String dateOfJourney;
	String[] preferences;
	String classOfJourney; -->
<center><h3> Reservation Details Page!!</h3></center>
<center><h2>Passenger Name : ${reservationdata.passengerName}</h2></center>
<center><h2>Passenger Address : ${reservationdata.address}</h2></center>
<center><h2>Passenger Age : ${reservationdata.age}</h2></center>
<center><h2>Passenger Gender : ${reservationdata.gender}</h2></center>
<center><h2>No Of Tickets : ${reservationdata.numberOfTickets}</h2></center>
<center><h2>Source City : ${reservationdata.sourceCity}</h2></center>
<center><h2>Destination City: ${reservationdata.destinationCity}</h2></center>
<center><h2>Date Of Journey: ${reservationdata.dateOfJourney}</h2></center>
<center><h2>Preferences : ${reservationdata.preferences[0]}
${reservationdata.preferences[1]}
${reservationdata.preferences[2]}

</h2></center>
<center><h2>Passenger Name : ${reservationdata.classOfJourney}</h2></center>

<a href="/GLCAMVCStudentsDemo/greet/traindetails">Go Back To Home Page!!!</a>
<center><h3>Click Here to Proceed with Payments...</h3></center>
</body>
</html>