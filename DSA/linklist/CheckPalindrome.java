public class CheckPalindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static Node findMid(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) { // Fix: && instead of ||
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare halves
        Node right = prev;
        Node left = head;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        // Step 4: Restore original list structure (reverse second half again)
        prev = null;
        curr = midNode;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return isPalindrome;
    }

    public static void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String Args[]) {
        CheckPalindrome l1 = new CheckPalindrome();
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(1);
        print();

        System.out.println("Is Palindrome: " + l1.checkPalindrome());

        print(); // To verify list remains unchanged
    }
}
