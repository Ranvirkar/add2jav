package com.app.core;

public class Node {

	Node prev;
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.prev =this.next = null;
	}

}
