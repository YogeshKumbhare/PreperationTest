package DSA.LinkedList;

public class MergeSort {

    public ListNode1 sortList(ListNode1 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode1 mid = getMid(head);
        ListNode1 left = sortList(head);
        ListNode1 right = sortList(mid);

        return merge(left, right);
    }


    public ListNode1 merge(ListNode1 list1, ListNode1 list2) {

        ListNode1 node = new ListNode1();
        ListNode1 tail = node;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }

            tail.next = (list1 != null) ? list1 : list2;
            return node.next;

        }
        return null;
    }



    public ListNode1 getMid(ListNode1 head) {
        ListNode1 midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next;
        }
        ListNode1 mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    public ListNode1() {
    }

    ListNode1(int x) {
        val = x;
        next = null;
    }
}

