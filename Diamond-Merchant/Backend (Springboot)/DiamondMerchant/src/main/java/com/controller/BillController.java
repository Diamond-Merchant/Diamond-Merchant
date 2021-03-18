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

import com.bean.Bill;
import com.service.BillService;

@RestController
@RequestMapping(value = "bill")
@CrossOrigin
public class BillController {
	
	@Autowired
	BillService bs;
	
	@GetMapping(value = "getBillData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Bill > getAllBillDetailsFromSpringData() {
        return bs.getAllBillFromSpringData();
    }
	
	
	@GetMapping(value="getBillPriceByAsc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getAllBillPriceByAsc() {
		return bs.getAllBillPriceByAsc();
	}
	
	
	@GetMapping(value="getBillPriceByDesc",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getOrdersPriceByDesc() {
		return bs.getAllBillPriceByDesc();
	}
	
	
	@PostMapping(value = "storeBillData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeBillSpringData(@RequestBody Bill b) {
		return bs.storeBillSpringData(b);
	}
	
	
	@DeleteMapping(value="deleteBillData/{Bid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteBillSpringData(@PathVariable("Bid") int bid) {
		return bs.deleteBillSpringData(bid);
	} 
	
	
	@PutMapping(value="updateBillData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateBillSpringData(@RequestBody Bill b) {
		return bs.updateBillSpringData(b);
	}
	
	
	/* @GetMapping(value = "getBillCustomerData/{bid}")
	public ResponseEntity<List<Object[]>> getBillCustomerDetails(@PathVariable("bid") String id){
					List<Object[]> details = bs.getBillCustomerDetails(id);
					return ResponseEntity.status(200).body(details);
	}
	
	
	@GetMapping(value = "getBillRetailerData/{bid}")
	public ResponseEntity<List<Object[]>> getBillRetailerDetails(@PathVariable("bid") String id){
					List<Object[]> details = bs.getBillRetailerDetails(id);
					return ResponseEntity.status(200).body(details);
	} */
	
}
