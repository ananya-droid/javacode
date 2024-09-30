class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListPalindrome {

    // Function to reverse a linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to check if a linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;  // A list with 0 or 1 node is always a palindrome
        }

        // Step 1: Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        Node secondHalf = reverse(slow);

        // Step 3: Compare the two halves
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Creating a linked list: 1->2->1->1->2->1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
