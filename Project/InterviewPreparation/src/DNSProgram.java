import java.util.HashSet;
import java.util.Set;

public class DNSProgram {
    public static void main(String[] args) {
//        All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
//
//        Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
//
//        Example:
//
//        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

//        Output: ["AAAAACCCCC", "CCCCCAAAAA"]

        // DNS Program continues 10 char fetch from string
    String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Set<String> seen = new HashSet<>(), repeat = new HashSet<>();
         for (int i = 0; i <= str.length()-10; i++){
             System.out.println(i);
         }



    }
}
