package DSA.StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack stack = new java.util.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("**************************");

        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);


    }
}
