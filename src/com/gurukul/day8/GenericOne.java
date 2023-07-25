package com.gurukul.day8;

import java.util.ArrayList;
import java.util.List;

interface Sort {
    int getId();
}

class Distance implements Sort {
    int id;
    double m;
    double cm;

    public Distance(int id, int m, double cm) {
	this.id = id;
	this.m = m;
	this.cm = cm;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "Distance [id=" + id + ", m=" + m + ", cm=" + cm + "]";
    }

}

class Student implements Sort {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Object o) {
	System.out.println(o.getClass());

	return (this.name).compareToIgnoreCase(((Student) o).name.toString());
    }

    public class GenericOne {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    Sort[] arr = new Sort[5];
	    arr[0] = new Distance(235, 67, 3200);
	    arr[1] = new Distance(756, 35, 8900);
	    arr[2] = new Distance(975, 23, 2900);

	    arr[3] = new Student(924, "Ramesh", 14);
	    arr[4] = new Student(647, "Suresh", 19);

	    for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length - 1; j++) {
		    if (arr[j].getId() > arr[j + 1].getId()) {
			Sort t = arr[j];
			arr[j] = arr[j + 1];
			arr[j + 1] = t;
		    }

		}
	    }
//	for (int i = 0; i < 5; i++) {
//	    System.out.println(arr[i]);
//	}

	    Student s1 = new Student(647, "s1", 19);
	    Student s2 = new Student(235, "s2", 10);
	    Student s3 = new Student(284, "s3", 25);
	    Student s4 = new Student(964, "s4", 19);
	    Student s5 = new Student(436, "s5", 20);
	    Student s6 = new Student(109, "s6", 23);
	    Student s7 = new Student(204, "s7", 17);
	    Student s8 = new Student(874, "s8", 22);
	    Student s9 = new Student(256, "s9", 27);
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

	    List<Student> list1 = new ArrayList<>();
	    list1.addAll(list);
	    list.get(5).age = 25;

//	for (Student x : list) {
//	    System.out.println(x);
//	}
	    System.out.println();
	    for (int i = 0; i < list.size(); i++) {
		for (int j = 0; j < list.size() - 1; j++) {
		    if (list.get(j).getId() > list.get(j + 1).getId()) {
			Student t = list.get(j);
			list.set(j, list.get(j + 1));
			list.set(j + 1, t);
		    }

		}
	    }
//	for (Student x : list) {
//	    System.out.println(x);
//	}
	    System.out.println();

//	for (int i = list1.size() - 1; i >= 0; i--) {
//	    System.out.println(list1.get(i));
//	}
//	Collections.sort(list);

	}

    }
}
