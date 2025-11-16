package linkedlist;

import java.util.HashSet;

public class LinkedListRemoveDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {

        Node n1 = new Node(23);
        Node n2 = new Node(34);
        Node n3 = new Node(2);
        Node n4 = new Node(9);
        Node n5 = new Node(23);
        Node n6 = new Node(44);
        Node n7 = new Node(23);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        //prntLinkedlist(n1);
        Node temp;
        removeDuplicateElemt(n1);
        System.out.println("after duplicate remove element");
        prntLinkedlist(n1);
        System.out.println();
        boolean searchElemnnt = searchElement(n1, 9);
        System.out.println(searchElemnnt ? "Elemnt is available" : "Elemnt not available");

    }

    private static boolean searchElement(Node n1, int i) {

        Node current = n1;
        while (current != null) {
            if (current.data == i)
                return true;
            current = current.next;
        }
        return false;
    }

    private static void removeDuplicateElemt(Node head) {

//        Node currentNode = head;
//        while (currentNode != null) {
//            Node temp = currentNode;
//            while (temp != null && temp.data == currentNode.data) {
//                temp = temp.next;
//            }
//            currentNode.next = temp;
//            currentNode = currentNode.next;
//        }

        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }


    private static void prntLinkedlist(Node n1) {
        while (n1 != null) {
            System.out.print(n1.data + " ");
            n1 = n1.next;
        }
    }

}
