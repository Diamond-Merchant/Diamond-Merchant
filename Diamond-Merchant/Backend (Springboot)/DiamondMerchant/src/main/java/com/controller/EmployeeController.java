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

import com.bean.Employee;
import com.service.EmployeeService;


@RestController
@RequestMapping(value = "employee")
@CrossOrigin
public class EmployeeController {
		
	@Autowired
	EmployeeService es;
		
	@GetMapping(value = "allEmployeeData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List < Employee > getAllEmployeeDetailsFromSpringData() {
		return es.getAllEmployeeFromSpringData();
	}
	
	
	@GetMapping(value="getEmployeeNameByAsc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeNameByAsc() {
		return es.getEmployeeNameByAsc();
	}
	
	@GetMapping(value="getCustomerNameByDesc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeNameByDesc() {
		return es.getEmployeeNameByDesc();
	}
		
		
	@PostMapping(value = "storeEmployeeData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployeeSpringData(@RequestBody Employee e) {
		return es.storeEmployeeSpringData(e);
	}
		
		
	@DeleteMapping(value="deleteEmployeeData/{eid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteEmployeeSpringData(@PathVariable("eid") int eid) {
		return es.deleteEmployeeSpringData(eid);
	} 
		
		
	@PutMapping(value="updateEmployeeData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateEmployeeSpringData(@RequestBody Employee e) {
		return es.updateEmployeeSpringData(e);
	}
	
	
	/* @GetMapping(value = "employeeFromStoreData/{eid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object[]>> getemployeeStoreDetails(@PathVariable("eid") String id){
					List<Object[]> details = es.employeeStoreDetails(id);
					return ResponseEntity.status(200).body(details);
	} */
		
}
