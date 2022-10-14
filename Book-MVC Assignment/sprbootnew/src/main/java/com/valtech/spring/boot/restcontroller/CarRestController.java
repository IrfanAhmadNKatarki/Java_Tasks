package com.valtech.spring.boot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.spring.boot.entity.Car;
import com.valtech.spring.boot.service.CarService;

@RestController
public class CarRestController {

	@Autowired
	private CarService carService;

	
	@PutMapping("/api/cars/{id}")
	public Car updateCar(@PathVariable("id") int id, @RequestBody Car car){
		
		car.setId(id);
		return carService.update(car);
		
	}
	
	@PostMapping("/api/cars")
	public Car createCar(@RequestBody Car car){
		
		
		return carService.createCar(car);
	}
	
	@GetMapping("/api/cars")
	public List<Car> getCars(){
		
		return carService.getAll(); 
	}
	
	@GetMapping("/api/cars/{id}")
	public Car getCar(@PathVariable("id") int id){

		return carService.getCar(id);
	
   }
	
}
