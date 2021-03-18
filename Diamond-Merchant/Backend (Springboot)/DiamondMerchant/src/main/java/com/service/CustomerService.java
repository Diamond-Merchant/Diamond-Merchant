package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.repository.*;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public List<Customer> getAllCustomerFromSpringData() {
		return customerRepo.findAll();
	}
	
	
	public List<Customer> getCustomerNameByAsc(){
		return  customerRepo.getCustomerNameByAsc();
	}

	
	public List<Customer>getCustomerNameByDesc(){
		return  customerRepo.getCustomerNameByDesc();
	}
	
	
	public String storeCustomerSpringData(Customer cs) {
		Optional<Customer> op = customerRepo.findById(cs.getCustomerid());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Customer c = customerRepo.save(cs);			
			if(c!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}
	
	
	public String deleteCustomerSpringData(int cid) {
		if(customerRepo.existsById(cid)) {
			customerRepo.deleteById(cid);
				return "Record deleted successfully";
		 }else {
			return "Record not present";
		}
	}
	
	
	public String updateCustomerSpringData(Customer cs) {
        Optional<Customer> obj = customerRepo.findById(cs.getCustomerid());
        if(obj.isPresent()) {
        	Customer p = obj.get();
            p.setPhonenumber(cs.getPhonenumber());
            customerRepo.saveAndFlush(p);   
            return "Record Updated Successfully";
        } else {
        	return "Record Not Updated";
        }
	}

	//login
	public String loginCustomer(Customer customer) {
		List<Customer> listOfCust = customerRepo.findAll();
		
		int flag=0;
		for(Customer cust:listOfCust) {
			if((cust.getCemail().equals(customer.getCemail()))&&(cust.getPassword().equals(customer.getPassword()))) {
				
				
				return "Success";
			}
			else
				return "fail";
		}
	return "0";
	}
		
}