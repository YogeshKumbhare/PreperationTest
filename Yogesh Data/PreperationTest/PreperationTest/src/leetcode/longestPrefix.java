package leetcode;

public class longestPrefix {
    public static void main(String[] args) {
/// output  = "fl"
        String [] strs = {"flower","flow","flight"};
        String s = strs[0];

        for (int i =1; i< strs.length; i++){
           while(strs[i].indexOf(s) != 0) {
               s = s.substring(0, s.length() - 1);
               System.out.println(s);
           }
        }

    }

}
