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

import com.bean.Retailer;
import com.service.RetailerService;

@RestController
@RequestMapping(value = "retailer")
@CrossOrigin
public class RetailerController {
	
	@Autowired
	RetailerService rs;
	
	@GetMapping(value = "getRetailerData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Retailer > getAllRetailerDetailsFromSpringData() {
        return rs.getAllRetailerFromSpringData();
    }
	
	
	@GetMapping(value="getRetailerNameByAsc", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Retailer> getRetailerNameByAsc() {
		
		return rs.getRetailerNameByAsc();
	}
	
	
	@GetMapping(value="getRetailerNameByDesc", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Retailer> getRetailerNameByDesc() {
		
		return rs.getRetailerNameByDesc();
	}
	
	
	@PostMapping(value = "storeRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeRetailerSpringData(@RequestBody Retailer r) {
		return rs.storeRetailerSpringData(r);
	}
	
	
	@DeleteMapping(value="deleteRetailerData/{rid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteRetailerSpringData(@PathVariable("rid") int rid) {
		return rs.deleteRetailerSpringData(rid);
	} 
	
	
	@PutMapping(value="updateRetailerData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateRetailerSpringData(@RequestBody Retailer r) {
		return rs.updateRetailerSpringData(r);
	}
	
}
