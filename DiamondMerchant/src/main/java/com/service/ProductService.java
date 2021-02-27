package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;
import com.repository.SortByPriceDao;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository pr;
	
	@Autowired
	SortByPriceDao sbp;
	
	public List<Product> getAllProductFromSpringData() {
		 return pr.findAll();
	 }
	
	
	public List<Product> getAllProductDesc() {
		return sbp.getAllProductDesc();
	}
	
	
	public List<Product> getAllProductAsc() {
		return sbp.getAllProductAsc();
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
	 
}
