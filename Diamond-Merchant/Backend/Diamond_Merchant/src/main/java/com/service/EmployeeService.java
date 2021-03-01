package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.GenericDao;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	GenericDao genericdao;
	
	public List<Employee> getAllEmployeeFromSpringData() {
		 return employeeRepository.findAll();
	}
	
	
	public List<Employee> getEmployeeNameByAsc(){
		return  genericdao.getEmployeeNameByAsc();
	}

	
	public List<Employee>getEmployeeNameByDesc(){
		return  genericdao.getEmployeeNameByDesc();
	}
	
	
	public String storeEmployeeSpringData(Employee e) {
		Optional<Employee> op = employeeRepository.findById(e.getEid());
		if(op.isPresent()) {
			return "Employee Record Already Present";
		} else {
			Employee employee = employeeRepository.save(e);
			if(employee!=null) {
				return "Employee Record Stored SuccessFully";
			} else {
				return "Employee Record Didn't Store";
			}
		}
	}
	 
	 public String deleteEmployeeSpringData(int eid) {
		 if(employeeRepository.existsById(eid)) {
			 employeeRepository.deleteById(eid);
			 return "Employee Record Deleted SuccessFully";
		 } else {
			 return "Employee Record Not Present";
		 }
	 }
	 
	 
	 public String updateEmployeeSpringData(Employee e) {
		 Optional<Employee> obj = employeeRepository.findById(e.getEid());
		 if(obj.isPresent()) {
			 Employee employee = obj.get();
			 employee.setDesignation(e.getDesignation());
			 employeeRepository.saveAndFlush(employee);	
			 return "Employee Record Updated Successfully";
		 } else {
			 return "Employee Record Not Updated";
		 }
	}
	 

}