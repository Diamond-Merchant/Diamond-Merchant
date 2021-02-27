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
	ProductRepository productRepository;
	
	public List<Product> getAllProductFromSpringData() {
		 return productRepository.findAll();
	 }
	
	
	 public String storeProductSpringData(Product p) {
			Optional<Product> op = productRepository.findById(p.getPid());
			if(op.isPresent()) {
				return "Product Record Already Present";
			} else {
				Product pro = productRepository.save(p);
				if(pro!=null) {
					return "Product Record Stored SuccessFully";
				} else {
					return "Product Record Didn't Store";
				}
			}
		 }
	 
	 public String deleteProductSpringData(int pid) {
		 if(productRepository.existsById(pid)) {
			 productRepository.deleteById(pid);
			 return "Product Record Deleted SuccessFully";
		 } else {
			 return "Product Record Not Present";
		 }
	 }
	 
	 
	 public String updateProductSpringData(Product p) {
		 Optional<Product> obj = productRepository.findById(p.getPid());
		 if(obj.isPresent()) {
			 Product pro = obj.get();
			 pro.setCostprice(p.getCostprice());
			 productRepository.saveAndFlush(pro);	
			 return "Product Record Updated Successfully";
	 } else {
		 return "Product Record Not Updated";
	 }
	}
	 
}
