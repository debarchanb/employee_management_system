package com.deb.EMS.business;

import com.deb.EMS.DTO.Employee;

public abstract class SalaryCalculator {

	public int getGrossSalary(Employee e, int actualSalary) {
		int grossSalary=0;
		int perDaySalary=actualSalary/30;
		grossSalary = perDaySalary * e.getDaysAttended();
		return grossSalary;
	}
	
	public abstract void calculateNetSalary(Employee e, int actualSalary);
}
