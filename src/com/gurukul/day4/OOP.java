package com.gurukul.day4;

class Student{
	private String name;
	private int age;
	private long contactNo;
	
	Student(String name, int age, int contactNo){
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
		System.out.println("New Student object is created");
	}
	public long getContact() {
		return contactNo;
	}
	void setContact (long contact) {
		contactNo = contact;
	}
	public String toString() {
		return ("Name:" + name + " Age:"+ age + " Contact no:" + contactNo);
	}
}
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Harry", 25, 2343552);
		
		s1.setContact(242344252);
		System.out.println(s1.getContact());
		System.out.print(s1);

	}

}
