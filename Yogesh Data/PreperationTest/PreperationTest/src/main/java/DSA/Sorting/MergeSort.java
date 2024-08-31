package DSA.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
        public static void main(String[] args) {
            int[] arr = {8, 4, 23, 42, 16, 15};
            mergeSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        public static void mergeSort(int[] arr, int low, int high) {
            if (low < high) {
                int mid = low + (high - low) / 2;
                mergeSort(arr, low, mid);
                mergeSort(arr, mid + 1, high);
                merge(arr, low, mid, high);

            }
        }

    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[low..mid]
     * Second subarray is arr[mid+1..high]
     *
     * @param arr the input array to be sorted
     * @param low the starting index of the first subarray
     * @param mid the ending index of the first subarray
     * @param high the ending index of the second subarray
     */
    public static void merge(int[] arr, int low, int mid, int high) {
        // Calculate the sizes of the two subarrays
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        // Create temporary arrays to hold the elements of the two subarrays
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[low + i];
        }

        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the two temporary arrays back into arr[low..high]
        int i = 0, j = 0, k = low;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left[] if there are any
        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right[] if there are any
        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}

