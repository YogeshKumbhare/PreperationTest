package one;



public class zombies {

    static Node head;

   static class Node{

        int data;
        Node next;

         Node(int temp){

            data=temp;
            next=null;
        }
    }

    void printLink(Node head){

        while(head != null){

            System.out.print(head.data);
            head =head.next;
        }

    }

    Node reversedLinkedList(Node head, int k) {

        Node pre = null;
        Node curr =head;
        Node next = null;

        while(curr != null ){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
        return head;
    }
    public static void main(String[] args) {
//        0 - empty
//        1 - humans
//        2 - zombies
//
//
//        2 1 0 1
//        1 1 0 2
//        0 0 0 1
//        0 1 0 1
//
//        2 2 0 2
//        2 1 0 2
//        0 0 0 2
//        0 1 0 1
//
//        2 2 0 2
//        2 2 0 2
//        0 0 0 2
//        0 1 0 2

//        Input: 1->2->3->4->5->6->7->8->NULL, K = 3
//        Output: 3->2->1->6->5->4->8->7->NULL
//        Input: 1->2->3->4->5->6->7->8->NULL, K = 5
//        Output: 5->4->3->2->1->8->7->6->NULL
        zombies z= new zombies();


        z.head = new Node(1);
        z.head.next = new Node(2);
        z.head.next.next = new Node(3);
        z.head.next.next.next = new Node(4);
        z.head.next.next.next.next = new Node(5);
        Node head1 = z.reversedLinkedList( head,3);
        z.printLink(head1);
    }
}
