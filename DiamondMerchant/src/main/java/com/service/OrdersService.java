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
	}