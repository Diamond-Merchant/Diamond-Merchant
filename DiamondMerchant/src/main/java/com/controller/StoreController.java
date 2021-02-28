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
import com.bean.Store;
import com.service.StoreService;

@RestController
@RequestMapping(value="store")
public class StoreController {
@Autowired
StoreService storeservice;
	


	//http://localhost:8090/Store/allStoreData
	@GetMapping(value = "allStoreData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getAllOrdersDetailsFromSpringData()
	{
			return storeservice.getAllStoreFormSpringData();
	}
	
	@GetMapping(value="StoreAscStoreName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getAllStoreNameAsc() {
		return storeservice.getAllStoreNameAsc();
	}
	
	@GetMapping(value="StoreDescbyStoreName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getAllStoreNameDesc() {
		return storeservice.getAllStoreNameDesc();
	}

	//http://localhost:8090/Store/storeStoreData
	@PostMapping(value = "storeStoreData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Store ss) 
	{
		return storeservice.storeStoreSpringData(ss);
	}
	
	//http://localhost:8090/Store/updateStoreData
	@PutMapping(value = "updateStoreData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateOrdersDataSpringData(@RequestBody Store ss) {
			return storeservice.updateStoreSpringData(ss);
	}
	
	//http://localhost:8090/Store/deleteStoreData/104
	@DeleteMapping(value = "deleteStoreData/{storeid}")
	public String deleteStorespringData(@PathVariable("storeid") int storeid) {
			return storeservice.deleteStoreSpringData(storeid);
	}





}
