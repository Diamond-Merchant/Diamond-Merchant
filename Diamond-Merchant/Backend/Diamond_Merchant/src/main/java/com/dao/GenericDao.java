package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Bill;
import com.bean.Customer;
import com.bean.Employee;
import com.bean.Orders;
import com.bean.Product;
import com.bean.Retailer;
import com.bean.Store;

@Repository
public class GenericDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	// Sort By Bill Price ASC
	public List<Bill> getAllBillPriceByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price ");
		List<Bill> listOfBillByPrice = qry.getResultList();
		return listOfBillByPrice;
	}
				
				
	// Sort By Bill Price DESC
	public List<Bill> getAllBillPriceByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price desc ");
		List<Bill> listOfBillByPrice = qry.getResultList();
		return listOfBillByPrice;
	}
	
				
	
	// Sort By Product MRP ASC
	public List<Product> getAllProductAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp");
		List<Product> listOfProductByPrice = qry.getResultList();
		return listOfProductByPrice;
	}
	
	
	// Sort By Product MRP DESC
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
			
	
	// Sort By Product Manufacturer DESC
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
	
	
	// Sort By Customer Names ASC
	public List<Customer> getCustomerNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name");
		List<Customer> listOfCustomerByNames = qry.getResultList();
		return listOfCustomerByNames;
	}
				
				
	// Sort By Customer Name DESC
	public List<Customer> getCustomerNameByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name desc");
		List<Customer> listOfCustomerByNames = qry.getResultList();
		return listOfCustomerByNames;
	}
	
	
	// Sort By Employee Names ASC
	public List<Employee> getEmployeeNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename");
		List<Employee> listOfEmployeeByNames = qry.getResultList();
		return listOfEmployeeByNames;	
	}

				
	// Sort By Employee Names DESC
	public List<Employee> getEmployeeNameByDesc() {
	EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename desc");
		List<Employee> listOfEmployeeByNames = qry.getResultList();
		return listOfEmployeeByNames;
	}
	
	
	// Sort By Retailer Names ASC
	public List<Retailer> getRetailerNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname");
		List<Retailer> listOfRetailerByName = qry.getResultList();
		return listOfRetailerByName;
	}

	
	// Sort By Retailer Names DESC
	public List<Retailer> getRetailerNameByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname desc");
		List<Retailer> listOfRetailerByName = qry.getResultList();
		return listOfRetailerByName;
	}
		
}