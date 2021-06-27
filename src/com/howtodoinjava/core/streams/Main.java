package com.howtodoinjava.core.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Main 
{
	public static void main(String[] args) 
	{
		String message = "There are %d elements in the stream %n";
		
		long count = Stream.of("how", "to", "do", "in", "java").collect(Collectors.counting());
		System.out.printf(message, count);

		count = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.counting());
		System.out.printf(message, count);

		count = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(i -> i % 2 == 0).collect(Collectors.counting());
		System.out.printf(message, count);
	}

	private static Stream<Employee> getEmployeeStream() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "A", 46, 30000));
		empList.add(new Employee(2, "B", 56, 30000));
		empList.add(new Employee(3, "C", 42, 50000));
		empList.add(new Employee(4, "D", 52, 50000));
		empList.add(new Employee(5, "E", 32, 80000));
		empList.add(new Employee(6, "F", 72, 80000));

		return empList.stream();
	}
}

class Employee {
	private long id;
	private String name;
	private int age;
	private double salary;

	public Employee(long id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}