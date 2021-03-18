package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	// Sort By Employee Name ASC
	@Query("SELECT e FROM Employee e order by ename asc")
	public List<Employee> getEmployeeNameByAsc();
		
		
	// Sort By Employee Name DESC
	@Query("SELECT e FROM Employee e order by ename desc")
	public List<Employee> getEmployeeNameByDesc();
	
}
