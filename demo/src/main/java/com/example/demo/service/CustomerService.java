package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	public Optional<Customer> getByid(Integer id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	public String add(Customer customer) {
		// TODO Auto-generated method stub
		Customer customer2=new Customer();
		customer2.setName(customer.getName());
		customerRepository.save(customer2);
		return "Success";
	}

	public String update(Customer customer) {
		// TODO Auto-generated method stub
		Customer customer2=new Customer();
		customer2.setName(customer.getName());
		customerRepository.save(customer2);
		return "Success";
		
	}

	public String delete(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return "Success";
	}
	
	
	

}
