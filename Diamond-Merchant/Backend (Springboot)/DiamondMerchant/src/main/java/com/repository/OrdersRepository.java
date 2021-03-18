package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bean.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer>{		// First parameter entity class and second parameter primary key
	
	// Search By Ordered Product Name or Product Order Price.
	@Query("SELECT o FROM Orders o WHERE o.pname LIKE %?1%" + " OR CONCAT(o.oprice, '') LIKE %?1%")  
	public List<Orders> search(String keyword);
	
	
	// Sort By Orders Product Name ASC
	@Query("SELECT o FROM Orders o order by pname asc")
	public List<Orders> getAllOrdersAscByPName();
	
	
	// Sort By Orders Product Name DESC
	@Query("SELECT o FROM Orders o order by pname desc")
	public List<Orders> getAllOrdersDescByPName();
		
		
	// Sort By Orders Price ASC
	@Query("SELECT o FROM Orders o order by oprice asc")
	public List<Orders> getAllOrdersAscByPrice();
		
		
	// Sort By Orders Price DESC
	@Query("SELECT o FROM Orders o order by oprice desc")
	public List<Orders> getAllOrdersDescByPrice();
		
		
	// Sort By Orders Status ASC
	@Query("SELECT o FROM Orders o order by ostatus asc")
	public List<Orders> getAllOrdersAscByOStatus();
		
		
	// Sort By Orders Status DESC
	@Query("SELECT o FROM Orders o order by ostatus desc")
	public List<Orders> getAllOrdersDescByOStatus();
	
}
