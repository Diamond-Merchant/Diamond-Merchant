package com.controller;

import java.util.List;

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
import com.bean.Orders;
import com.service.BillService;

@RestController
@RequestMapping(value = "bill")
public class BillController {
	
	@Autowired
	BillService billservice;
	
	@GetMapping(value = "getBillData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Bill > getAllBillDetailsFromSpringData() {
        return billservice.getAllBillFromSpringData();
    }
	
	@GetMapping(value="getOrdersAscByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getAllBillAscByPrice() {
		return billservice.getAllBillAscByPrice();
	}
	
	@GetMapping(value="getBillDescByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getOrdersDscByPrice() {
		return billservice.getAllBillsDscByPrice();
	}
	
	@PostMapping(value = "storeBillData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeBillSpringData(@RequestBody Bill b) {
		return billservice.storeBillSpringData(b);
	}
	
	
	@DeleteMapping(value="deleteBillData/{Bid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteBillSpringData(@PathVariable("Bid") int bid) {
		return billservice.deleteBillSpringData(bid);
	} 
	
	
	@PutMapping(value="updateBillData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateBillSpringData(@RequestBody Bill b) {
		return billservice.updateBillSpringData(b);
	}
}
