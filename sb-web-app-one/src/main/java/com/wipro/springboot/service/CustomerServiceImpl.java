package com.wipro.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springboot.model.Customer;
import com.wipro.springboot.repo.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	private static List<Customer> customerList = new ArrayList<>();

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		customerList.add(customer);
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int id) {

		return customerList.stream().filter(customer -> customer.getId() == id).collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerList;
	}

}
