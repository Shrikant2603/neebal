package com.gurukul.day4;

class Employee{
	private String name;
	private int id;
	private double salary;
	private String department;
	
	Employee(String name, int id, double salary, String department){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department = department;
		System.out.println("New Employee object created");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return (name + " has the maximum salary of " + salary + " and the department of"+ name + " is"+ department);
	}
}

public class EmlpoyeeOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Spiderman",132213, 40000, "Quality");
		Employee e2 = new Employee("Batman",454346, 300000, "Engineering");
		Employee e3 = new Employee("Superman",354666, 150000, "Production");
		
		double max = e1.getSalary();
		String highest = e1.getName();
		String dep = e1.getDepartment();
		if(e2.getSalary()>max) {
			max = e2.getSalary();
			highest = e2.getName();
			dep = e2.getDepartment();

		}
		if(e3.getSalary()>max) {
			max = e3.getSalary();
			highest = e3.getName();
			dep = e3.getDepartment();
		}

		e1.setSalary(e1.getSalary()*1.2);
		e2.setSalary(e2.getSalary()*1.2);
		e3.setSalary(e3.getSalary()*1.2);

		System.out.println(highest + " has the maximum salary of " + max);
		System.out.println("Department of the employee with highest salary is:" + dep);

	}

}
