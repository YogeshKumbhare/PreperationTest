package one;

import java.util.Arrays;

public class BazzarVoice {
    public static void main(String[] args) {

        //  1 2 3 4 5

        int arr[] = {1, 2, 3, 4, 5};

        int a[] = rotateArray(arr, 2);
        System.out.println(a);
    }

    public static int[] rotateArray(int[] arr, int k) {


        for (int i=0;i<k;i++){
            int first;
            int j;
            first =arr[0];
            for( j=0;j<arr.length-1;j++){

                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
       return arr;
    }
}



//
//    public static int[] rotateArray(int[] nums, int k) {
//        for (int i = 0; i < k; i++) {
//            for (int j = nums.length - 1; j > 0; j--) {
//                // move each number by 1 place
//                int temp = nums[j];
//                nums[j] = nums[j - 1];
//                nums[j - 1] = temp;
//            }
//        }
//        return nums;
//    }

