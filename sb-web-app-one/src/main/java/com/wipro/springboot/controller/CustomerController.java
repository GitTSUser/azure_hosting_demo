package com.wipro.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.springboot.model.Customer;
import com.wipro.springboot.service.ICustomerService;

@Controller
public class CustomerController {


	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping("/showAddPage")
	public String showAddCustomerPage() {
		return "add-customer";
	}

	
	@RequestMapping("/add-customer")
	public String addCustomer(Customer customer) {
		
		customerService.saveCustomer(customer);
		
		return "add-customer-info";
	}
	
	@RequestMapping("/add-customer/v2")
	public String addCustomerVersionTwo(Customer customer) {
		
		customerService.saveCustomer(customer);
		
		return "redirect:/all-customers";
	}
	
	
	@RequestMapping("/all-customers")
	public ModelAndView getAllCustomers(ModelAndView mav) {
		List<Customer> allCustomers = customerService.getAllCustomers();
		
		mav.setViewName("show-customers");
		mav.addObject("customers", allCustomers);
		
		return mav;
		
	}	
}