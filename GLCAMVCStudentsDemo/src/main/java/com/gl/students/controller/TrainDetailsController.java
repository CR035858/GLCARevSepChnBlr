package com.gl.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.students.model.TrainDetail;
import com.gl.students.service.TrainDetailService;

@Controller
@RequestMapping("/traindetails")
public class TrainDetailsController {
	
	@Autowired
	TrainDetailService trainDetailService;
	
	@RequestMapping("/getTrainDetails")
	public String getTrainDetails(Model model)
	{
		List <TrainDetail> trainDetails = trainDetailService.getTrainDetailsSvc();
		model.addAttribute("trainDetails", trainDetails);
		return "traindata";
	}

}
