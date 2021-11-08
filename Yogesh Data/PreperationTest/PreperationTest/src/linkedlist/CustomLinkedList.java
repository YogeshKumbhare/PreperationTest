package linkedlist;

public class CustomLinkedList {

    static Node head;
    static class Node {

        int data ;
        Node next;
        Node(int data){
          this.data = data;
          this.next= null;

        }
    }

    static void printList(Node node){
        while(node != null){

            System.out.println(node.data);
            node=node.next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(23);
        list.head.next =  new Node(72);
        list.head.next.next =  new Node(43);
        printList(head);
    }
}
