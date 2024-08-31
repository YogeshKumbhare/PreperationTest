package leetcode;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSumArray {
    public static void main(String[] args) {
int arr[] = {-1,0,1,2,-1,-4,-4,8};
int kk = 24;
        System.out.println(threeSum(arr,kk) ); //true  or false if matched with k  of three numbers
        System.out.println(getDataOfThreeSum(arr) ); //[[-4, -4, 8], [-1, -1, 2], [-1, 0, 1]]


    }

    public static List<List<Integer>> threeSum(int[] nums, int t) {
        List<List<Integer>> listString = new ArrayList<>();
        List<Integer> strings = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == t) {
                        System.out.println("Triplet is " + nums[i] + ", " + nums[j] + ", " + nums[k]);
                        strings.add(nums[i]);
                        strings.add(nums[j]);
                        strings.add(nums[k]);
                        listString.add(strings);
                        return listString;
                    }
                }
            }

        }
        return null;
    }

    //
//    Map<String, String> map = new HashMap<>();
//
//    Iterator iter = map.entrySet().iterator();
//	while (iter.hasNext()) {
//        Map.Entry entry = (Map.Entry) iter.next();
//        System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
//    }


    public static List<List<Integer>> getDataOfThreeSum(int nums[]) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        if (nums[0] > 0) {
            return answer;
        }
        Map<Integer, Integer> hasMap = new HashMap();

        for (int i = 0; i < nums.length; ++i) {
            hasMap.put(nums[i], i);
        }
       // hasMap.forEach((key, value) -> System.out.println("key : " + key +" value : " +  value));

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) {
                break;
            }

            for (int j = i + 1; j < nums.length - 1; ++j) {
                int required = -1 * (nums[i] + nums[j]);
                if (hasMap.containsKey(required) && hasMap.get(required) > j) {
                    answer.add(Arrays.asList(nums[i], nums[j], required));
                }
                j = hasMap.get(nums[j]);
            }
            i = hasMap.get(nums[i]);
        }
return answer;
    }



}
