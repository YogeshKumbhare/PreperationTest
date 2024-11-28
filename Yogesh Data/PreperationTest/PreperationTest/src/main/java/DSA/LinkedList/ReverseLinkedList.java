package DSA.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    /*
    Original Linked List:
    1 2 3 4 5
    Reversed Linked List:
    5 4 3 2 1
     */
    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reversing the linked list
        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(head);
    }
}
