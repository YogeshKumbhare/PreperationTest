package DSA.LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertValue(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " <==> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList circulatLinkedList = new LinkedList();
        circulatLinkedList.insertValue(23);
        circulatLinkedList.insertValue(4);
        circulatLinkedList.insertValue(34);
        circulatLinkedList.insertValue(25);
        circulatLinkedList.insertValue(53);
        circulatLinkedList.display();
    }
}


class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}