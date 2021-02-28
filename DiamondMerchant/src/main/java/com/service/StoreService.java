package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Bill;
import com.bean.Store;
import com.dao.SortByPriceDao;
import com.repository.StoreRepository;


@Service
public class StoreService 
{

	
	@Autowired
	StoreRepository storeRepository;
	
	@Autowired
	SortByPriceDao ssp;
	
	//Display All Records
	public List<Store> getAllStoreFormSpringData()
	{
		return storeRepository.findAll();
	}
	

	
	
	public List<Store> getAllStoreNameAsc() {
		return ssp.getAllStoreNameAsc();
	}


	public List<Store> getAllStoreNameDesc() {
		return ssp.getAllStoreNameDesc();
	}


	
	

    //To Store the new Record
	public String storeStoreSpringData(Store SS)
	{
		Optional<Store> op = storeRepository.findById(SS.getStoreid());
		if(op.isPresent()) 
		{
			return "Record already present";
		}
		else{
				Store s = storeRepository.save(SS);			// save the records 
				if(s!=null)
				{
					return "Record stored successfully";
				}else {
						return "Record didn't store";
					  }
			}
	}
		
	
	//To Update the existing Record
	public String updateStoreSpringData(Store ss)
	{
		Optional<Store> obj	 = storeRepository.findById(ss.getStoreid());
		if(obj.isPresent())
		{
			Store s	 = obj.get();
			s.setAddress(ss.getAddress());
			storeRepository.saveAndFlush(s);
			return "Record updated successfully";
		}
		else 
		{
		    return "Record not updated";
		}
	}

	//To Delete the Records
	public String deleteStoreSpringData(int storeid) 
	{
				 {
					if(storeRepository.existsById(storeid)) 
					{
						storeRepository.deleteById(storeid);
						return "Record deleted successfully";
					}
					else{
						return "Record not present";
					}
			     }
	}








			
}


			
		
				
	


			

	
