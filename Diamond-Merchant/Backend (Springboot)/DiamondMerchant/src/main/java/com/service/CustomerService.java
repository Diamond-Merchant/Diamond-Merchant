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
	
	
	public String updatePassword(Customer cc) {

	     Optional<Customer> obj=customerRepo.findById(cc.getCustomerid());
		   if(obj.isPresent()) {
			Customer c=obj.get();
			if(c!=null) {
			c.setPassword(cc.getPassword());
	        customerRepo.saveAndFlush(c);
	        return "Password Changed Successfully";
			}else {
				return "Error";
			}
		}else {
			return "Invalid Customer Id";
		}
	}
	

	//login
	public Customer loginCustomer(Customer c) {
		List<Customer> listofC=customerRepo.findAll();
		Customer cust1=null;
		int flag=0;
		for(Customer cust:listofC)
		{
			//if(cust.getCust_id()==c.getCust_id()) {
			if((cust.getCemail().equals(c.getCemail())) && (cust.getPassword().equals(c.getPassword()))) {
				cust1=cust;
			}
		}
		return cust1;
	}
		
}