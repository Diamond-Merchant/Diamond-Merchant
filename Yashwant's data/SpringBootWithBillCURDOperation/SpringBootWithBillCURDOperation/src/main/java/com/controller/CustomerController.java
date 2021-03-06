package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	CustomerService ps;
	
	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer pp) {
		return ps.storeCustomerSpringData(pp);
	}
	@GetMapping(value = "allCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomerDetailsFromSpringData(){
			return ps.getAllCustomerFromSpringData();
	}
	@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomerSpringData(@RequestBody Customer cs) {
			return ps.updateCustomerSpringData(cs);
	}
	
	@DeleteMapping(value = "deleteCustomerData/{customerId}")
	public String deleteProductSpringData(@PathVariable("customerId") int customerId) {
			return ps.deleteCustomerSpringData(customerId);
	}
}
