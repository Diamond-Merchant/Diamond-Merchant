package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.repository.OrdersRepository;

@Service
public class OrdersService {

	
	@Autowired
	OrdersRepository ordersRepository;
	
	
	public List<Orders> getAllOrdersFormSpringData() {
		return ordersRepository.findAll();
	}

	
	public List<Orders> getAllOrdersDescByPrice(){
		return ordersRepository.getAllOrdersDescByPrice();
	}
	
	
	public List<Orders> getAllOrdersAscByPrice(){
		return ordersRepository.getAllOrdersAscByPrice();
	}
	
	
	public List<Orders> getAllOrdersDescByPName(){
		return ordersRepository.getAllOrdersDescByPName();
	}
	
	
	public List<Orders> getAllOrdersAscByPName(){
		return ordersRepository.getAllOrdersAscByPName();
	}
	
	
	public List<Orders> getAllOrdersDescByOStatus(){
		return ordersRepository.getAllOrdersDescByOStatus();
	}
	
	
	public List<Orders> getAllOrdersAscByOStatus(){
		return ordersRepository.getAllOrdersAscByOStatus();
	}
	

	public String storeOrdersSpringData(Orders oo) {
		Optional<Orders> op = ordersRepository.findById(oo.getOid());
		if(op.isPresent()) {
			return "Record already present";
		}else {
			Orders o = ordersRepository.save(oo);			// save the records 
			if(o!=null) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
		}
	}
	
	
	public String updateOrdersSpringData(Orders oo) {
		Optional<Orders> obj	 = ordersRepository.findById(oo.getOid());
		if(obj.isPresent()) {
			Orders o	 = obj.get();
			o.setOprice(oo.getOprice());
			ordersRepository.saveAndFlush(o);
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}

	
	public String deleteOrdersSpringData(int oid) {
		if(ordersRepository.existsById(oid)) {
			ordersRepository.deleteById(oid);
				return "Record deleted successfully";
		}else {
				return "Record not present";
		}
	}
	
	
	// Search By Ordered Product Name or Product Order Price.
	public List<Orders> listAllOrders(String keyword) {
        if (keyword != null) {
            return ordersRepository.search(keyword);
        }
        return ordersRepository.findAll();
	}
	
	
	public Orders findOrdersById(int oid) {
		Optional<Orders> op = ordersRepository.findById(oid);
		if(op.isPresent()) {
			return op.get();
		} else {
			return null;
		}
	}
	
	
	
}