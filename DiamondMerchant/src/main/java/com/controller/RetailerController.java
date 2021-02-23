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

import com.bean.Retailer;
import com.service.RetailerService;

@RestController
@RequestMapping(value = "retailer")
public class RetailerController {
	
	@Autowired
	RetailerService retailerService;
	
	@GetMapping(value = "getRetailerData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Retailer > getAllRetailerDetailsFromSpringData() {
        return retailerService.getAllRetailerFromSpringData();
    }
	
	@PostMapping(value = "storeRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeRetailerSpringData(@RequestBody Retailer r) {
		return retailerService.storeRetailerSpringData(r);
	}
	
	@DeleteMapping(value="deleteRetailerData/{rid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteRetailerSpringData(@PathVariable("rid") int rid) {
		return retailerService.deleteRetailerSpringData(rid);
	} 
	
	@PutMapping(value="updateRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateRetailerSpringData(@RequestBody Retailer r) {
		return retailerService.updateRetailerSpringData(r);
	}
}
