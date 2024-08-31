package DSA.LinkedList;

import java.util.logging.Logger;

/**
 * This class represents a Circular Linked List data structure.
 */
public class CirculatLinkedList {
    private static final Logger logger = Logger.getLogger(CirculatLinkedList.class.getName());

    private Node head;
    private Node tail;

    /**
     * Constructor for Circular Linked List with head and tail nodes.
     * @param head The head node of the list
     * @param tail The tail node of the list
     */
    public CirculatLinkedList(Node head, Node tail) {
        logger.info("Constructor called with head=" + head + ", tail=" + tail);
        this.head = null;
        this.tail = null;
    }

    /**
     * Default constructor for Circular Linked List.
     */
    public CirculatLinkedList() {

    }

    /**
     * Inserts a new node with the given value to the circular linked list.
     * @param val The value to be inserted
     */
    public void insert(int val){
        logger.info("Inserting value: " + val);

        Node node =  new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    /**
     * Deletes a node with the given value from the circular linked list.
     * @param val The value to be deleted
     */
    public void delete(int val){
        logger.info("Deleting value: " + val);

        Node node =  head;

        if(node == null){
            return;
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    /**
     * Displays the elements of the circular linked list from head to tail.
     */
    public void display() {
        logger.info("Displaying list");

        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            } while (temp != head);

            System.out.println(" Head");
        }
    }

    /**
     * Inner class representing a node in the circular linked list.
     */
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }
}