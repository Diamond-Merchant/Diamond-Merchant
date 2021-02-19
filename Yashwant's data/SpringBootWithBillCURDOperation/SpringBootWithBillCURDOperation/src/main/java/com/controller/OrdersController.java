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

import com.bean.Orders;
import com.service.OrdersService;


@RestController
@RequestMapping(value="orders")
public class OrdersController {
@Autowired
OrdersService os;
	
@GetMapping(value="Info")
public String SimpleMessage() {
	return "welcome to spring rest Product Controller";
}
//http://loscalhost:8090/orders/allOrdersData
@GetMapping(value = "allOrdersData",produces = MediaType.APPLICATION_JSON_VALUE)
public List<Orders> getAllOrdersDetailsFromSpringData(){
		return os.getAllOrdersFormSpringData();
}

//http://localhost:8090/orders/storeOrdersData
@PostMapping(value = "storeOrdersData",consumes = MediaType.APPLICATION_JSON_VALUE)
public String storeProductSpringData(@RequestBody Orders oo) {
	return os.storeOrdersSpringData(oo);
}
//http://localhost:8090/orders/updateOrdersData/
@PutMapping(value = "updateOrdersData",consumes = MediaType.APPLICATION_JSON_VALUE)
public String updateOrdersDataSpringData(@RequestBody Orders oo) {
		return os.updateOrdersSpringData(oo);
}
//http://localhost:8090/orders/deleteOrdersData/6
@DeleteMapping(value = "deleteOrdersData/{oid}")
public String deleteOrderspringData(@PathVariable("oid") int oid) {
		return os.deleteOrdersSpringData(oid);
}





}


