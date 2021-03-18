package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Retailer;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Integer>{
	
	// Sort By Retailer Names ASC
	@Query("SELECT r FROM Retailer r order by rname asc")
	public List<Retailer> getRetailerNameByAsc();
		
		
	// Sort By Retailer Name DESC
	@Query("SELECT r FROM Retailer r order by rname desc")
	public List<Retailer> getRetailerNameByDesc();
	
}
