package javastreams.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

	double employeeSalary;
	String employeeName;
	int employeeId;

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Employee 1", 5000));
		employees.add(new Employee(2, "Employee 2", 2000));
		employees.add(new Employee(3, "Employee 3", 10000));
		employees.add(new Employee(4, "Employee 4", 7000));
		employees.add(new Employee(5, "Employee 5", 3000));
		employees.add(new Employee(6, "Employee 6", 25000));

		List<Employee> newlist = employees.stream().filter(x -> x.employeeSalary > 5000).collect(Collectors.toList());
		System.out.println(newlist.size());
		for (Employee e : newlist)
			System.out.println(e.employeeName);
	}

}
