package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

class DuplicateNumberList {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2,4};
        System.out.println(findDuplicate(arr));
    }

    public static List<Integer> findDuplicate(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;

    }
    private static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}