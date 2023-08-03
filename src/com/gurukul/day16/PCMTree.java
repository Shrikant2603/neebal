package com.gurukul.day16;

import java.util.ArrayList;
import java.util.HashSet;

class Student implements Comparable<Student> {
    private String name;
    private int roll;
    private int math;
    private int phy;
    private int chem;

    public Student(String name, int roll, int math, int phy, int chem) {
	super();
	this.name = name;
	this.roll = roll;
	this.math = math;
	this.phy = phy;
	this.chem = chem;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getRoll() {
	return roll;
    }

    public void setRoll(int roll) {
	this.roll = roll;
    }

    public int getMath() {
	return math;
    }

    public void setMath(int math) {
	this.math = math;
    }

    public int getPhy() {
	return phy;
    }

    public void setPhy(int phy) {
	this.phy = phy;
    }

    public int getChem() {
	return chem;
    }

    public void setChem(int chem) {
	this.chem = chem;
    }

    @Override
    public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", math=" + math + ", phy=" + phy + ", chem=" + chem + "]";
    }

    @Override
    public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return getRoll() - o.getRoll();
    }

}

public class PCMTree {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Student s1 = new Student("Ramesh", 65, 31, 47, 9);
	Student s2 = new Student("Suresh", 31, 78, 98, 87);
	Student s3 = new Student("Anil", 73, 25, 19, 12);
	Student s4 = new Student("Sunil", 12, 25, 19, 42);

	Student arr[] = { s1, s2, s3, s4 };

	ArrayList<Student> phy = new ArrayList<>();
	ArrayList<Student> chem = new ArrayList<>();
	ArrayList<Student> math = new ArrayList<>();

	for (Student s : arr) {
	    if (isFailed(s.getMath())) {
		math.add(s);
	    }
	    if (isFailed(s.getPhy())) {
		phy.add(s);
	    }
	    if (isFailed(s.getChem())) {
		chem.add(s);
	    }
	}

	HashSet<Student> set1 = new HashSet<Student>();
	HashSet<Student> set2 = new HashSet<Student>();
	HashSet<Student> set3 = new HashSet<Student>();

	set1.addAll(phy);
	set2.addAll(chem);
	set3.addAll(math);

	set1.retainAll(set2);
	set1.retainAll(set2);

	System.out.println(set1);
    }

    public static boolean isFailed(int num) {
	return num < 35;
    }

}
