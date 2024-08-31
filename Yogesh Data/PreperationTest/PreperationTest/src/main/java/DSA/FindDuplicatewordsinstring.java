package DSA;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatewordsinstring {
    public static void main(String[] args) {
        String str = "balloonballoon";
        findDuplicate(str);
    }

    public static void findDuplicate(String str) {
        String input = "bal3loownbal2loon";
        String word = "balloon";

        Map<Character, Integer> charCount = new HashMap<>();
        Map<Character, Integer> wordCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : word.toCharArray()) {
            wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
        }

        int maxBalloonCount = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int inputCharCount = charCount.getOrDefault(c, 0);
            maxBalloonCount = Math.min(maxBalloonCount, inputCharCount / count);
        }

        System.out.println("The maximum number of 'balloon' that can be formed is: " + maxBalloonCount);

//        String[] s = str.split("");
//        Arrays.sort(s);
//        for (int i = 0; i < s.length - 1; i++) {
//            if (s[i].equals(s[i + 1])) {
//                System.out.println(s[i]);
//            }
//        }
//        return false;
    }
}
