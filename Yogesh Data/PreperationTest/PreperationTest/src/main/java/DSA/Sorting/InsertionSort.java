package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 4, 8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                  swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    private static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
