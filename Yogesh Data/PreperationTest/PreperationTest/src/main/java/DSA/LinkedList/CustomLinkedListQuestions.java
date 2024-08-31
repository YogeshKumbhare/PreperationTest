package DSA.LinkedList;

public class CustomLinkedListQuestions {
    private ListNode head;
    private ListNode tail;
    private int size;

    public CustomLinkedListQuestions() {
        this.size = 0;
    }
// insertElement in linkedlist

    public void insertElement(int value) {
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;
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
        ListNode listNode = new ListNode(value);
        tail.next = listNode;
        tail = listNode;
        size++;

    }

    // insertElement at index level the element in linkedlist
    public void insertElementAtIndex(int val, int index) {
        if (index == 0) { // if idenx is match to 0th then add element
            insertElement(val);
            return;
        }
        if (size == index) { // if idenx is match to last index size then add element
            insertLastElement(val);
            return;
        }
        // getting index from first to last index and insert element
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode listNode = new ListNode(val, temp.next);
        temp.next = listNode;
        size++;
    }

    // recursive called method
    private ListNode insertRecursive(int val, int index, ListNode listNode) {
        if (index == 0) {
            ListNode temp = new ListNode(val, listNode);
            size++;
            return temp;
        }

        listNode.next = insertRecursive(val, index - 1, listNode.next);
        return listNode;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    ListNode get(int index) {
        ListNode listNode = head;
        for (int i = 0; i < index; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        ListNode secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }


    // display the element in linkedlist
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public ListNode find(int value) {
        ListNode listNode = head;
        while (listNode != null) {
            if (listNode.value == value) {
                return listNode;
            }
            listNode = listNode.next;
        }
        return null;
    }


    public void reverseLikedList(ListNode listNode) {
        if (listNode == tail) {
            head = tail;
            return;
        }
        reverseLikedList(listNode.next);
        tail.next = listNode;
        tail = listNode;
        tail.next = null;
    }

    // reverse linked list -- important program
/// https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if (next != null) {
                next = next.next;
            }
        }
        return  prev;
    }


    //reverse linked list beetween firt and last
    public ListNode revereLinkedListBetweenFirstAndLastElement(ListNode listNode, int left, int right) {
        head = listNode;
        if (left == right) {
            return head;
        }


    // skip first node by left -1
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newListNode = current;


        //reverse beetween left and right
        ListNode next = current.next;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        }


// skip last element by 1
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newListNode.next = current;
        return head;


    }

    //fetch the middle of elemt of linked list

    public ListNode middleNode(ListNode n){
        ListNode slow = n;
        ListNode fast = n;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.value);
        }

        return slow;
    }

    //checkThe List is Palindrome
    public  boolean isPalindrome(ListNode head){
        ListNode mid = middleNode(head); // fetch the middle element of linkedlist

        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reverseHead);

        return head == null || headSecond == null;

    }

    // reorder LinkedList
public ListNode reorderList(ListNode head){

        if(head != null && head.next != null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode hSecond = reverseList(mid);
        ListNode hFirst = head;

        if(hSecond != null && hFirst != null){
            ListNode temp = hFirst.next;
            hFirst.next = hSecond;
            hFirst = temp;

            temp = hSecond.next;
            hSecond.next = hFirst;
            hSecond = temp;
        }


        if(hFirst != null){
            hFirst.next  = null;
        }
        return head;
    }



    class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

    }

}


