package DSA.Searching;

import java.util.Arrays;

public class InfiniteNumberFindBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 9, 24};
        int target = 24;
       int ans =  searchArray(arr,target);
        System.out.println("main string args - " +ans);
    }

    static int searchArray(int arr[], int target){
        int start= 0; int end = 1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1)* 2;
            start = newStart;
        }
         return binarySearch(arr, target, start, end);

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {;
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
               return mid;
            }
        }
        return ans;
    }

}
