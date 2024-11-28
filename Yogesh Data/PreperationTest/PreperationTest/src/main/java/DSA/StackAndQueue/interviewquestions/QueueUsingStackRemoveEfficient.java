package DSA.StackAndQueue.interviewquestions;

import java.util.Stack;

public class QueueUsingStackRemoveEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;


    public QueueUsingStackRemoveEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int iteam) {

        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(iteam);

        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove() {

        return first.pop();
    }

    public int peek() {
       return first.isEmpty() ? 0: first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public void Display(){
        System.out.println("first" + first );
        System.out.println("second" + second );
    }

}
