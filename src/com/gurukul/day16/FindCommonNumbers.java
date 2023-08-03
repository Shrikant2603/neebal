package com.gurukul.day16;

import java.util.HashSet;

public class FindCommonNumbers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr1[] = { 1, 5, 3, 7, 8, 34, 98 };
	int arr2[] = { 1, 3, 4, 5, 7, 98, 68 };
	int arr3[] = { 1, 6, 4, 5, 7, 54, 98 };

	HashSet<Integer> h1 = new HashSet<>();
	HashSet<Integer> h2 = new HashSet<>();
	HashSet<Integer> h3 = new HashSet<>();

	for (int i = 0; i < arr1.length; i++) {
	    h1.add(arr1[i]);
	}
	for (int i = 0; i < arr2.length; i++) {
	    h2.add(arr2[i]);
	}
	for (int i = 0; i < arr3.length; i++) {
	    h3.add(arr3[i]);
	}
	h1.retainAll(h2);
	h1.retainAll(h3);

	System.out.println(h1);

    }

}
