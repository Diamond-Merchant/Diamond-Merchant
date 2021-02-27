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
import com.service.ProductService;

@RestController
@RequestMapping(value = "product")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	
	@GetMapping(value = "getProductData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Product > getAllProductDetailsFromSpringData() {
        return ps.getAllProductFromSpringData();
    }
	
	
	@GetMapping(value="productdescbyprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDesc() {
		
		return ps.getAllProductDesc();
	}
	
	
	@GetMapping(value="productascprice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAsc() {
		
		return ps.getAllProductAsc();
	}
	
	
	@PostMapping(value = "storeProductData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Product p) {
		return ps.storeProductSpringData(p);
	}
	
	
	@DeleteMapping(value="deleteProductData/{Pid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteProductSpringData(@PathVariable("Pid") int pid) {
		return ps.deleteProductSpringData(pid);
	} 
	
	
	@PutMapping(value="updateProductData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateProductSpringData(@RequestBody Product p) {
		return ps.updateProductSpringData(p);
	}
	
}
