package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	// Sort By Customer Name ASC
	@Query("SELECT c FROM Customer c order by name asc")
	public List<Customer> getCustomerNameByAsc();
		
		
	// Sort By Customer Name DESC
	@Query("SELECT c FROM Customer c order by name desc")
	public List<Customer> getCustomerNameByDesc();
	
}