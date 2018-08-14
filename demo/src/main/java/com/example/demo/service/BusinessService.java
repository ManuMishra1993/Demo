package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Business;
import com.example.demo.model.Customer;
import com.example.demo.repository.BusinessRepository;

@Service
public class BusinessService {
	
	@Autowired
	BusinessRepository businessRepository;

	public List<Business> getAll() {
		// TODO Auto-generated method stub
		return businessRepository.findAll();
	}

	public Optional<Business> getData(Integer id) {
		// TODO Auto-generated method stub
		return businessRepository.findById(id);
	}

	public String add(Business business) {
		// TODO Auto-generated method stub
		Business business1=new Business();
		business1.setCompanyName(business.getCompanyName());
		business1.setAddress(business.getAddress());
		business1.setNumber(business.getNumber());
		business1.setSector(business.getSector());
		business1.setCustomer(business.getCustomer());
		businessRepository.save(business1);
		return "Sucess";
	}

	public String update(Business business) {
		// TODO Auto-generated method stub
		Business business1=new Business();
		business1.setCompanyName(business.getCompanyName());
		business1.setAddress(business.getAddress());
		business1.setNumber(business.getNumber());
		business1.setSector(business.getSector());
		business1.setCustomer(business.getCustomer());
		businessRepository.save(business1);
		return "Sucess";
		
	}

	public String delete(Integer id) {
		// TODO Auto-generated method stub
		businessRepository.deleteById(id);
		return "Success";
	}

}
