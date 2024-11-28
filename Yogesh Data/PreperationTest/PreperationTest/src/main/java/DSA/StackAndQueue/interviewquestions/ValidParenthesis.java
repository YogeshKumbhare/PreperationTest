package DSA.StackAndQueue.interviewquestions;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        boolean test = validParenthesis("()()");
        System.out.println(test);
    }

    public static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
            if (ch == ')') {
                if (stack.isEmpty() && stack.pop() != '(') {
                   return false;
                }
            }
            if (ch == '}') {
                if (stack.isEmpty() && stack.pop() != '{') {
                   return false;
                }
            }
            if (ch == ']') {
                if (stack.isEmpty() && stack.pop() != '[') {
                    return false;
                }
            }
            }
        }
        return stack.isEmpty();
    }
    }
