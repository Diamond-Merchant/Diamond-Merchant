package com.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Orders;
import com.bean.Product;
import com.bean.Store;

@Repository
public class GenericDao {
	
	@Autowired
	EntityManagerFactory emf;

	
	// Sort By Product Price ASC
	public List<Product> getAllProductAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp");
		List<Product> listOfProductByPrice = qry.getResultList();
		return listOfProductByPrice;
	}
	
	
	// Sort By Product Price DESC
	public List<Product> getAllProductDescByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp desc");
		List<Product> listOfProductByPrice = qry.getResultList();
		return listOfProductByPrice;
	}
	
	
	// Sort By Product Name ASC
	public List<Product> getAllProductAscByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.pname");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
		
	
	// Sort By Product Name DESC
	public List<Product> getAllProductDescByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.pname desc");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
	
	
	// Sort By Product Manufacturer ASC
	public List<Product> getAllProductAscByPMFG() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.manufacturer");
		List<Product> listOfProductByPMFG = qry.getResultList();
		return listOfProductByPMFG;
	}
			
	
	// Sort By Product Name DESC
	public List<Product> getAllProductDescByPMFG() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.manufacturer desc");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
	
	
	// Sort By Orders Price ASC
	public List<Orders> getAllOrdersAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice");
		List<Orders> listOfOrdersByPrice = qry.getResultList();
		return listOfOrdersByPrice;
	}
	
	
	// Sort By Orders Price DESC
	public List<Orders> getAllOrdersDescByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice desc");
		List<Orders> listOfOrdersByPrice = qry.getResultList();
		return listOfOrdersByPrice;
	}
	
	
	// Sort By Orders Product Name ASC
	public List<Orders> getAllOrdersAscByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.pname");
		List<Orders> listOfOrdersByPName = qry.getResultList();
		return listOfOrdersByPName;
	}
	
	
	// Sort By Orders Product Name DESC
	public List<Orders> getAllOrdersDescByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.pname desc");
		List<Orders> listOfOrdersByPName = qry.getResultList();
		return listOfOrdersByPName;
	}
	
	
	// Sort By Orders Status ASC
	public List<Orders> getAllOrdersAscByOStatus() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.ostatus");
		List<Orders> listOfOrdersByOStatus = qry.getResultList();
		return listOfOrdersByOStatus;
	}
		
	
	// Sort By Orders Status DESC
	public List<Orders> getAllOrdersDescByOStatus() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.ostatus desc");
		List<Orders> listOfOrdersByOStatus = qry.getResultList();
		return listOfOrdersByOStatus;
	}
	
	
	// Sort By Store Price ASC
	public List<Store> getAllStoresAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.productprice");
		List<Store> listOfStoresByPrice = qry.getResultList();
		return listOfStoresByPrice;
	}
	
	
	// Sort By Store Price DESC
	public List<Store> getAllStoresDescByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.productprice desc");
		List<Store> listOfStoresByPrice = qry.getResultList();
		return listOfStoresByPrice;
	}
	
	
	// Sort By Store Name ASC
	public List<Store> getAllStoresAscBySName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.storename");
		List<Store> listOfStoresBySName = qry.getResultList();
		return listOfStoresBySName;
	}
	
	
	// Sort By Store Name DESC
	public List<Store> getAllStoresDescBySName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.storename desc");
		List<Store> listOfStoresBySName = qry.getResultList();
		return listOfStoresBySName;
	}
	
}
