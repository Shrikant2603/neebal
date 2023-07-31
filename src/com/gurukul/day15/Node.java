package com.gurukul.day15;

public class Node<T extends Comparable> {
    private T data;
    private Node<T> next;
    private Node<T> prev; // this is for double linked list as they are in same package.

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public Node(T data) {
	super();
	this.data = data;
    }

    @Override
    public String toString() {
	return "Node [data=" + data + "]";
    }

    public Node<T> getPrev() {
	return prev;
    }

    public void setPrev(Node<T> prev) {
	this.prev = prev;
    }

}
