package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Bill;
import com.repository.BillRepository;
import com.dao.SortByPriceDao;

@Service
public class BillService {
	
	@Autowired
	BillRepository billRepository;
	
	@Autowired
	SortByPriceDao sbp;
	
	public List<Bill> getAllBillFromSpringData() {
		 return billRepository.findAll();
	 }
	
	
	public List<Bill> getAllBillAsc() {
		return sbp.getAllBillAsc();
	}
	
	public List<Bill> getAllBillDesc() {
		return sbp.getAllBillDesc();
	}
	
	 public String storeBillSpringData(Bill b) {
			Optional<Bill> op = billRepository.findById(b.getBid());
			if(op.isPresent()) {
				return "Bill Record Already Present";
			} else {
				Bill bill = billRepository.save(b);
				if(bill!=null) {
					return "Bill Record Stored SuccessFully";
				} else {
					return "Bill Record Didn't Store";
				}
			}
		 }
	 
	 public String deleteBillSpringData(int bid) {
		 if(billRepository.existsById(bid)) {
			 billRepository.deleteById(bid);
			 return "Bill Record Deleted SuccessFully";
		 } else {
			 return "Bill Record Not Present";
		 }
	 }
	 
	 
	 public String updateBillSpringData(Bill b) {
		 Optional<Bill> obj = billRepository.findById(b.getBid());
		 if(obj.isPresent()) {
			 Bill bill = obj.get();
			 bill.setPrice(b.getPrice());
			 billRepository.saveAndFlush(bill);	
			 return "Bill Record Updated Successfully";
	 } else {
		 return "Bill Record Not Updated";
	 }
	}
	 
	 public List<Bill> findAllOrderByPriceAsc() {
		 return billRepository.findAll();
	 }
	 
	
}
