package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {2,4,1,8,6};
        Sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int arr[], int low, int high) {

        if (low >= high) {
            return;
        }

        int start = low;
        int end = high ;
        int m = start + (end - start) / 2;
        int pivote = arr[m];


        while (start <= end) {

            while (arr[start] < pivote) {
                start++;
            }
            while (arr[end] > pivote) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            Sort(arr, start, end);
            Sort(arr, start, high);

        }

    }
}



