package com.gl.students.model;

import java.util.Arrays;

public class Reservation {
	
	String passengerName;
	String address;
	int age;
	String gender;
	int numberOfTickets;
	String sourceCity;
	String destinationCity;
	String dateOfJourney;
	String[] preferences;
	String classOfJourney;
	
	
	public Reservation() {
		super();
		preferences = new String[5];
	}


	public Reservation(String passengerName, String address, int age, String gender, int numberOfTickets,
			String sourceCity, String destinationCity, String dateOfJourney, String[] preferences,
			String classOfJourney) {
		super();
		this.passengerName = passengerName;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.numberOfTickets = numberOfTickets;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.dateOfJourney = dateOfJourney;
		this.preferences = preferences;
		this.classOfJourney = classOfJourney;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getNumberOfTickets() {
		return numberOfTickets;
	}


	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}


	public String getSourceCity() {
		return sourceCity;
	}


	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}


	public String getDateOfJourney() {
		return dateOfJourney;
	}


	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}


	public String[] getPreferences() {
		return preferences;
	}


	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}


	public String getClassOfJourney() {
		return classOfJourney;
	}


	public void setClassOfJourney(String classOfJourney) {
		this.classOfJourney = classOfJourney;
	}


	@Override
	public String toString() {
		return "Reservation [passengerName=" + passengerName + ", address=" + address + ", age=" + age + ", gender="
				+ gender + ", numberOfTickets=" + numberOfTickets + ", sourceCity=" + sourceCity + ", destinationCity="
				+ destinationCity + ", dateOfJourney=" + dateOfJourney + ", preferences=" + Arrays.toString(preferences)
				+ ", classOfJourney=" + classOfJourney + "]";
	}
	

}
