package one;



import java.util.*;

public class RemoveDuplicateEment {
    public static void main(String[] args) {

        LinkedHashSet hashSet = new LinkedHashSet();
        String stringWithDuplicates = "yogeshy";
//        StringBuffer sb = new StringBuffer();
//        stringWithDuplicates.chars().distinct();
//        String duplicatesRemoved = sb.toString();
//        System.out.println("String after duplicates removed : " +
//                duplicatesRemoved.toString());

        char [] arr = stringWithDuplicates.toCharArray();
        for (Character ch : arr){

            if(!hashSet.contains(ch))

                hashSet.add(ch);
        }

        System.out.println("print :"+hashSet.toString());
    }
}
