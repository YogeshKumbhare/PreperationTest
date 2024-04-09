package DSA.LinkedList;

public class MergeLinkedList {
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // insert element in the list
    public void insertElement(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
// insertElement at last in linkedlist

    public void insertLastElement(int value) {
        if (tail == null) {
            insertElement(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    // display the element in linkedlist
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    //remove duplicate elment in the list
    public void removeDuplicateElement() {
        Node node = head;
        if (node == null) {
            System.out.println(node.value);
        }

        while (node.next != null) {

            if (node.value == node.next.value) {
                node.next = node.next.next;
                size++;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;


    }

    public static MergeLinkedList mergeTwoList(MergeLinkedList first, MergeLinkedList second) {
        MergeLinkedList ans = new MergeLinkedList();
        Node f = first.head;
        Node s = second.head;

        while (f != null && s != null) {

            if (f.value < s.value) {
                ans.insertLastElement(f.value);
                f = f.next;
            } else {
                ans.insertLastElement(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLastElement(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLastElement(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {

        MergeLinkedList firstList = new MergeLinkedList();
        MergeLinkedList secondList = new MergeLinkedList();
        ;
        firstList.insertLastElement(1);
       // firstList.insertElement(1);
        firstList.insertLastElement(3);
        firstList.insertLastElement(5);

        secondList.insertLastElement(1);
       // secondList.insertElement(1);
        secondList.insertLastElement(2);
        secondList.insertLastElement(9);
        secondList.insertLastElement(14);
        MergeLinkedList list = mergeTwoList(firstList,secondList);
        list.display();
    }
}
