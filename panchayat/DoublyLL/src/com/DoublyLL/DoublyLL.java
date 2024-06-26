package com.DoublyLL;

public class DoublyLL {

	Node Head;
	int Count;
	
	public DoublyLL()
	{
		this.Head = null;
		Count = 0;
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
			Head.prev = newn;
			Head = newn;
		}
		Count++;
	}
	
	public void InsertLast(int No)
	{
		Node temp = Head;
		
		Node newn = new Node(No);
		if(Head == null)
		{
			Head = newn;
		}
		else
		{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = newn;
			newn.prev = temp;
		}
		Count++;
	}
	
	public void InsertAtPos(int Pos,int No)
	{
		if((Pos < 1) || (Pos > Count + 1))
		{
			return;
		}
		
		if(Pos == 1)
		{
			InsertFirst(No);
		}
		else if(Pos == (Count +1))
		{
			InsertLast(No);
		}
		else
		{
			Node temp = Head;
			
			Node newn = new Node(No);
			{
				for(int i=1;i<Pos-1;i++)
				{
					temp = temp.next;
				}
				
				newn.next = temp.next;
				temp.next.prev = newn; //#
				
				temp.next = newn;
				newn.prev = temp;	//#
				
			}
			
			Count++;
		}
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
			Head.prev = null;
		}
		
		Count--;
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
			Node temp = Head;
			
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = null;
		}
		
		Count--;
	}
	
	public void DeleteAtPos(int Pos)
	{
		if((Pos < 1) || (Pos > Count+1))
		{
			return;
		}
		
		if(Pos == 1)
		{
			DeleteFirst();
		}
		else if(Pos == Count)
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
			temp.next.prev = temp;
			
			Count--;
		}
	}
	
	public void Display()
	{

        Node temp = Head;

        System.out.println("Elements of the Linked List are : ");

        System.out.print("null <=>");

        while(temp != null)
        {
                System.out.print("| "+ temp.Data +" |<=>");
                temp = temp.next;
        }
        System.out.println("null");
	}
	
	public int Count()
	{
		return Count;
	}
}
