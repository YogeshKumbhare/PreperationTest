package DSA.LinkedList;

public class CustomeDoublyLinkedList {
Node head;

public void InsertDoublyList(int val){
    Node node = new Node(val);
            node.next = head;
            node.prev = null;
            if(head != null) {
                head.prev = node;
            }
            head = node;
}

public void insertDoublyLast(int val){
    Node node = new Node(val);
    Node last = head;
    node.next = null;
    if(head == null){
        node.prev = null;
        head = node;
        return;
    }
    while(last.next != null) {
        last = last.next;
    }
    last.next = node;
    node.prev = last;
}

public void InsertNode(int after, int val ){
    Node p = find(after);

    Node node = new Node(val);
    node.next = p.next;
    p.next = node;
    node.prev = p;
    if(node.next != null) {
        node.next.prev = node;
    }


}
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

public void display(){
    Node node = head;
    Node last = null;
    while(node != null){
        System.out.print(node.val + " <==> ");
        last = node;
        node = node.next;
    }
    System.out.println("End");
    System.out.println("Print Node from previous position");

    while(last != null){
        System.out.print(last.val + " <==> ");
        last = last.prev;
    }
    System.out.println("End");

}

    class Node {
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

}
