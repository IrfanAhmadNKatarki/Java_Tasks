package com.valtech.spring.boot.controllers;

import javax.persistence.PostPersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.valtech.spring.boot.entity.Car;
import com.valtech.spring.boot.service.CarService;

@Controller()
public class CarController {

	@GetMapping("/cars/newCar")
	public String newCar(){
		
		return "cars/newCar";
	}
	
	@Autowired
	private CarService carService;
	
	@PostMapping("/cars/updateCar/{id}")
	public ModelAndView saveUpdateCar(@PathVariable("id") int id, @ModelAttribute Car car, @RequestParam("submit") String submit )
	{
		
		ModelAndView view = new ModelAndView("cars/list");
		if(submit.equals("Cancel")){
			view.addObject("cars",carService.getAll());
			return view;
		}
		carService.update(car);
		view.addObject("cars", carService.getAll());
		return view;
		
	}
	
	@GetMapping("/cars/updateCar/{id}")
	public String updateCar(@PathVariable("id") int id, Model model){
		model.addAttribute("car", carService.getCar(id));
//		View view = new ModelAndView();
		
		return "cars/updateCar";
		
	}
	
	@PostMapping("cars/newCar")
	public ModelAndView saveNewCar(@ModelAttribute Car car ){ //modelattr auto ensures populate car object and give it
		
		ModelAndView mnv = new ModelAndView("cars/list");
		
		carService.createCar(car);
		mnv.getModel().put("cars", carService.getAll());
		return mnv;
		
	}
	@GetMapping("/cars/list")
	public String list(Model model){
		model.addAttribute("cars",carService.getAll());
		// car is stored as a list
		return "cars/list"; //prefix/cars/listssuffix /WEb-INF/views/cars/list.jsp
		
	}
	//engagement  adhmel hudugi udugthavne
}
