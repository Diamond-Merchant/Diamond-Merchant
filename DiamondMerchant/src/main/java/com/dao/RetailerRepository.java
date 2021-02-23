package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Retailer;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer, Integer>{

}
