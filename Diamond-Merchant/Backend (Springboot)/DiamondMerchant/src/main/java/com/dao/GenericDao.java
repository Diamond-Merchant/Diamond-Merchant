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
		Query qry = manager.createQuery("select b from Bill b order by price ");
		List<Bill> listOfBillByPrice = qry.getResultList();
		return listOfBillByPrice;
	}
				
				
	// Sort By Bill Price DESC
	public List<Bill> getAllBillPriceByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select b from Bill b order by price desc ");
		List<Bill> listOfBillByPrice = qry.getResultList();
		return listOfBillByPrice;
	}
	
				
	
	// Sort By Product MRP ASC
	public List<Product> getAllProductAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by mrp asc");
		List<Product> listOfProductByPrice = qry.getResultList();
		return listOfProductByPrice;
	}
	
	
	// Sort By Product MRP DESC
	public List<Product> getAllProductDescByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by mrp desc");
		List<Product> listOfProductByPrice = qry.getResultList();
		return listOfProductByPrice;
	}
	
	
	// Sort By Product Name ASC
	public List<Product> getAllProductAscByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by pname");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
		
	
	// Sort By Product Name DESC
	public List<Product> getAllProductDescByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by pname desc");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
	
	
	// Sort By Product Manufacturer ASC
	public List<Product> getAllProductAscByPMFG() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by manufacturer");
		List<Product> listOfProductByPMFG = qry.getResultList();
		return listOfProductByPMFG;
	}
			
	
	// Sort By Product Manufacturer DESC
	public List<Product> getAllProductDescByPMFG() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select p from Product p order by manufacturer desc");
		List<Product> listOfProductByPName = qry.getResultList();
		return listOfProductByPName;
	}
	
	
	// List Product Category By Ring
	public List<Product> getAllProductCategoryByRing() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select pr from Product pr where category='Ring'");
		List<Product> listOfProductCategoryByRing = qry.getResultList();
		return listOfProductCategoryByRing;
	}
	
	
	// List Product Category By Bracelet
	public List<Product> getAllProductCategoryByBracelet() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select pb from Product pb where category='Bracelet'");
		List<Product> listOfProductCategoryByBracelet = qry.getResultList();
		return listOfProductCategoryByBracelet;
	}
		
		
	// List Product Category By Necklace
	public List<Product> getAllProductCategoryByNecklace() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select pn from Product pn where category='Necklace'");
		List<Product> listOfProductCategoryByNecklace = qry.getResultList();
		return listOfProductCategoryByNecklace;
	}
	
	
	// Sort By Orders Price ASC
	public List<Orders> getAllOrdersAscByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by oprice");
		List<Orders> listOfOrdersByPrice = qry.getResultList();
		return listOfOrdersByPrice;
	}
	
	
	// Sort By Orders Price DESC
	public List<Orders> getAllOrdersDescByPrice() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by oprice desc");
		List<Orders> listOfOrdersByPrice = qry.getResultList();
		return listOfOrdersByPrice;
	}
	
	
	// Sort By Orders Product Name ASC
	public List<Orders> getAllOrdersAscByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by pname");
		List<Orders> listOfOrdersByPName = qry.getResultList();
		return listOfOrdersByPName;
	}
	
	
	// Sort By Orders Product Name DESC
	public List<Orders> getAllOrdersDescByPName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by pname desc");
		List<Orders> listOfOrdersByPName = qry.getResultList();
		return listOfOrdersByPName;
	}
	
	
	// Sort By Orders Status ASC
	public List<Orders> getAllOrdersAscByOStatus() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by ostatus");
		List<Orders> listOfOrdersByOStatus = qry.getResultList();
		return listOfOrdersByOStatus;
	}
		
	
	// Sort By Orders Status DESC
	public List<Orders> getAllOrdersDescByOStatus() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select o from Orders o order by ostatus desc");
		List<Orders> listOfOrdersByOStatus = qry.getResultList();
		return listOfOrdersByOStatus;
	}
	
	
	// Sort By Store Name ASC
	public List<Store> getAllStoresAscBySName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s from Store s order by storename");
		List<Store> listOfStoresBySName = qry.getResultList();
		return listOfStoresBySName;
	}
	
	
	// Sort By Store Name DESC
	public List<Store> getAllStoresDescBySName() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select s from Store s order by storename desc");
		List<Store> listOfStoresBySName = qry.getResultList();
		return listOfStoresBySName;
	}
	
	
	// Sort By Customer Names ASC
	public List<Customer> getCustomerNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select c from Customer c order by name");
		List<Customer> listOfCustomerByNames = qry.getResultList();
		return listOfCustomerByNames;
	}
				
				
	// Sort By Customer Name DESC
	public List<Customer> getCustomerNameByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery(" select c from Customer c order by name desc");
		List<Customer> listOfCustomerByNames = qry.getResultList();
		return listOfCustomerByNames;
	}
	
	
	// Sort By Employee Names ASC
	public List<Employee> getEmployeeNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select e from Employee e order by ename");
		List<Employee> listOfEmployeeByNames = qry.getResultList();
		return listOfEmployeeByNames;	
	}

				
	// Sort By Employee Names DESC
	public List<Employee> getEmployeeNameByDesc() {
	EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select e from Employee e order by ename desc");
		List<Employee> listOfEmployeeByNames = qry.getResultList();
		return listOfEmployeeByNames;
	}
	
	
	// Sort By Retailer Names ASC
	public List<Retailer> getRetailerNameByAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery( "select r from Retailer r order by rname");
		List<Retailer> listOfRetailerByName = qry.getResultList();
		return listOfRetailerByName;
	}

	
	// Sort By Retailer Names DESC
	public List<Retailer> getRetailerNameByDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select r from Retailer r order by rname desc");
		List<Retailer> listOfRetailerByName = qry.getResultList();
		return listOfRetailerByName;
	}
	
	
	// Join Customer with Orders, Store and Product
	public List<Object[]> getCustomerOrders(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select c.customerid,c.name,c.phonenumber,c.address,c.cemail,o.oid,p.pname,p.category,p.mrp,o.oqty,o.odate,o.ostatus,s.storename,s.contact from customer c, orders o, store s, product p where c.customerid=o.cid and p.pid=o.pid and o.oid=s.oid and o.cid=:custid");
		qry.setParameter("custid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Get Product Order Details from Order and Store
	public List<Object[]> getProductsOrders(String id) {
		EntityManager manager  = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select p.pid,p.pname,p.category,p.mrp,p.manufacturer,s.storename,s.contact,o.oid,o.ostatus,o.oqty,o.odate from product p,store s,orders o where p.pid=o.pid and p.sid=s.storeid and o.oid =:odrid");
		qry.setParameter("odrid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Retailer with Orders, Store and Product
	public List<Object[]> getRetailerOrders(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select r.rid,r.rname,r.rphone,r.raddress,r.remail,o.oid,p.pname,p.category,p.mrp,o.oqty,o.odate,o.ostatus,s.storename,s.contact from retailer r, orders o, store s, product p where r.rid=o.rid and p.pid=o.pid and o.oid=s.oid and o.rid=:retid");
		qry.setParameter("retid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Product with Store
	public List<Object[]> getProductStores(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select p.pid,p.pname,p.category,p.shelflocation,p.manufacturer,p.mrp,s.storename,s.contact,s.address,s.email from product p,store s where p.pid=s.pid and p.pid=:proid");
		qry.setParameter("proid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Employee with Store
	public List<Object[]> getEmployeeStores(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select e.eid,e.ename,e.gender,e.ephonenumber,e.birthdate,e.joiningdate,e.designation,e.email,s.storename,s.contact,s.address from employee e,store s where e.eid=s.eid and e.eid=:Eid");
		qry.setParameter("Eid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Orders with Customer and Product
	public List<Object[]> getOrdersFromCustomer(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select o.oid,c.customerid,c.name,c.gender,c.phonenumber,c.address,c.cemail,p.pid,p.pname,p.category,p.manufacturer,o.oqty,p.mrp,o.odate,o.ostatus from orders o,customer c,product p where o.oid=c.oid and o.pid=p.pid and o.oid=:oid");
		qry.setParameter("oid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Orders with Retailer and Product
	public List<Object[]> getOrdersFromRetailer(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select o.oid,r.rid,r.rname,r.rphone,r.raddress,r.remail,p.pid,p.pname,p.category,p.manufacturer,o.oqty,p.mrp,o.odate,o.ostatus from orders o,retailer r,product p where o.oid=r.oid and o.pid=p.pid and o.oid=:oid");
		qry.setParameter("oid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	// Join Bill with Customer, Employee, Store, Order and Product
	public List<Object[]> getBillCustomerDetails(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select b.bid,e.eid,e.ename,e.ephonenumber,e.designation,c.customerid,c.name,c.phonenumber,c.address,c.cemail,s.storeid,s.storename,s.contact,o.oid,p.pname,p.category,p.manufacturer,p.mrp,o.oqty,o.odate,o.ostatus from bill b,customer c, employee e, store s, orders o,product p where b.cid=c.customerid and b.eid=e.eid and b.sid=s.storeid and b.oid=o.oid and b.pid=p.pid and b.bid=:bid");
		qry.setParameter("bid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
	
	
	
	// Join Bill with Retailer, Employee, Store, Order and Product
	public List<Object[]> getBillRetailerDetails(String id) {
		EntityManager manager = emf.createEntityManager();
		Query qry =manager.createNativeQuery("select b.bid,e.eid,e.ename,e.ephonenumber,e.designation,r.rid,r.rname,r.rphone,r.raddress,r.remail,s.storeid,s.storename,s.contact,o.oid,p.pname,p.category,p.manufacturer,p.mrp,o.oqty,o.odate,o.ostatus from bill b,retailer r, employee e, store s, orders o,product p where b.rid=r.rid and b.eid=e.eid and b.sid=s.storeid and b.oid=o.oid and b.pid=p.pid and b.bid=:bid");
		qry.setParameter("bid", id);
		List<Object[]> list = qry.getResultList();
		return list;
	}
		
		
}