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

import com.bean.Store;
import com.service.StoreService;

@RestController
@RequestMapping(value="store")
public class StoreController {

	@Autowired
	StoreService ss;
	

	//http://localhost:8090/Store/allStoreData
	@GetMapping(value = "allStoreData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getAllOrdersDetailsFromSpringData() {
			return ss.getAllStoreFormSpringData();
	}
	
	
	@GetMapping(value="storeDescByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getStoresDescByPrice() {
		return ss.getAllStoresDescByPrice();
	}
	
	
	@GetMapping(value="storeAscByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getStoresAscByPrice() {
		return ss.getAllStoresAscByPrice();
	}
	
	
	@GetMapping(value="storeDescByStoreName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getStoresDescBySName() {
		return ss.getAllStoresDescBySName();
	}
	
	
	@GetMapping(value="storeAscByStoreName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Store> getStoresAscBySName() {
		return ss.getAllStoresAscBySName();
	}

	
	//http://localhost:8090/Store/storeStoreData
	@PostMapping(value = "storeStoreData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Store s) 
	{
		return ss.storeStoreSpringData(s);
	}
	
	
	//http://localhost:8090/Store/updateStoreData
	@PutMapping(value = "updateStoreData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateOrdersDataSpringData(@RequestBody Store s) {
			return ss.updateStoreSpringData(s);
	}
	
	
	//http://localhost:8090/Store/deleteStoreData/104
	@DeleteMapping(value = "deleteStoreData/{storeid}")
	public String deleteStorespringData(@PathVariable("storeid") int storeid) {
			return ss.deleteStoreSpringData(storeid);
	}

	
	// Search By Store Name or Store Address.
	@GetMapping(value="search/{keyword}")
	public List<Store> getSearchStoreSNameAndAddress(@PathVariable("keyword") String keyword) {		
			return ss.listAllStore(keyword);
	}

}
