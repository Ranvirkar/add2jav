package com.app.dd1;

public class DoublyList {

	private Node head;
	private int ctn;

	public DoublyList() {
		this.head = null;
		ctn = 0;
	}

	// insert at first

	public void insertFirst(int num) {
		Node newNode = new Node(num);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		ctn++;
	}

	// insert at last
	public void insertAtLast(int num) {
		Node temp = head;
		Node newNode = new Node(num);

		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
		ctn++;
	}

	// insert at pos
	public void insertatPos(int num, int pos) {
		if ((pos < 1) || (pos > (ctn + 1))) {
			System.out.println("Invalid pos");
			return;
		}
		if (pos == 1) {
			insertFirst(num);
		} else if (pos == (ctn + 1)) {
			insertAtLast(num);
		} else {
			Node temp = head;
			Node newNode = new Node(num);
			{
				for (int i = 1; i < pos - 1; i++) {
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next.prev = newNode;

				temp.next = newNode;
				newNode.next = temp;
			}
			ctn++;
		}
	}

	// Delete at first

	public void deleteFirst() {
		if (head == null) {
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		ctn--;
	}

	// delete at last
	public void deleteLast() {
		if(head==null) {
			return;
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
		ctn--;
	}
	
	// delete at position
	public void deletePos(int pos) {
		if((pos<1)||(pos>(ctn+1))) {
			return;
		}
		if(pos==1) {
			deleteFirst();
		}
		else if(pos==ctn) {
			deleteLast();
		}
		else {
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			
			temp.next=temp.next.next;
			temp.next.prev=temp;
			ctn--;
		}
	}
	
	//display
	public void display() {
		Node temp=head;
		System.out.println("Elements of the linked list are -> ");
		System.out.println("Null");
		while(temp!=null) {
			System.out.print(temp.data + " ->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	//count
	public int CountD()
	{
		return ctn;
	}
	
	//calculate even number from the list
	public int calculateEven() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			if(temp.data%2==0) {
				count++;
			}
			temp=temp.next;
		}
		return count;
	}
	
	//calculate sum of given position to end of position
	
	public int sumPos(int pos) {
		if(pos<1 || pos> ctn) {
		System.out.println("Invalid pos");
		}
		int sum=0;
		Node temp=head;
		
		//traverse to the specific posiiotn
		for(int i=1;i<pos;i++) {
			temp=temp.next;
		}
		
		//sum from specific pos to the end
		while(temp!=null) {
			sum+=temp.data;
			temp=temp.next;
		}
		return sum;
	}
}
