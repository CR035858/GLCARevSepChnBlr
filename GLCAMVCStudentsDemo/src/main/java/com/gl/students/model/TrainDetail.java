package com.gl.students.model;

public class TrainDetail 
{
	
	String trainId;
	String trainName;
	String routeNo;
	String sourceCity;
	String destinationCity;
	int distanceInKms;
	
	
	public TrainDetail() {
		super();
	}


	public TrainDetail(String trainId, String trainName, String routeNo, String sourceCity, String destinationCity,
			int distanceInKms) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.routeNo = routeNo;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.distanceInKms = distanceInKms;
	}


	public String getTrainId() {
		return trainId;
	}


	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}


	public String getTrainName() {
		return trainName;
	}


	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}


	public String getRouteNo() {
		return routeNo;
	}


	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
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


	public int getDistanceInKms() {
		return distanceInKms;
	}


	public void setDistanceInKms(int distanceInKms) {
		this.distanceInKms = distanceInKms;
	}


	@Override
	public String toString() {
		return "TrainDetails [trainId=" + trainId + ", trainName=" + trainName + ", routeNo=" + routeNo
				+ ", sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", distanceInKms="
				+ distanceInKms + "]";
	}
	
	

}
