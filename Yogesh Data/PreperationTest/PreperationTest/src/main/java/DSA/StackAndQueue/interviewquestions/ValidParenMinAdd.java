package DSA.StackAndQueue.interviewquestions;


import java.util.Stack;

public class ValidParenMinAdd {
    public static void main(String[] args) {
        int a = minAddtomakeparenthesis("()}");
        System.out.println(a);
    }

public static int minAddtomakeparenthesis(String s){
    Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch == '(') {
                if (!stack.isEmpty() && stack.peek() == ')') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
                return stack.size();
        }
}
