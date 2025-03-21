public class RemoveCycle {
    
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void removeCycle() {
        Node fast = head;
        Node slow = head;
        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            System.out.println("No cycle detected.");
            return;
        }

        // Find the starting node of the cycle
        slow = head;
        Node prev = null;
        
        while (slow != fast) {
            prev = fast;  // Store the previous node of fast
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle
        if (prev != null) {
            prev.next = null;  // Break the cycle
        }
        
        System.out.println("Cycle removed.");
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Creating a cycle

        removeCycle();  // Remove cycle
        printList();    // Print list to verify cycle is removed
    }
}
