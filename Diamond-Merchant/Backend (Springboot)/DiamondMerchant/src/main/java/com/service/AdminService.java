package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Admin;
import com.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	public List<Admin> getAllAdminFromSpringData() {
		 return adminRepository.findAll();
	 }

	
	 public String storeAdminSpringData(Admin a) {
			Optional<Admin> op = adminRepository.findById(a.getAid());
			if(op.isPresent()) {
				return "Admin Record Already Present";
			} else {
				Admin admin = adminRepository.save(a);
				if(admin!=null) {
					return "Admin Record Stored SuccessFully";
				} else {
					return "Admin Record Didn't Store";
				}
			}
		 }
	 
	 public String deleteAdminSpringData(int aid) {
		 if(adminRepository.existsById(aid)) {
			 adminRepository.deleteById(aid);
			 return "Admin Record Deleted SuccessFully";
		 } else {
			 return "Admin Record Not Present";
		 }
	 }
	 
	 
	 public String updateAdminSpringData(Admin a) {
		 Optional<Admin> obj = adminRepository.findById(a.getAid());
		 if(obj.isPresent()) {
			 Admin admin = obj.get();
			 admin.setApassword(a.getApassword());
			 adminRepository.saveAndFlush(admin);	
			 return "Admin Password Updated Successfully";
		 } else {
			 return "Admin Password Not Updated";
		 }
	}
	 
}
