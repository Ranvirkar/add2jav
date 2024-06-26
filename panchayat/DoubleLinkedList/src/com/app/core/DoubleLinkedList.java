package com.app.core;

public class DoubleLinkedList {
	private Node head;
	private int size;

	public DoubleLinkedList() {
		this.size = 0;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		Node currHead=head;
		while(currHead.next!=null) {
			currHead=currHead.next;
		}
		currHead.next=newNode;
		newNode.prev=currHead;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
//		System.out.print("null<->");
		Node currHead=head;
		while(currHead!=null) {
			System.out.print(currHead.data+"<->");
			currHead=currHead.next;
		}
//		System.out.println("null");
	}
	
	public int insertAtPosition(int data, int position) {
        if (position <= 0 || position > size + 1) {
            System.out.println("Position does not exist");
            return -1;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            size++;
            return data;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return -1;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
        size++;
        return data;
    }
	
//	public void deleteFirst() {
//		if(head==null) {
//			System.out.println("the list is empty");
//			return;
//		}
//		size--;
//		head=head.next;
//		if(head!=null) {
//			head.prev=null;
//		}
//		Node tail=head.prev;
//		head=head.next;
//		head.prev=tail;
//		tail.next=head;
//	}
	 public void deleteFirst() {
	        if (head == null) {
	            System.out.println("The list is empty");
	            return;
	        }
	        size--;
	        if (head.next == null) {
	            head = null;
	            return;
	        }
	        head = head.next;
	        head.prev = null;
	    }
	 public void deleteLast() {
	        if (head == null) {
	            System.out.println("The list is empty");
	            return;
	        }
	        size--;
	        if (head.next == null) {
	            head = null;
	            return;
	        }
	        Node currHead = head;
	        while (currHead.next != null) {
	            currHead = currHead.next;
	        }
	        currHead.prev.next = null;
	    }
//	public void deleteLast() {
//		if(head==null) {
//			System.out.println("the list is empty");
//			return;
//		}
//		size--;
//		if(head.next==null) {
//			head=null;
//			return;
//		}
//		Node currHead=head;
//		while(currHead.next!=null) {
//			currHead=currHead.next;
//		}
//		currHead.prev.next=null;
//	}

//	 public void deleteAtPos(int Pos)
//		{
//			if((Pos < 1) || (Pos > size+1))
//			{
//				return;
//			}
//			
//			if(Pos == 1)
//			{
//				deleteFirst();
//			}
//			else if(Pos == size)
//			{
//				deleteLast();
//			}
//			else
//			{
//				Node temp = head;
//				
//				for(int i=1;i<Pos-1;i++)
//				{
//					temp = temp.next;
//				}
//				
//				temp.next = temp.next.next;
//				temp.next.prev = temp;
//				
//				size--;
//			}
//		}
	    public void deleteAtPosition(int position) {
	        if (position < 1 || position > size) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (position == 1) {
	            deleteFirst();
	            return;
	        }

	        if (position == size) {
	            deleteLast();
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; i < position && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            return;
	        }

	        temp.prev.next = temp.next;
	        temp.next.prev = temp.prev;
	        size--;
	    }
	  public void sort() {
	        if (head == null || head.next == null) {
	            return;
	        }

	        boolean swapped;
	        do {
	            Node current = head;
	            swapped = false;
	            while (current.next != null) {
	                if (current.data > current.next.data) {
	                    int temp = current.data;
	                    current.data = current.next.data;
	                    current.next.data = temp;
	                    swapped = true;
	                }
	                current = current.next;
	            }
	        } while (swapped);
	    }

	    public int count() {
	        return size;
	    }
	    public void removeDuplicates() {
	        if (head == null || head.next == null) {
	            return;
	        }

	        Node current = head;

	        while (current != null) {
	            Node runner = current;
	            while (runner.next != null) {
	                if (runner.next.data == current.data) {
	                    deleteNode(runner.next);
	                } else {
	                    runner = runner.next;
	                }
	            }
	            current = current.next;
	        }
	    }
	    private void deleteNode(Node node) {
	        if (node == null) {
	            return;
	        }

	        // If the node to be deleted is the head node
	        if (node == head) {
	            head = node.next;
	        }

	        // Adjust the prev pointer of the next node if it exists
	        if (node.next != null) {
	            node.next.prev = node.prev;
	        }

	        // Adjust the next pointer of the previous node if it exists
	        if (node.prev != null) {
	            node.prev.next = node.next;
	        }

	        // Decrement the size of the list
	        size--;
	    }


}
