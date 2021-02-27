package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Store;
import com.repository.StoreRepository;


@Service
public class StoreService 
{

	
	@Autowired
	StoreRepository storeRepository;
	
	//Display All Records
	public List<Store> getAllStoreFormSpringData()
	{
		return storeRepository.findAll();
	}


    //To Store the new Record
	public String storeStoreSpringData(Store s)
	{
		Optional<Store> op = storeRepository.findById(s.getStoreid());
		if(op.isPresent()) 
		{
			return "Record already present";
		}
		else{
				Store store = storeRepository.save(s);			// save the records 
				if(store!=null)
				{
					return "Record stored successfully";
				}else {
						return "Record didn't store";
					  }
			}
	}
		
	
	//To Update the existing Record
	public String updateStoreSpringData(Store s)
	{
		Optional<Store> obj	 = storeRepository.findById(s.getStoreid());
		if(obj.isPresent())
		{
			Store store	 = obj.get();
			store.setAddress(s.getAddress());
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


			
		
				
	


			

	
