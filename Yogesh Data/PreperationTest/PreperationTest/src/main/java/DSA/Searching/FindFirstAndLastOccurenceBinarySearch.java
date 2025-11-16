package DSA.Searching;

import java.util.Arrays;

public class FindFirstAndLastOccurenceBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 9, 24};
        int target = 8;
        int[] ans = {-1, -1};
        ans[0] = binarySearch(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(arr, target, false);
        }
        System.out.println("main string args - " + Arrays.toString(ans));
    }


    public static int binarySearch(int[] arr, int target, boolean firstOccurence) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // possible ans
                ans = mid;
                if (firstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
