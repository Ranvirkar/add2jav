package com.app.core;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		Scanner scanner = new Scanner(System.in);
		int choice, data, position;

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Insert at Position");
			System.out.println("4. Delete First");
			System.out.println("5. Delete Last");
			System.out.println("6. Delete at Position");
			System.out.println("7. Print List");
			System.out.println("8. Sort List");
			System.out.println("9. Remove Duplicates");
			System.out.println("10. Count Elements");
			System.out.println("11. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter data to add at first: ");
				data = scanner.nextInt();
				list.addFirst(data);
				break;
			case 2:
				System.out.print("Enter data to add at last: ");
				data = scanner.nextInt();
				list.addLast(data);
				break;
			case 3:
				System.out.print("Enter data to insert: ");
				data = scanner.nextInt();
				System.out.print("Enter position: ");
				position = scanner.nextInt();
				int result = list.insertAtPosition(data, position);
				if (result == -1) {
					System.out.println("Position does not exist");
				} else {
					System.out.println("Data inserted at position " + position);
				}
				break;
			case 4:
				list.deleteFirst();
				break;
			case 5:
				list.deleteLast();
				break;
			case 6:
				System.out.print("Enter position to delete: ");
				position = scanner.nextInt();
				list.deleteAtPosition(position);
				break;
			case 7:
				list.printList();
				break;
			case 8:
				list.sort();
				System.out.println("List sorted.");
				break;
			case 9:
				list.removeDuplicates();
				System.out.println("Duplicates removed.");
				break;
			case 10:
				System.out.println("Number of elements: " + list.count());
				break;
			case 11:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
