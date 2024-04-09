package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  Your input
        [-1,0,1,2,-1,-4]
        Output
        [[-1,-1,2],[-1,0,1]]
        Expected
        [[-1,-1,2],[-1,0,1]]
        */


public class ThreeSum {
    public static void main(String[] args) {
        int[] str = new int[]{-1, 0, 1, 2, -1, -4};
        getArray(str);
    }

    private static List<List<Integer>> getArray(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> listArray = new ArrayList<>();
                    listArray.add(nums[i]);
                    listArray.add(nums[j]);
                    listArray.add(nums[k]);

                    list.add(listArray);
                    j++;
                    k--;
                }

            }

        }
        System.out.println(list);
        return list;
    }
}
