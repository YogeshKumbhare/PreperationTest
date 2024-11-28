package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 4, 8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxInde = getMaxIndex(arr, 0, last);
            swap(arr, maxInde, last);
        }
        return null;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
       // int max = start;
        for (int j = start; j <= end; j++) {
            if (arr[start] <= arr[j]) {
                start = j;
            }
        }
        return start;
    }

    private static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

