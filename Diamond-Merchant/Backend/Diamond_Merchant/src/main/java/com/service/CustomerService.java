package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
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
	
	
	
}
