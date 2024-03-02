package com.gl.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.students.dao.TrainDetailsDao;
import com.gl.students.model.TrainDetail;

@Service
public class TrainDetailService {
	
	@Autowired
	TrainDetailsDao trainDetailsDao;
	
	public List <TrainDetail> getTrainDetailsSvc()
	{
		return trainDetailsDao.getTrainDetailsDao();
	}

}
