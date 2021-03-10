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

			//Bill By Price Ascending and Descending
				public List<Bill> getAllBillsAscByPrice() {
					EntityManager manager = emf.createEntityManager();
					Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price ");
					List<Bill> listOfBill = qry.getResultList();
					return listOfBill;
				}
				
				public List<Bill> getAllBillsDscByPrice() {
					EntityManager manager = emf.createEntityManager();
					Query qry = manager.createQuery("select b.bid,b.ename,b.cname,b.pname,b.qty,b.price,b.dop from Bill b order by b.price desc ");
					List<Bill> listOfBill = qry.getResultList();
					return listOfBill;
				}
	
	
			// Sort By Product Name ascending and descending
			public List<Product> getAllProductAscByPName() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.pname");
				List<Product> listOfProductByPName = qry.getResultList();
				return listOfProductByPName;
			}
				
			public List<Product> getAllProductDescByPName() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.pname desc");
				List<Product> listOfProductByPName = qry.getResultList();
				return listOfProductByPName;
			}
			
			//Product By Price Ascending and Descending
			public List<Product> getAllProductAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp");
				List<Product> listOfProduct = qry.getResultList();
				return listOfProduct;
			}
			
			
			public List<Product> getAllProductDsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select p.pid,p.pname,p.mrp,p.manufacturer from Product p order by p.mrp desc");
				List<Product> listOfProduct = qry.getResultList();
				return listOfProduct;
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
		

			
			//Sort by Orders price Ascending and Descending
			public List<Orders> getAllOrdersAscByPrice() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice");
				List<Orders> listOfOrdersByPrice = qry.getResultList();
				return listOfOrdersByPrice;
			}
		
			public List<Orders> getAllOrdersDescByPrice() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.oprice desc");
				List<Orders> listOfOrdersByPrice = qry.getResultList();
				return listOfOrdersByPrice;
			}
			
			// Sort By Orders Name Ascending and Descending
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
			
			
			// Sort By Orders Status ASC and Dsc
			public List<Orders> getAllOrdersAscByOStatus() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.ostatus");
				List<Orders> listOfOrdersByOStatus = qry.getResultList();
				return listOfOrdersByOStatus;
			}
				
	
			
			public List<Orders> getAllOrdersDescByOStatus() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select o.oid,o.pname,o.ostatus,o.oqty,o.odate,o.oprice from Orders o order by o.ostatus desc");
				List<Orders> listOfOrdersByOStatus = qry.getResultList();
				return listOfOrdersByOStatus;
			}
			
			
			// Sort By Store Price ASC and DSC
			public List<Store> getAllStoresAscByPrice() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.productprice");
				List<Store> listOfStoresByPrice = qry.getResultList();
				return listOfStoresByPrice;
			}
	
	
			
			public List<Store> getAllStoresDescByPrice() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.productprice desc");
				List<Store> listOfStoresByPrice = qry.getResultList();
				return listOfStoresByPrice;
			}
			
			
			// Sort By Store Name ascending and descending
			public List<Store> getAllStoresAscBySName() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.storename");
				List<Store> listOfStoresBySName = qry.getResultList();
				return listOfStoresBySName;
			}
			
			
			
			public List<Store> getAllStoresDescBySName() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery(" select s.storeid,s.storename,s.address,s.contact,s.email,s.pname,s.productprice from Store s order by s.storename desc");
				List<Store> listOfStoresBySName = qry.getResultList();
				return listOfStoresBySName;
			}
			
			//Customer By Names Ascending and Descending
			public List<Customer> getCustomerNameAsc() {
				EntityManager manager = emf.createEntityManager();
				Query qry = manager.createQuery("select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name");
				List<Customer> listOfStore = qry.getResultList();
				return listOfStore;
			}

			public List<Customer> getCustomerNameDsc() {
					EntityManager manager = emf.createEntityManager();
					Query qry = manager.createQuery(" select c.customerid, c.name, c.gender, c.phonenumber from Customer c order by c.name desc");
					List<Customer> listOfCustomer = qry.getResultList();
					return listOfCustomer;
			}
			
//			//LOGIN OF USER
//			public List<Customer> getUnamePass() {
//				EntityManager manager = emf.createEntityManager();
//				Query qry = manager.createQuery(" select c.cemail, c.password from Customer c");
//				List<Customer> listOfCustomer = qry.getResultList();
//				return listOfCustomer;
//		}
			//Employee By Names Ascending and Descending
			public List<Employee> getEmployeeNameAsc() {
			     	EntityManager manager = emf.createEntityManager();
						Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename");
						List<Employee> listOfEmployee = qry.getResultList();
						return listOfEmployee;	
					}

			public List<Employee> getEmployeeNameDsc() {
						EntityManager manager = emf.createEntityManager();
						Query qry = manager.createQuery( "select e.eid, e.ename ,e.gender,e.birthdate, e.joiningdate,e.designation from Employee e order by e.ename desc");
						List<Employee> listOfEmployee = qry.getResultList();
						return listOfEmployee;
					}
			
			   //Retailers By Names Ascending and Descending
			public List<Retailer> getRetailerNameAsc() {
						EntityManager manager = emf.createEntityManager();
						Query qry = manager.createQuery( "select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname");
						List<Retailer> listOfRetailer = qry.getResultList();
						return listOfRetailer;
					}

			public List<Retailer> getRetailerNameDsc() {
						EntityManager manager = emf.createEntityManager();
						Query qry = manager.createQuery("select r.rid, r.rname, r.remail, r.rphone, r.rpname, r.rostatus, r.oid, r.storeid, r.pid from Retailer r order by r.rname desc");
						List<Retailer> listOfRetailer = qry.getResultList();
						return listOfRetailer;
					}

			

			

			

			
			
	
}
