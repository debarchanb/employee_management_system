package com.deb.EMS.exceptions;

public class EmployeeNotFoundException extends Exception {
	private int empid;
	public EmployeeNotFoundException(int empid) {
		this.empid=empid;
	}
	
	public String toString() {
		return "Employee not found exception"+ this.empid;
	}

}
