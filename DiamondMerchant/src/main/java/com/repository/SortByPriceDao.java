package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Orders;
import com.bean.Product;

@Repository
public class SortByPriceDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	
	public List<Product> getAllProductAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	
	public List<Product> getAllProductDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp desc");
		List<Product> listOfProduct = qry.getResultList();
		return listOfProduct;
	}
	
	
	public List<Orders> getAllOrdersAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice");
		List<Orders> listOfOrders = qry.getResultList();
		return listOfOrders;
	}
	
	
	public List<Orders> getAllOrdersDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice desc");
		List<Orders> listOfOrders = qry.getResultList();
		return listOfOrders;
	}
	
}
