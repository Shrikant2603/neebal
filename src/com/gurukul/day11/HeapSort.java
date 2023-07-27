package com.gurukul.day11;

public class HeapSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 1, 7, 11, 2, 9, 4, -21 };
	heapSort(arr, arr.length);
	for (int i : arr) {
	    System.out.print(i + " ");
	}
    }

    public static void heapSort(int a[], int n) {
	for (int i = n / 2; i >= 0; i--) {
	    heapify(a, i, n);
	}
	for (int i = n - 1; i > 0; i--) {
	    int t = a[0];
	    a[0] = a[i];
	    a[i] = t;
	    heapify(a, 0, i);
	}
    }

    public static void heapify(int a[], int p, int n) {
	int t = a[p];
	int i;
	for (i = 2 * p + 1; i < n; i = 2 * i + 1) {
	    if ((i + 1) < n && a[i] < a[i + 1])
		i++;
	    if (a[i] > t)
		a[(i - 1) / 2] = a[i];
	    else
		break;
	}
	a[(i - 1) / 2] = t;
    }
}
