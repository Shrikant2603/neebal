package com.gurukul.day8;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a number");
//	int n = sc.nextInt();

	Student s1 = new Student(647, "s1", 19);
	Student s2 = new Student(235, "s2", 10);
	Student s3 = new Student(284, "s3", 8);
	Student s4 = new Student(964, "s4", 26);
	Student s5 = new Student(436, "s5", 20);
	Student s6 = new Student(109, "s6", 23);
	Student s7 = new Student(204, "s7", 17);
	Student s8 = new Student(874, "s8", 22);
	Student s9 = new Student(256, "s9", 9);
	Student s10 = new Student(347, "s10", 21);

	List<Student> list = new ArrayList<>();

	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	list.add(s6);
	list.add(s7);
	list.add(s8);
	list.add(s9);
	list.add(s10);

	for (int i = 0; i < list.size(); i++) {
	    if (list.get(i).age > 15) {
		System.out.println(list.get(i));
	    }
	}

    }

}
