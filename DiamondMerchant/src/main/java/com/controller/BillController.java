package com.controller;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Bill;
import com.service.BillService;

@RestController
@RequestMapping(value = "bill")
public class BillController {
	
	@Autowired
	BillService billService;
	EntityManagerFactory emf;
	
	@GetMapping(value = "getBillData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Bill > getAllBillDetailsFromSpringData() {
        return billService.getAllBillFromSpringData();
    }
	
	@GetMapping(value="BillAscprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getBillAsc() {
		
		return billService.getAllBillAsc();
	}
	
	@GetMapping(value="BillAscbyprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getBillDesc() {
		
		return billService.getAllBillDesc();
	}
	
	@PostMapping(value = "storeBillData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeBillSpringData(@RequestBody Bill b) {
		return billService.storeBillSpringData(b);
	}
	
	@DeleteMapping(value="deleteBillData/{Bid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteBillSpringData(@PathVariable("Bid") int bid) {
		return billService.deleteBillSpringData(bid);
	} 
	
	@PutMapping(value="updateBillData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateBillSpringData(@RequestBody Bill b) {
		return billService.updateBillSpringData(b);
	}
	
	
	
}
