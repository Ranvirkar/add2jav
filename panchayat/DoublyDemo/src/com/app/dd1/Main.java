package com.app.dd1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DoublyList dl = new DoublyList();
		int ch = 0;
		int value;
		int pos;
		do {
			System.out.println("1. Insert at first");
			System.out.println("2. Insert at last");
			System.out.println("3. Insert at position");
			System.out.println("4. Delete first");
			System.out.println("5. Delete last");
			System.out.println("6. Delete at position");
			System.out.println("7. Display list");
			System.out.println("8. COunt elements");
			System.out.println("9. Even numbers ");
			System.out.println("10. Calculate sum of given pos");
			System.out.println("11. Exit");
			System.out.println("Enter your choice");
			ch = in.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter value to insert at first");
				value = in.nextInt();
				dl.insertFirst(value);
				break;
			
			case 2:
				System.out.println("Enter value to insert at first");
				value=in.nextInt();
				dl.insertAtLast(value);
				break;
			
			case 3:
				System.out.println("Enter value to insert");
				value=in.nextInt();
				System.out.println("Enter position");
				pos=in.nextInt();
				dl.insertatPos(value, pos);
				break;
				
			case 4:
				dl.deleteFirst();
				break;
			
			case 5:
				dl.deleteLast();
				break;
				
			case 6:
				System.out.println("Enter position to delete");
				pos=in.nextInt();
				dl.deletePos(pos);
				break;
				
			case 7:
				dl.display();
				break;
				
			case 8:
				int count=dl.CountD();
				System.out.println("Number of elements are -> " + count);
				break;
				
			case 9:
					int even=dl.calculateEven();
					System.out.println("Even numbers are -> " + even);
					break;
			
			case 10:
				System.out.println("Enter pos");
				pos=in.nextInt();
				
				int sum=dl.sumPos(pos);
				System.out.println("Sum of given pos is -> " + sum);
				break;
				
			case 11:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		} while (ch != 11);
	in.close();
	}

}
