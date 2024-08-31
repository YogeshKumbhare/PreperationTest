package leetcode;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeat {
    public static void main(String[] args) {
       String input = "workattech";

        System.out.println(longestSubstringWithoutRepeat(input));

    }

    static int longestSubstringWithoutRepeat(String s) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int k=0;
        for(int i=0;i<s.length();i++){

            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLength=Math.max(maxLength,i-k+1);

            }else{
                while(s.charAt(k)!=s.charAt(i)){
                    set.remove(s.charAt(k));
                    k++;
                }
                set.remove(s.charAt(k));k++;
                set.add(s.charAt(i));
            }

        }
        return maxLength;
    }
}
