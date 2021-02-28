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

import com.bean.Product;
import com.bean.Retailer;
import com.service.RetailerService;

@RestController
@RequestMapping(value = "retailer")
public class RetailerController {
	
	@Autowired
	RetailerService retailerservice;
	
	@GetMapping(value = "getRetailerData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Retailer > getAllRetailerDetailsFromSpringData() {
        return retailerservice.getAllRetailerFromSpringData();
    }
	
	@GetMapping(value="getRetailerNameAsc", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Retailer> getRetailerNameAsc() {
		
		return retailerservice.getRetailerNameAsc();
	}
	
	
	@GetMapping(value="getRetailerNameDsc", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Retailer> getRetailerNameDsc() {
		
		return retailerservice.getRetailerNameDsc();
	}
	
	
	@PostMapping(value = "storeRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeRetailerSpringData(@RequestBody Retailer r) {
		return retailerservice.storeRetailerSpringData(r);
	}
	
	
	@DeleteMapping(value="deleteRetailerData/{rid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteRetailerSpringData(@PathVariable("rid") int rid) {
		return retailerservice.deleteRetailerSpringData(rid);
	} 
	
	
	@PutMapping(value="updateRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateRetailerSpringData(@RequestBody Retailer r) {
		return retailerservice.updateRetailerSpringData(r);
	}
	
}
