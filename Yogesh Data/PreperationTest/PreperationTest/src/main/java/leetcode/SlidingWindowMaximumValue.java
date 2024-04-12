package leetcode;

import java.util.Arrays;

public class SlidingWindowMaximumValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(getMaxNumbersArr(arr,3)));
    }

    //brut-force algorithm
//Brute Force is a straightforward method used in algorithmic problem-solving
// that checks every possible solution until the correct one is found. Brute Force Algorithms
// function by searching each element sequentially until the desired result is found or
// options are exhausted.
    public static int[] getMaxNumbersArr(int[] nums, int k) {

        int arr[] = new int[nums.length-k+1];
        int max ,r = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            max = nums[i];
            for (int j = 1; j < k; j++) {
                if (nums[i + j] > max) {
                    max = nums[i + j];
                }

            }
             arr[r++] = max;

        }

        return arr;
    }
}
