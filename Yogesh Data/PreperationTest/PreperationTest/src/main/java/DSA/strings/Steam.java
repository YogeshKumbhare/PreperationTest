package DSA.strings;

import scala.Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Steam {
    public static void main(String[] args) {
      //  System.out.println(skipApple("badapplefg"));
        subSetDuplicates(new int[]{1,2,2}).stream().forEach(e -> System.out.println(e));

    }

    //skip char a
    public static String skip(String unskipString) {
        if (unskipString.isEmpty()) {
            return "";
        }
        char ch = unskipString.charAt(0);
        if (ch == 'a') {
            return skip(unskipString.substring(1)); /// skip the element is match
        } else {
            return ch + skip(unskipString.substring(1)); /// add element if the element is not match
        }
    }


    //skipp apple string
    public static String skipApple(String unskipString) {
        if (unskipString.isBlank()) {
            return "";
        }
        String ans = "";
        if (unskipString.startsWith("apple")) {
            return skipApple(unskipString.substring(5)); /// skip the element is match
        } else {
            return unskipString.charAt(0) + skipApple(unskipString.substring(1)); /// add element if the element is not match
        }
    }

    public static List<List<Integer>> subSetDuplicates(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
