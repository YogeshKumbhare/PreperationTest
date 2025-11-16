package one;

// Java implementation of the approach

import java.util.*;

class GFG1 {

    private static List<Integer> splitIntoParts(Integer whole, Integer parts) {
        Integer[] arr = new Integer[parts];
        Integer remain = whole;
        Integer partsLeft = parts;
        for (Integer i = 0; partsLeft > 0; i++) {
            Integer size = (remain + partsLeft - 1) / partsLeft; // rounded up, aka ceiling
            arr[i] = size;
            remain -= size;
            partsLeft--;
        }

        //Collections.reverse(Arrays.asList(arr));
        List<Integer> list = Arrays.asList(arr);
        return list;
    }

    public static void main(String[] args) {

        List<Integer> ar = GFG1.splitIntoParts(20,7);


        System.out.println(Arrays.asList(ar).toString());

    }
}
