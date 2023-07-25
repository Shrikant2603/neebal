package com.gurukul.day8;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class LinkDemo {

    static <T extends AbstractList<?>> void display(T t) {
	Iterator<?> it = t.iterator();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}
    }

    public LinkDemo() {

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<String> arrList = new ArrayList<>();
	arrList.add("20");
	arrList.add("30");
	arrList.add("50");

	Vector<Integer> v1 = new Vector<>();
	v1.add(100);
	v1.add(200);
	v1.add(400);

	Stack<Double> s1 = new Stack<>();
	s1.add(300.0);
	s1.add(230.0);
	s1.add(700.0);

	LinkDemo.display(arrList);
	System.out.println();
	LinkDemo.display(v1);
	System.out.println();

	LinkDemo.display(s1);

//	ListIterator <Integer> listItr1 = new ListIterator<Integer>();
    }

}
