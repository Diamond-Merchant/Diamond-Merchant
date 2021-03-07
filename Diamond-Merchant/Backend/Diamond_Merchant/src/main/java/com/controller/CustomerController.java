package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@GetMapping(value = "allCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomerDetailsFromSpringData(){
			return cs.getAllCustomerFromSpringData();
	}
	
	
	@GetMapping(value="getCustomerNameByAsc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomerNameByAsc() {
		return cs.getCustomerNameByAsc();
	}
	
	
	@GetMapping(value="getCustomerNameByDesc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomerNameByDesc() {
		return cs.getCustomerNameByDesc();
	}
	
	
	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer pp) {
		return cs.storeCustomerSpringData(pp);
	}
	
	
	@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomerSpringData(@RequestBody Customer c) {
			return cs.updateCustomerSpringData(c);
	}
	
	
	@DeleteMapping(value = "deleteCustomerData/{customerId}")
	public String deleteProductSpringData(@PathVariable("customerId") int customerId) {
			return cs.deleteCustomerSpringData(customerId);
	}
	
	
	@GetMapping(value = "customerOrderData/{customerid}")
	public ResponseEntity<List<Object[]>> getCustomerOrdersDetails(@PathVariable("customerid") String cid){
					List<Object[]> details = cs.customerOrdersDetails(cid);
					return ResponseEntity.status(200).body(details);
	}
}