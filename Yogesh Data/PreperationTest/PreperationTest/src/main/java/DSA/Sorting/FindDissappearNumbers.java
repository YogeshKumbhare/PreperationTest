package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

class FindDissappearNumbers {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1,9,5};
        System.out.println(MissingElement(arr));
    }

    private static List<Integer> MissingElement(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
               ans.add(j+1);
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