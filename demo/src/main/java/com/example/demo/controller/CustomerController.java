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

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getAllCustomer")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@GetMapping("/getCustomer/{id}")
	public Optional<Customer> getByID(@PathVariable Integer id) {
		return customerService.getByid(id);
	}
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.add(customer);
	}
	
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer ) {
		return customerService.update(customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Integer id) {
		return customerService.delete(id);
	}
	
	

}
