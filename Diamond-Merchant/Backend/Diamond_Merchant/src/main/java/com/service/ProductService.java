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
	ProductRepository pr;
	
	@Autowired
	GenericDao gd;
	
	
	public List<Product> getAllProductFromSpringData() {
		 return pr.findAll();
	}
	
	
	public List<Product> getAllProductDescByPrice() {
		return gd.getAllProductDescByPrice();
	}
	
	
	public List<Product> getAllProductAscByPrice() {
		return gd.getAllProductAscByPrice();
	}
	
	
	public List<Product> getAllProductDescByPName() {
		return gd.getAllProductDescByPName();
	}
	
	
	public List<Product> getAllProductAscByPNmae() {
		return gd.getAllProductAscByPName();
	}
	
	
	public List<Product> getAllProductDescByPMFG() {
		return gd.getAllProductDescByPMFG();
	}
	
	
	public List<Product> getAllProductAscByPMFG() {
		return gd.getAllProductAscByPMFG();
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
	
	
	public List<Object[]> productOrdersDetails(String id) {
		return gd.getProductsOrders(id);
	}
	
	
	public List<Object[]> productStoreDetails(String id) {
		return gd.getProductStores(id);
	}
	 
}
