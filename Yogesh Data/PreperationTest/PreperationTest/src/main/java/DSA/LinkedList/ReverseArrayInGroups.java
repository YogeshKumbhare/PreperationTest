package DSA.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArrayInGroups {

    public static void main(String[] args) {
       ArrayList<Long> test = new ArrayList<>();
        test.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L));
        reverseInGroups(test,  3);
        System.out.println(test);
    }

//    private static void reverseArrays(int[] arr, int n, int l) {
//
//        for (int i = 0; i < n ; i+=l) {
//            int left = i;
//            int right = Math.min(i+l-1, n-1);
//            while (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//
//    }

    static void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();

        // Process each group of size k
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Ensure we don't exceed array bounds

            // Reverse the elements in the current group
            while (left < right) {
                long temp = arr.get(left);          // Use `get` to access ArrayList elements
                arr.set(left, arr.get(right));     // Use `set` to modify ArrayList elements
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }
}

