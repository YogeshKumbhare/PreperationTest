package one;

public class zapcom {

    static Node head;

    static class Node {

        int data ;
        Node next;

         Node(int data){
            this.data= data;
            this.next =null;

        }

    }



    public static void main(String[] args) {
        zapcom zapcom = new zapcom();

        Node head = new Node(23);
        head.next = new Node(45);
        head.next.next = new Node(67);


        printLinkedlist(head);





    }

    private static void printLinkedlist(Node head) {

        while (head != null){

            System.out.println(head.data);
            head = head.next;
        }

    }
}
