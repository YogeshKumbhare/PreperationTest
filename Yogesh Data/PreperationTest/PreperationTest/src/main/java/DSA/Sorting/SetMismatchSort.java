package DSA.Sorting;

import java.util.Arrays;

public class SetMismatchSort {

    public static void main(String[] args) {
        int arr[] = {4,2,1,2};
        System.out.println(Arrays.toString(setMisMatch(arr)));
    }

    private static int[] setMisMatch(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1 ;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // find first missing element
        for (int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                return new int[]{arr[j], j+1};
            }
        }

        return new int []{-1,-1};
    }
    private static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
