package com.wipro.springboot.service;

import java.util.List;

import com.wipro.springboot.model.Customer;

public interface ICustomerService {

	public Customer saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public List<Customer> getAllCustomers();

}
