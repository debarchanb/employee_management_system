package com.deb.EMS.service;

import java.util.List;

import com.deb.EMS.DTO.Employee;
import com.deb.EMS.dao.EmployeeDAOMySQlImpl;
import com.deb.EMS.dao.IEmployeeDAO;
import com.deb.EMS.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements IEmployeeService{
	private IEmployeeDAO empDAO = new EmployeeDAOMySQlImpl();
	@Override
	public void addEmployee(Employee e) {
		empDAO.addEmployee(e);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		empDAO.deleteEmployee(empid);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		empDAO.updateEmployee(e);
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return empDAO.findEmployee(e);
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return empDAO.showAllEmployees();
	}

}
