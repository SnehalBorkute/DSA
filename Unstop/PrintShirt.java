// Problem Statement
// N students were standing in a line. Each one has connectivity to the one behind it. Every student has a number printed on their shirt.

// Print the numbers on their shirts such that the number on the last student is printed first and the first one is printed last.

// The numbers are provided in the form of a linked list.

// Input Format
// The first line of input contains an integer N, which determines the number of students.

// The second line contains N space-seperatad integers representing the numbers printed on the shirt.

// Output Format
// Display the numbers such that it is reverse of the original order


import java.util.*;

public class ReverseShirtNumbers {

    // Node class for Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Method to add a new node at the end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Reverse the linked list
        public void reverse() {
            Node prev = null, curr = head, next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // Print the linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = sc.nextInt(); // Number of students
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt()); // Read student numbers and add to the linked list
        }
        sc.close();

        list.reverse(); // Reverse the list
        list.printList(); // Print reversed list
    }
}