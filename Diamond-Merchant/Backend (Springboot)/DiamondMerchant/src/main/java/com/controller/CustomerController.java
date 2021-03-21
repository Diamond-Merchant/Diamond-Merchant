package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	CustomerService customerservice;
	
	@GetMapping(value = "allCustomerData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getAllCustomerDetailsFromSpringData(){
			return customerservice.getAllCustomerFromSpringData();
	}
	
	@GetMapping(value="getCustomerNameAsc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomerNameAsc() {
		return customerservice.getCustomerNameByAsc();
	}
	
	@GetMapping(value="getCustomerNameDsc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomerNameDsc() {
		return customerservice.getCustomerNameByDesc();
	}
	
	
	@PostMapping(value = "storeCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerSpringData(@RequestBody Customer pp) {
		return customerservice.storeCustomerSpringData(pp);
	}
	
	
	@PutMapping(value = "updateCustomerData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCustomerSpringData(@RequestBody Customer cs) {
			return customerservice.updateCustomerSpringData(cs);
	}
	
	
	@PutMapping(value = "updatePassword",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
	public String updatePassword(@RequestBody Customer cc) {
		return customerservice.updatePassword(cc);
	}
	
	
	@DeleteMapping(value = "deleteCustomerData/{customerId}")
	public String deleteProductSpringData(@PathVariable("customerId") int customerId) {
			return customerservice.deleteCustomerSpringData(customerId);
	}
	
	
	@PostMapping(value="login",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer checkloginData(@RequestBody Customer c,HttpServletRequest request)
	{
		Customer cust=customerservice.loginCustomer(c);
		if(cust==null)
		{
			System.out.print("NULL CAME");
			return null;
		}
		else
		{
		HttpSession session=request.getSession();
		session.setAttribute("cemail", cust.getCemail());
		session.setAttribute("password",cust.getPassword());
		System.out.print("RAN");
		return cust;
		}
		
		
	}
	

}