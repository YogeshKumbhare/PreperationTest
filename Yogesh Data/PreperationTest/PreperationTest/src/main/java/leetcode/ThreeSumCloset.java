package leetcode;

/*Input: nums = [-1,2,1,-4], target = 1
        Output: 2
        Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumCloset {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 2,1,-4};

        getArray( nums, 1);


    }
    private static int getArray(int[] nums, int target) {
        Arrays.sort(nums);
        int a = 0;
        int mingap = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
               int gap = Math.abs(target - sum);

               if(gap < mingap){
                   a = sum;
                   mingap = gap;
               }
               if(sum < target)
                   j++;
               else
                   k--;
            }

        }
        System.out.println(a);
        return a;
    }
}
