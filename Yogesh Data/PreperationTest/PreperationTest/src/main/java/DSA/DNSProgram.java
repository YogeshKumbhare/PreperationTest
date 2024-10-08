package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DNSProgram {
    public static void main(String[] args) {

//        All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG".
//        When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
//
//        Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
//
//        Example:
//
//        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"


        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Set<String> countSet = new HashSet<>(), set1 = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (!countSet.add(sub))
                set1.add(sub);
        }
        System.out.println(Arrays.asList(set1));

    }
}
