package com.capg.empapp.db;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
	// Employee cannot be resolved to a type
	//public static Employee employees[]  = new Employee[100];
	
	public static List<Employee> emp=new ArrayList<Employee>();
	
	public static int count = 0,c=0;
	
	static {
		
		emp.add(new Employee(101, "ramesh", 8, 7000));
		emp.add(new Employee(101, "suresh", 2, 7000));
		emp.add(new Employee(101, "rakesh", 1, 7000));
		emp.add(new Employee(101, "lokesh", 5, 7000));
		
		}
		
		
	
	
	public static int getCount()
	{
		return count;
	}

	public static boolean addEmployee(Employee e) {
		emp.add(e);
		
		return true;
	
	}

	public static List<Employee> getEmployeeBySalary(int salary) {
		List<Employee> l1=new ArrayList<Employee>();
		for (int i =0;i<emp.size();i++) {
			if(emp.get(i).getSalary()==salary) {
				l1.add(emp.get(i));
			}
				
			}
		return l1;
	}
	
	public static List<Employee> getEmployeeBySalaryRange(int minsalary,int maxSalary) {
		List<Employee> l2=new ArrayList<Employee>();
		for (int i =0;i<emp.size();i++) {
			if(emp.get(i).getSalary()>=minsalary && emp.get(i).getSalary()<=maxSalary) {
				l2.add(emp.get(i));
			}
				
			}
		return l2;
	}
	
	public static boolean editSalary(int id) {
		Scanner sc= new Scanner(System.in);
        for(Employee i:emp) {
        	if(i.getEmployeeId()==id) {
        		System.out.println("Enter new salary");
        		int ns= sc.nextInt();
        		i.setSalary(ns);
        		break;
        	}
        	
        }
        return true;
		
		
		
	}
	public static boolean editExp(int id) {
		Scanner sc= new Scanner(System.in);
        for(Employee i:emp) {
        	if(i.getEmployeeId()==id) {
        		System.out.println("Enter new experience.");
        		int ne= sc.nextInt();
        		i.setExp(ne);
        		break;
        	}
        	
        }
        return true;
	}
	
	
}
