package com.controller;

import java.util.List;

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
import com.bean.Employee;
import com.service.EmployeeService;


	@RestController
	@RequestMapping(value = "employee")
	@CrossOrigin
	public class EmployeeController {
		
		@Autowired
		EmployeeService employeeservice;
		
		@GetMapping(value = "allEmployeeData", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List < Employee > getAllEmployeeDetailsFromSpringData() {
	        return employeeservice.getAllEmployeeFromSpringData();
	    }
		
		@GetMapping(value="getEmployeeNameAsc",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getEmployeeNameAsc() {
			return employeeservice.getEmployeeNameAsc();
		}
		
		@GetMapping(value="getCustomerNameDsc",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getEmployeeNameDsc() {
			return employeeservice.getEmployeeNameDsc();
		}
		
		
		@PostMapping(value = "storeEmployeeData", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String storeEmployeeSpringData(@RequestBody Employee e) {
			return employeeservice.storeEmployeeSpringData(e);
		}
		
		
		@DeleteMapping(value="deleteEmployeeData/{eid}",produces = MediaType.TEXT_PLAIN_VALUE)
		public String deleteEmployeeSpringData(@PathVariable("eid") int eid) {
			return employeeservice.deleteEmployeeSpringData(eid);
		} 
		
		
		@PutMapping(value="updateEmployeeData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
		public String updateEmployeeSpringData(@RequestBody Employee e) {
			return employeeservice.updateEmployeeSpringData(e);
		}
		
}
