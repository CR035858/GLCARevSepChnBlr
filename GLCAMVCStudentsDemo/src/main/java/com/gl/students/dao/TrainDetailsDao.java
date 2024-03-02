package com.gl.students.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl.students.model.TrainDetail;

@Repository
public class TrainDetailsDao {
	
	/*
	 * String trainId;
	String trainName;
	String routeNo;
	String sourceCity;
	String destinationCity;
	int distanceInKms;
	 * 
	 */
	List <TrainDetail> trainDetails;
	
	public TrainDetailsDao()
	{
		trainDetails = new ArrayList<TrainDetail>();
		TrainDetail traindetail1 = new TrainDetail("T001","Shatabdi","12234","Chennai","Bangalore",350);
		TrainDetail traindetail2 = new TrainDetail("T002","Cauvery Exp","12234","Bangalore","Mysor",145);
		TrainDetail traindetail3 = new TrainDetail("T003","HimSagar","12334","Kashmir","Kanyakumari",3350);
		TrainDetail traindetail4 = new TrainDetail("T004","LalbaghExpress","11234","Chennai","Bangalore",350);
		TrainDetail traindetail5 = new TrainDetail("T005","Rajdhani","22234","NewDelhi","Bangalore",2500);
		trainDetails.add(traindetail1);
		trainDetails.add(traindetail2);
		trainDetails.add(traindetail3);
		trainDetails.add(traindetail4);
		trainDetails.add(traindetail5);
	}
	
	public List <TrainDetail> getTrainDetailsDao()
	{
		return trainDetails;
	}
	

}
