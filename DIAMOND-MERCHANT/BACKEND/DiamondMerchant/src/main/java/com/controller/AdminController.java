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

import com.bean.Admin;
import com.service.AdminService;

@RestController
@RequestMapping(value = "admin")
@CrossOrigin
public class AdminController {
	
	@Autowired
	AdminService as;
	
	@GetMapping(value = "getAdminData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Admin > getAllAdminDetailsFromSpringData() {
        return as.getAllAdminFromSpringData();
    }
	
	
	@PostMapping(value = "storeAdminData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeAdminSpringData(@RequestBody Admin a) {
		return as.storeAdminSpringData(a);
	}
	
	
	@DeleteMapping(value="deleteAdminData/{Aid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteAdminSpringData(@PathVariable("Aid") int aid) {
		return as.deleteAdminSpringData(aid);
	} 
	
	
	@PutMapping(value="updateAdminData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateAdminSpringData(@RequestBody Admin a) {
		return as.updateAdminSpringData(a);
	}
	
}
