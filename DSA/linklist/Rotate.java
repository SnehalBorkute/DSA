class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class Rotate {
    Node rotateLeft(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // No rotation needed
        }

        // Step 1: Find the length of the list
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Optimize k
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 3: Find the new tail (k-1)th node
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // Step 4: Update the head and tail pointers
        Node newHead = temp.next;
        temp.next = null; // New tail
        Node current = newHead;

        // Step 5: Find the last node of the new list
        while (current.next != null) {
            current = current.next;
        }
        current.next = head; // Connect old tail to old head

        return newHead;
    }

    // Function to print the linked list
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Rotate sol=new Rotate();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        sol.printList(head);

        // Rotate left by 2 positions
        head = sol.rotateLeft(head, 2);

        System.out.println("List after rotating left by 2:");
        sol.printList(head);
    }
}
