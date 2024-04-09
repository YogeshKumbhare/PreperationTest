package DSA.LinkedList;

public class CirculatLinkedList {

    private Node head;
    private Node tail;

    public CirculatLinkedList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public CirculatLinkedList() {

    }

    public void insert(int val){
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

    public void delete(int val){
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

    public void display() {
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.val + " --> ");
                temp = temp.next;
            } while (temp != head);

            System.out.println(" Head");
        }
    }
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }
}
