package DSA.LinkedList;

// Java program to reverse alternate
// k nodes in a linked list

class LinkedListReverseElementInGroups {

    // Function to reverse K groups
    static Node reverseKGroup(Node head, int k) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        Node newHead = null;
        Node tail = null;

        while (curr != null) {
            Node groupHead = curr;
            Node prev = null;
            Node nextNode = null;
            int count = 0;

            // Reverse the nodes in the current group
            while (curr != null && count < k) {
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
                count++;
            }

            // If newHead is null, set it to the
            // last node of the first group
            if (newHead == null) {
                newHead = prev;
            }

            // Connect the previous group to the
            // current reversed group
            if (tail != null) {
                tail.next = prev;
            }

            // Move tail to the end of the
            // reversed group
            tail = groupHead;
        }

        return newHead;
    }

    static void printList(Node node) {
        Node curr = node;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    /*
    1 2 3 4 5 6
    After reversal from kth Element:
    4 3 2 1 5 6
     */


    public static void main(String[] args) {

        // Hardcoded linked list: 1->2->3->4->5->6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        printList(head);

        head = reverseKGroup(head, 4);

        System.out.println("After reversal from kth Element: ");
        printList(head);
    }
}