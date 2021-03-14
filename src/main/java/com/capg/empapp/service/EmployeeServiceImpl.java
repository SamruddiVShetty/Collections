package com.capg.empapp.service;

import java.util.List;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdExcption;
import com.capg.empapp.exception.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
   // Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
		
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException();
			}
			else return dao.addEmployee(e);		
		
	}

	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		 return dao.editSalaryByEmployeeId(id)	;
		
	}

	public boolean editExpByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		return dao.editExpByEmployeeId(id);
	}

	public List<Employee> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public List<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}
