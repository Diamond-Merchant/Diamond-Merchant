package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.GenericDao;
import com.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	
	@Autowired
	GenericDao genericdao;
	
	
	public List<Product> getAllProductFromSpringData() {
		 return productrepository.findAll();
	 }
	
	
	public List<Product> getAllProductAsc() {
		return genericdao.getAllProductAsc();
	}
	
	
	public List<Product> getAllProductDsc() {
		return genericdao.getAllProductDsc();
	}
	
	
	public List<Product> getAllProductDescByPName() {
		return genericdao.getAllProductDescByPName();
	}
	
	
	public List<Product> getAllProductAscByPNmae() {
		return genericdao.getAllProductAscByPName();
	}
	
	public List<Product> getAllProductDescByPMFG() {
		return genericdao.getAllProductDescByPMFG();
	}
	
	
	public List<Product> getAllProductAscByPMFG() {
		return genericdao.getAllProductAscByPMFG();
	}
	
	
	public String storeProductSpringData(Product p) {
			Optional<Product> op = productrepository.findById(p.getPid());
			if(op.isPresent()) {
				return "Product Record Already Present";
			} else {
				Product pro = productrepository.save(p);
				if(pro!=null) {
					return "Product Record Stored SuccessFully";
				} else {
					return "Product Record Didn't Store";
				}
			}
		 }
	 
	 
	 public String deleteProductSpringData(int pid) {
		 if(productrepository.existsById(pid)) {
			 productrepository.deleteById(pid);
			 return "Product Record Deleted SuccessFully";
		 } else {
			 return "Product Record Not Present";
		 }
	 }
	 
	 
	 public String updateProductSpringData(Product p) {
		 Optional<Product> obj = productrepository.findById(p.getPid());
		 if(obj.isPresent()) {
			 Product pro = obj.get();
			 pro.setCostprice(p.getCostprice());
			 productrepository.saveAndFlush(pro);	
			 return "Product Record Updated Successfully";
	 } else {
		 return "Product Record Not Updated";
	 }
	}
	 
	 
	// Search By Product Name or Product Price.
	public List<Product> listAllProduct(String keyword) {
	        if (keyword != null) {
	            return productrepository.search(keyword);
	        }
	        return productrepository.findAll();
	}
	 
}
