package DSA.LinkedList;

public class CyclicLinkedListQuestions {
    private ListNode head;
    private ListNode tail;

    public void insert(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public ListNode display() {
        ListNode temp = head;
        if (temp != null) {
            do {
                // System.out.print(temp.val + " --> ");
                return temp = temp.next;
            } while (temp != head);

            // System.out.println(" Head");
        }
        return temp;
    }

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("fast : " + fast.val + " --> " + "slow : " + slow.val);

                return true;
            }
        }

        return false;
    }

    public ListNode sortedListToBST(ListNode head) {
        if(head == null) return null;

        return toBST( head, null);


    }

    ListNode toBST(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;

        if(head == tail)
            return head;

        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;

        }

//        TreeNode thead = new TreeNode(slow.val);
//        thead.left = toBST(head,slow);
//        thead.right = toBST(slow.next,tail);
//        return thead;
        return null;
    }




    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }


    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            fast = findSquare(findSquare(fast));
            slow = findSquare(slow);
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number/10;
        }
        return ans;
    }


    public ListNode middleNode(ListNode n){
        ListNode slow = n;
        ListNode fast = n;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println(slow.val);
        }

        return slow;
    }
    public static void main(String[] args) {
        CyclicLinkedListQuestions cyclicLinkedListQuestions = new CyclicLinkedListQuestions();
        cyclicLinkedListQuestions.insert(1);
        cyclicLinkedListQuestions.insert(2);

        cyclicLinkedListQuestions.insert(3);
        cyclicLinkedListQuestions.insert(4);
        cyclicLinkedListQuestions.insert(5);
        cyclicLinkedListQuestions.insert(6);
        cyclicLinkedListQuestions.insert(7);
        cyclicLinkedListQuestions.insert(7);
        cyclicLinkedListQuestions.insert(8);


        ListNode n = cyclicLinkedListQuestions.display();
        //cyclicLinkedListQuestions.hasCycle(n);
        //System.out.println("detect cycle :" + cyclicLinkedListQuestions.detectCycle(n).val);
        System.out.println("length of the  cycle :" + cyclicLinkedListQuestions.lengthCycle(n));
        //System.out.println(cyclicLinkedListQuestions.isHappy(19));
       // System.out.println(cyclicLinkedListQuestions.middleNode(n));

    }


    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
