package com.gl.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.students.model.Reservation;

@Controller
@RequestMapping("/trainticket")
public class ReservationController {
	
	
	@RequestMapping("/reserve")
	public String showReservationForm(Model model)
	{
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		return "reservationform";
	}
	
	@RequestMapping("/process")
	public String processReservationDetails(@ModelAttribute Reservation reservation,Model model)
	{
		model.addAttribute("reservationdata",reservation);		
		return "confirmationpage";
	}
	

}
