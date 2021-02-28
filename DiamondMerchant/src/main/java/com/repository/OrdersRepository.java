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
	
}
