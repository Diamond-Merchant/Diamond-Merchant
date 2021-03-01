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
	ProductService productservice;
	
	
	@GetMapping(value = "getProductData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List < Product > getAllProductDetailsFromSpringData() {
        return productservice.getAllProductFromSpringData();
    }
	
	
	@GetMapping(value="productDescByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductDsc() {
		return productservice.getAllProductDsc();
	}
	
	
	@GetMapping(value="productAscByPrice", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProductAsc() {
		
		return productservice.getAllProductAsc();
	}
	
	
	@GetMapping(value="productDescByPName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDescByPName() {
		
		return productservice.getAllProductDescByPName();
	}
	
	
	@GetMapping(value="productAscByPName", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAscByPName() {
		
		return productservice.getAllProductAscByPNmae();
	}
	
	
	@GetMapping(value="productDescByPMFG", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsDescByPMFG() {
		
		return productservice.getAllProductDescByPMFG();
	}
	
	
	@GetMapping(value="productAscByPMFG", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductsAscByPMFG() {
		
		return productservice.getAllProductAscByPMFG();
	}
	
	@PostMapping(value = "storeProductData", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProductSpringData(@RequestBody Product p) {
		return productservice.storeProductSpringData(p);
	}
	
	
	@DeleteMapping(value="deleteProductData/{Pid}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteProductSpringData(@PathVariable("Pid") int pid) {
		return productservice.deleteProductSpringData(pid);
	} 
	
	
	@PutMapping(value="updateProductData", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateProductSpringData(@RequestBody Product p) {
		return productservice.updateProductSpringData(p);
	}
	
	// Search By Product Name or Product Price.
	@GetMapping(value="search/{keyword}")
	public List<Product> getSearchProductByPnameAndPrice(@PathVariable("keyword") String keyword)
	{
		
		return productservice.listAllProduct(keyword);
	}
	
}
