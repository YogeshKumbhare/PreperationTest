package DSA.Searching;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
         findDuplicate(new int[]{2, 3, 4, 3,2,4});
    }
    public static int[] findDuplicate(int[] nums) {
        int a[] = new int[nums.length];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-1;i++) {
                if (nums[i] == nums[i+1]) {
                    System.out.println(nums[i]);
                }
        }
        return a;
    }
}

