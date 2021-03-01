package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Store;


@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {		
	
	// Search By Ordered Product Name or Product Order Price.
	@Query("SELECT s FROM Store s WHERE s.storename LIKE %?1%" + " OR CONCAT(s.address, '') LIKE %?1%")
   
	public List<Store> search(String keyword);
	
}




