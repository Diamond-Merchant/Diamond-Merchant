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
public class SortByPriceDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	
	public List<Bill> getAllBillAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price ");
		List<Bill> listOfBill = qry.getResultList();
		return listOfBill;
	}
	
	public List<Bill> getAllBillDesc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price desc");
		List<Bill> listOfBill = qry.getResultList();
		return listOfBill;
	}
	
	
	
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
	   
	public List<Store> getAllStoreNameAsc() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select s.storeid, s.contact, s.address, s.storename, s.email , s.pname, s.productprice from Store s order by s.storename");
		List<Store> listOfStore = qry.getResultList();
		return listOfStore;
	}


		public List<Store> getAllStoreNameDesc() {
			EntityManager manager = emf.createEntityManager();
			Query qry = manager.createQuery(" select s.storeid, s.contact,s.address,s.storename,s.email ,s.pname,s.productprice from Store s order by s.storename desc");
			List<Store> listOfStore = qry.getResultList();
			return listOfStore;
		}

		
		

			public List<Customer> getCustomerNameAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery("select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name");
				List<Customer> listOfStore = qry.getResultList();
				return listOfStore;
			}

			public List<Customer> getCustomerNameDesc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name desc");
				List<Customer> listOfCustomer = qry.getResultList();
				return listOfCustomer;
			}

			public List<Employee> getEmployeeNameAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename");
				List<Employee> listOfEmployee = qry.getResultList();
				return listOfEmployee;	
			}

			public List<Employee> getEmployeeNameDesc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename desc");
				List<Employee> listOfEmployee = qry.getResultList();
				return listOfEmployee;
			}
	
		
			public List<Orders> getOrdersPriceAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery( "select o.oid,o.pname,o.oqty,o.oprice,o.odate,ostatus from Orders o order by o.oprice");
				List<Orders> listOfOrders = qry.getResultList();
				return listOfOrders;
			}

			public List<Orders> getOrdersPriceDesc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery("select o.oid,o.pname,o.oqty,o.oprice,o.odate,ostatus from Orders o order by o.oprice desc");
				List<Orders> listOfOrders = qry.getResultList();
				return listOfOrders;
			}
			
		

			public List<Retailer> getRetailerNameAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery( "select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname");
				List<Retailer> listOfRetailer = qry.getResultList();
				return listOfRetailer;
			}

			public List<Retailer> getRetailerNameDesc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery("select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname desc");
				List<Retailer> listOfRetailer = qry.getResultList();
				return listOfRetailer;
			}
	
	
}
