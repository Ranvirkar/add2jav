package com.singlyll;

public class SinglyLL {
	
	Node Head;
	int count;
	
	public SinglyLL()
	{
		this.Head = null;
		this.count = 0;
	}
	
	public void InsertFirst(int No)
	{
		Node newn = new Node(No);
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			newn.next = Head;
			Head = newn;
		}
		count++;
	}
	
	public void InsertLast(int No)
	{
		Node newn = new Node(No);
		
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = newn;
		}
		count++;
	}
	
	public void InsertAtPos(int No,int Pos)
	{
				
		if((Pos < 1 ) || (Pos > (count+1)))
		{
			System.out.println("Invalid Position");
			return;
		}
		
		if(Pos == 1)
		{
			InsertFirst(No);
		}
		else if(Pos == count+1)
		{
			InsertLast(No);
		}
		else
		{
			Node newn = new Node(No);
			
			Node temp = Head;
			
			for(int i=1;i<Pos-1;i++)
			{
				temp = temp.next;
			}
			
			newn.next = temp.next;
			temp.next = newn;
		}
		count++;
		
	}
	
	public void DeleteFirst()
	{
		if(Head == null)
		{
			return;
		}
		else if(Head.next == null)
		{
			Head = null;
		}
		else
		{
			Head = Head.next;
		}
		count--;
	}
	
	public void DeleteLast()
	{
		if(Head == null)
		{
			return;
		}
		else if(Head.next == null)
		{
			Head = null;
		}
		else
		{
			Node temp= Head;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
		}
		count--;
	}
	
	public void DeleteAtPos(int Pos)
	{
		if((Pos < 1) || (Pos > (count+1)))
		{
			System.out.println("Invalid Position");
		}
		
		if(Pos == 1)
		{
			DeleteFirst();
		}
		else if(Pos == count)
		{
			DeleteLast();
		}
		else
		{
			Node temp = Head;
			
			for(int i=1;i<Pos-1;i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			count--;
		}
	}
	
	public void Display()
	
	 {
	        Node temp = Head;

	        System.out.println("Elements of the Linked List are : ");

	        while(temp != null)
	        {
	                System.out.print("| "+temp.Data +" |->");
	                temp = temp.next;
	        }
	        System.out.println("null");
	  }
	
	public int count()
	{
		return count;
	}
	
}
