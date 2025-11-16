package one;

// Java implementation of the approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GFG{
    // Function that prints
// the required sequence
    static List<Integer> split(Integer x, Integer n)
    {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
           // return arrayList.add(Integer.valueOf(i));
        }

        int size = n;
        for (int start = 0; start < arrayList.size(); start += size) {
            int end = Math.min(start + size, arrayList.size());
            List<Integer> sublist = arrayList.subList(start, end);
           return sublist;
        }
        return null;
    }

    // Driver code
    public static void main(String[] args)
    {

        Integer x = 10;
        Integer n = 5;
        List<Integer> s = split(x, n);

        System.out.println(Arrays.asList(s));
    }
}
//This code is contributed by mits
