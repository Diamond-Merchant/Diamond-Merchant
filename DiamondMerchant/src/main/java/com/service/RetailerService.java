package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.bean.Orders;
import com.bean.Retailer;
import com.dao.SortByPriceDao;
import com.repository.RetailerRepository;

@Service
public class RetailerService {
	
	@Autowired
	RetailerRepository retailerRepository;
	
	@Autowired
	SortByPriceDao sbp;
	
	public List<Retailer> getAllRetailerFromSpringData() {
		 return retailerRepository.findAll();
	 }

	public List<Retailer> getRetailerNameAsc() {
		return sbp.getRetailerNameAsc();
	}


	public List<Retailer> getRetailerNameDesc() {
		return sbp.getRetailerNameDesc();
	}
	
	 public String storeRetailerSpringData(Retailer r) {
			Optional<Retailer> op = retailerRepository.findById(r.getRid());
			if(op.isPresent()) {
				return "Retailer Record Already Present";
			} else {
				Retailer ret = retailerRepository.save(r);
				if(ret!=null) {
					return "Retailer Record Stored SuccessFully";
				} else {
					return "Retailer Record Didn't Store";
				}
			}
		 }
	 
	 public String deleteRetailerSpringData(int rid) {
		 if(retailerRepository.existsById(rid)) {
			 retailerRepository.deleteById(rid);
			 return "Retailer Record Deleted SuccessFully";
		 } else {
			 return "Retailer Record Not Present";
		 }
	 }
	 
	 
	 public String updateRetailerSpringData(Retailer r) {
		 Optional<Retailer> obj = retailerRepository.findById(r.getRid());
		 if(obj.isPresent()) {
			 Retailer ret = obj.get();
			 ret.setRphone(r.getRphone());
			 retailerRepository.saveAndFlush(ret);	
			 return "Retailer Record Updated Successfully";
	 } else {
		 return "Retailer Record Not Updated";
	 }
	}


	 
}
