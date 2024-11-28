package DSA.LinkedList;

public class FindDuplicateElementInList {
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

    public static void main(String[] args) {
        FindDuplicateElementInList findDuplicateElementInList = new FindDuplicateElementInList();
        findDuplicateElementInList.insertElement(12);
        findDuplicateElementInList.insertElement(12);

        findDuplicateElementInList.insertElement(24);
        findDuplicateElementInList.insertElement(34);
        findDuplicateElementInList.insertElement(45);

        findDuplicateElementInList.insertElement(45);
        findDuplicateElementInList.display();
        findDuplicateElementInList.removeDuplicateElement();
        findDuplicateElementInList.display();

    }
}
