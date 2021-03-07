package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Orders;
import com.service.OrdersService;


@RestController
@RequestMapping(value="orders")
@CrossOrigin
public class OrdersController {
	
	@Autowired
	OrdersService os;


	//http://localhost:8090/orders/allOrdersData
	@GetMapping(value = "allOrdersData",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getAllOrdersDetailsFromSpringData() {
		return os.getAllOrdersFormSpringData();
	}
	
	@GetMapping(value="getOrdersDescByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersDescByPrice() {
		return os.getAllOrdersDescByPrice();
	}
	
	@GetMapping(value="getOrdersAscByPrice",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersAscByPrice() {
		return os.getAllOrdersAscByPrice();
	}
	
	
	@GetMapping(value="getOrdersDescByPName",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersDescByPName() {
		return os.getAllOrdersDescByPName();
	}
	
	@GetMapping(value="getOrdersAscByPName",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersAscByPName() {
		return os.getAllOrdersAscByPrice();
	}
	
	@GetMapping(value="getOrdersDescByOStatus",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersDescByOStatus() {
		return os.getAllOrdersDescByOStatus();
	}
	
	@GetMapping(value="getOrdersAscByOStatus",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> getOrdersAscByOStatus() {
		return os.getAllOrdersAscByOStatus();
	}


	//http://localhost:8090/orders/storeOrdersData
	@PostMapping(value = "storeOrdersData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Orders oo) {
		return os.storeOrdersSpringData(oo);
	}


	//http://localhost:8090/orders/updateOrdersData
	@PutMapping(value = "updateOrdersData",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateOrdersDataSpringData(@RequestBody Orders oo) {
		return os.updateOrdersSpringData(oo);
	}	


	//http://localhost:8090/orders/deleteOrdersData/6
	@DeleteMapping(value = "deleteOrdersData/{oid}")
	public String deleteOrderspringData(@PathVariable("oid") int oid) {
		return os.deleteOrdersSpringData(oid);
	}
	
	// Search By Ordered Product Name or Product Order Price.
	@GetMapping(value="search/{keyword}")
	public List<Orders> getSearchOrdersByPNameAndPrice(@PathVariable("keyword") String keyword) {
		return os.listAllOrders(keyword);
	}
	
	
	@GetMapping(value = "findOrdersById/{oid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Orders getOrdersById(@PathVariable("oid") int oid) {
		return os.findOrdersById(oid);
	}
	
	
	@GetMapping(value = "getOrderFromCustomerData/{oid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object[]>> getOrderFromCustomerDetails(@PathVariable("oid") String id){
					List<Object[]> details = os.getOrderFromCustomerDetails(id);
					return ResponseEntity.status(200).body(details);
	}
	
	
	@GetMapping(value = "getOrderFromRetailerData/{oid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Object[]>> getOrderFromRetailerDetails(@PathVariable("oid") String id){
					List<Object[]> details = os.getOrderFromRetailerDetails(id);
					return ResponseEntity.status(200).body(details);
	}

}


