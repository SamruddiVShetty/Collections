package com.capg.empapp.dao;
import java.util.List;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdExcption;
import com.capg.empapp.exception.WrongSalaryException;


public interface IEmployeeDAO {
	
	 public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public List<Employee> getAllEmployees();
	 
	 public List<Employee> getEmployeeBySalary(int salary);
	 
	 public List<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
