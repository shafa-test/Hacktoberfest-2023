class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

public class GCDLinkedList {
    public ListNode insertGCDBetweenAdjacentNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            // Calculate GCD between the current node and its adjacent node
            int currentGCD = gcd(head.val, head.next.val);

            // Create the new node with the calculated GCD value
            ListNode newNode = new ListNode(currentGCD);

            // Insert the new node between the current node and its adjacent node
            newNode.next = head.next;
            head.next = newNode;

            // Move to the next pair of adjacent nodes
            head = head.next.next;
        }

        return dummy.next;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper function to print the linked list
    private void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        // Example usage:
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> None
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original linked list:");
        new GCDLinkedList().printLinkedList(head);

        ListNode newHead = new GCDLinkedList().insertGCDBetweenAdjacentNodes(head);
        System.out.println("Linked list with GCD nodes:");
        new GCDLinkedList().printLinkedList(newHead);
    }
}
