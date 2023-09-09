package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Age=" + age + "]";
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
}

public class StreamDemo2 {
	public static void main(String[] args) {
		/*List<String> names = Arrays.asList("Avinash", "Priya", "Deepak", "Aakash", "Saikiran");
		List<String>nameList = names.stream().filter(s -> s.startsWith("A")).map(n -> n.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(nameList);
		
		List<Integer> nos = Arrays.asList(4,6,3,5,8,2);
		//int sum = nos.stream().reduce(0,(ans,i) -> ans + i);
		int evensum = nos.stream().filter(i -> i % 2 == 0).reduce(0,(ans,i) -> ans + i);
		
		System.out.println(evensum);*/
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Ram", 35));
		empList.add(new Employee("Ramesh", 31));
		empList.add(new Employee("Charan", 28));
		
		List<String> emp = empList.stream().filter(e -> e.getName().endsWith("n")).map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(emp);
	}
}
