package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository pr;
	
	
	public List<Product> getAllProductFromSpringData() {
		 return pr.findAll();
	}
	
	
	public List<Product> getAllProductDescByPrice() {
		return pr.getAllProductDescByPrice();
	}
	
	
	public List<Product> getAllProductAscByPrice() {
		return pr.getAllProductAscByPrice();
	}
	
	
	public List<Product> getAllProductDescByPName() {
		return pr.getAllProductDescByPName();
	}
	
	
	public List<Product> getAllProductAscByPName() {
		return pr.getAllProductAscByPName();
	}
	
	
	public List<Product> getAllProductDescByPMFG() {
		return pr.getAllProductDescByPMFG();
	}
	
	
	public List<Product> getAllProductAscByPMFG() {
		return pr.getAllProductAscByPMFG();
	}
	
	
	public List<Product> getAllProductCategoryByRing() {
		return pr.getAllProductCategoryByRing();
	}
	
	
	public List<Product> getAllProductCategoryByBracelet() {
		return pr.getAllProductCategoryByBracelet();
	}
	
	
	public List<Product> getAllProductCategoryByNecklace() {
		return pr.getAllProductCategoryByNecklace();
	}
	
	
	public String storeProductSpringData(Product p) {
		Optional<Product> op = pr.findById(p.getPid());
		if(op.isPresent()) {
			return "Product Record Already Present";
		} else {
			Product pro = pr.save(p);
			if(pro!=null) {
				return "Product Record Stored SuccessFully";
			} else {
				return "Product Record Didn't Store";
			}
		}
	}
	 
	 
	public String deleteProductSpringData(int pid) {
		if(pr.existsById(pid)) {
			pr.deleteById(pid);
			return "Product Record Deleted SuccessFully";
		} else {
			return "Product Record Not Present";
		}
	}
	 
	 
	public String updateProductSpringData(Product p) {
		Optional<Product> obj = pr.findById(p.getPid());
		if(obj.isPresent()) {
			Product pro = obj.get();
			pro.setCostprice(p.getCostprice());
			pr.saveAndFlush(pro);	
			return "Product Record Updated Successfully";
		} else {
			return "Product Record Not Updated";
		}
	}
	 
	 
	// Search By Product Name or Product Price.
	public List<Product> listAllProduct(String keyword) {
		if (keyword != null) {
			return pr.search(keyword);
		}
	        return pr.findAll();
	}
	
	
	public Product findProductById(int pid) {
		
		Optional<Product> op = pr.findById(pid);
		if(op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}
	 
}
