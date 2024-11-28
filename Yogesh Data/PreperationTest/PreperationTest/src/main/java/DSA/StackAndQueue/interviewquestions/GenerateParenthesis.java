package DSA.StackAndQueue.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(gp(3)));
    }

    private static List<String> gp(int n) {
        ArrayList<String> list = new ArrayList();
        generateParenthesis(n,"",0,0,list);
        return list;
    }

    private static void generateParenthesis(int n, String s, int open, int close, List<String> list) {

        if(2*n==s.length()){
            list.add(s);
            return;
        }
        if(open<n){
            generateParenthesis(n,s+"(",open+1,close,list);
        }
        if(close<open){
            generateParenthesis(n,s+")",open,close+1,list);
        }
    }
}
