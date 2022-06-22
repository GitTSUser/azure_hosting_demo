package com.wipro.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springboot.model.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer>{

}
