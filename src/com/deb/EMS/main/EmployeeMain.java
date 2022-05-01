package com.deb.EMS.main;

import java.util.List;

import com.deb.EMS.DTO.Employee;
import com.deb.EMS.dao.IEmployeeDAO;
import com.deb.EMS.exceptions.EmployeeNotFoundException;
import com.deb.EMS.service.EmployeeServiceImpl;
import com.deb.EMS.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployeeService eservice = new EmployeeServiceImpl();
		eservice.addEmployee(new Employee(1110, "A", "Manager", 28));
		eservice.addEmployee(new Employee(2220, "B", "Clerk", 30));
		eservice.addEmployee(new Employee(3330, "C", "Salesman", 29));
		eservice.addEmployee(new Employee(4445, "D", "Accountant", 30));
		
		System.out.println();
		
		List<Employee>elist =eservice.showAllEmployees();
		for(Employee e : elist) {
			System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
		}
		System.out.println();
		
		eservice.deleteEmployee(1110);
		eservice.updateEmployee(new Employee(2220, "updated", "SR.clerk", 29));
		
		try {
			Employee temp = eservice.findEmployee(new Employee(2220, "updated", "SR.clerk", 29));
			System.out.println(temp.getEmpid()+" "+ temp.getEmpname());
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
