package company;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {0,76,45,23,4, 1, 7, 3};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int n1 = arr.length;
        for (int k = 0; k < n1; ++k)
            System.out.println(arr[k] + " ");

        /// recursive bubble sort programing
        // bubbleSort(arr, arr.length);
        // selectionSort(arr,arr.length);
        // insertionsort(arr, arr.length);
        // quicksort(arr,0,n-1);
       // System.out.println(Arrays.toString(arr));
    }

//    private static void quicksort(int[] arr, int low, int high) {
//
//          if(low < high){
//              int pi = partition(arr, low,high);
//
//              quicksort(arr,low,pi-1);
//              quicksort(arr,pi+1,high);
//          }
//
//
//    }
//
//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = (low-1);
//        for(int j=low;j<=high-1;j++){
//
//            if(arr[j] < pivot){
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i+1];
//        arr[i+1] = arr[high];
//        arr[high] = temp;
//        return(i+1);
//    }

//    private static void insertionsort(int[] arr, int n) {
//
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//
//            }
//            arr[j + 1] = key;
//        }
//    }

//    private static void selectionSort(int[] arr, int n) {
//
//        if(n==1)
//            return;
//
//        for(int i=0;i<n-1;i++){
//            int min_index = i;
//
//            for(int j=i+1;j<n;j++){
//                if(arr[j] < arr[min_index])
//                    min_index = j;
//                int temp = arr[min_index];
//                arr[min_index] = arr[i];
//                arr[i] = temp;
//            }
//        }
//    }

//    static void bubbleSort(int arr[], int n) {
//        if (n == 1)
//            return;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//
//            }
//            bubbleSort(arr, n - 1);
//        }
//
//
//    }
}
