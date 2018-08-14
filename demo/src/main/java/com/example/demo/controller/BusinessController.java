package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Business;
import com.example.demo.service.BusinessService;

@RestController
public class BusinessController {
	
	@Autowired
	BusinessService businessService;
	
	@GetMapping("/getAllDetails")
	public List<Business> getAllData(){
		return businessService.getAll();
	}
	
	@GetMapping("/getData/{id}")
	public Optional<Business> getData(@PathVariable Integer id) {
		return businessService.getData(id);
	}
	
	@PostMapping("/addBusiness")
	public String addData(@RequestBody Business business) {
		return businessService.add(business);
	}
	
	@PutMapping("/updateBusiness")
	public String updateData(@RequestBody Business business) {
		return businessService.update(business);
	}
	
	@DeleteMapping("/deleteBusiness/{id}")
	public String deleteData(@PathVariable Integer id) {
		return businessService.delete(id);
	}
		
	

}
