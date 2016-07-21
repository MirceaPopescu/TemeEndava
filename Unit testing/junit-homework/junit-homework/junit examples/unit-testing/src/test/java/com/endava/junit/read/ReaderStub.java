package com.endava.junit.read;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.endava.junit.entities.Employee;

public class ReaderStub implements ReaderInterface {

	@Override
	public List<Employee> readEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = new Employee(0, "test", new Date(), 0, "test");
		employeeList.add(employee);
		return employeeList;
	}

}
