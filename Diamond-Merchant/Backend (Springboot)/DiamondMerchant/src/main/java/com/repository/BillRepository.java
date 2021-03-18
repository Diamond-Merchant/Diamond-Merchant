package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer>{
	
	// Sort By Bill Name ASC
	@Query("SELECT b FROM Bill b order by price asc")
	public List<Bill> getAllBillPriceByAsc();
		
		
	// Sort By Bill Name DESC
	@Query("SELECT b FROM Bill b order by price desc")
	public List<Bill> getAllBillPriceByDesc();
	
}
