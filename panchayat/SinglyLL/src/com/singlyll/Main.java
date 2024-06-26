package com.singlyll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        SinglyLL obj = new SinglyLL();
        int choice = 0;
        int value, position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display List");
            System.out.println("8. Count Elements");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sobj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at first: ");
                    value = sobj.nextInt();
                    obj.InsertFirst(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at last: ");
                    value = sobj.nextInt();
                    obj.InsertLast(value);
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    value = sobj.nextInt();
                    System.out.print("Enter position: ");
                    position = sobj.nextInt();
                    obj.InsertAtPos(value, position);
                    break;

                case 4:
                    obj.DeleteFirst();
                    break;

                case 5:
                    obj.DeleteLast();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    position = sobj.nextInt();
                    obj.DeleteAtPos(position);
                    break;

                case 7:
                    obj.Display();
                    break;

                case 8:
                    int count = obj.count();
                    System.out.println("Number of elements are: " + count);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        sobj.close();
    }
}
