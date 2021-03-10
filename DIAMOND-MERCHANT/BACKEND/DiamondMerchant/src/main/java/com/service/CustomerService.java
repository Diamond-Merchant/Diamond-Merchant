package com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bean.Customer;
import com.bean.Status;
import com.dao.GenericDao;
import com.repository.*;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	GenericDao genericdao;
	
	public List<Customer> getAllCustomerFromSpringData() {
		return customerRepo.findAll();
	}
	
	public List<Customer> getCustomerNameAsc(){
		return  genericdao.getCustomerNameAsc();
	}

	public List<Customer>getCustomerNameDsc(){
		return  genericdao.getCustomerNameDsc();
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
	
	
	public String deleteCustomerSpringData(long cid) {
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
		Customer custstore=null;
		int flag=0;
		for(Customer cust:listOfCust) {
			if((cust.getCemail().equals(customer.getCemail()))&&(cust.getPassword().equals(customer.getPassword()))) {
				custstore=cust;
				
				return "Success";
			}
			else
				return "fail";
		}
	return "0";
	}
	  
	

	
	
}
