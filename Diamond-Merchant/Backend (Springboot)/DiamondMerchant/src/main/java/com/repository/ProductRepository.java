package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	// Search By Product Name or Product Price.
	@Query("SELECT p FROM Product p WHERE p.pname LIKE %?1%" + " OR CONCAT(p.mrp, '') LIKE %?1%")
	public List<Product> search(String keyword);
	
	
	// Sort By Product Name ASC
	@Query("SELECT p FROM Product p order by pname asc")
    public List<Product> getAllProductAscByPName();
	
	
	// Sort By Product Name DESC
	@Query("SELECT p FROM Product p order by pname desc")
    public List<Product> getAllProductDescByPName();
	
	
	// Sort By Product MRP ASC
	@Query("SELECT p FROM Product p order by mrp asc")
    public List<Product> getAllProductAscByPrice();
	
	
	// Sort By Product MRP DESC
	@Query("SELECT p FROM Product p order by mrp desc")
    public List<Product> getAllProductDescByPrice();
	
	
	// Sort By Product Manufacturer ASC
	@Query("SELECT p FROM Product p order by manufacturer asc")
    public List<Product> getAllProductAscByPMFG();
	
	
	// Sort By Product Manufacturer DESC
	@Query("SELECT p FROM Product p order by manufacturer desc")
    public List<Product> getAllProductDescByPMFG();
	
	
	// List Product Category By Ring
	@Query("SELECT p FROM Product p where category='Ring'")
    public List<Product> getAllProductCategoryByRing();
	
	
	// List Product Category By Bracelet
	@Query("SELECT p FROM Product p where category='Bracelet'")
    public List<Product> getAllProductCategoryByBracelet();
	
	
	// List Product Category By Necklace
	@Query("SELECT p FROM Product p where category='Necklace'")
    public List<Product> getAllProductCategoryByNecklace();
	
	
}
