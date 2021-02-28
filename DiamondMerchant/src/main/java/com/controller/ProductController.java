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

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping(value = "product")
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	
	@GetMapping(value = "getProductData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Product > getAllProductDetailsFromSpringData() {
        return ps.getAllProductFromSpringData();
    }
	
	
	@GetMapping(value="productDescByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDescByPrice() {
		
		return ps.getAllProductDescByPrice();
	}
	
	
	@GetMapping(value="productAscByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAscByPrice() {
		
		return ps.getAllProductAscByPrice();
	}
	
	
	@GetMapping(value="productDescByPName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDescByPName() {
		
		return ps.getAllProductDescByPName();
	}
	
	
	@GetMapping(value="productAscByPName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAscByPName() {
		
		return ps.getAllProductAscByPNmae();
	}
	
	
	@GetMapping(value="productDescByPMFG", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDescByPMFG() {
		
		return ps.getAllProductDescByPMFG();
	}
	
	
	@GetMapping(value="productAscByPMFG", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAscByPMFG() {
		
		return ps.getAllProductAscByPMFG();
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
	
	// Search By Product Name or Product Price.
	@GetMapping(value="search/{keyword}")
	public List<Product> getSearchProductByPnameAndPrice(@PathVariable("keyword") String keyword)
	{
		
		return ps.listAllProduct(keyword);
	}
	
}
