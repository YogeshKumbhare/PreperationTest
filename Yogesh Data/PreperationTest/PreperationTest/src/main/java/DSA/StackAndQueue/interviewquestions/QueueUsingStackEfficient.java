package DSA.StackAndQueue.interviewquestions;

import java.util.Stack;

public class QueueUsingStackEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;


    public QueueUsingStackEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int iteam) {
        first.push(iteam);
    }

    public int remove() {
        while (!isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public void Display(){
        System.out.println("first" + first );
        System.out.println("second" + second );
    }

}
