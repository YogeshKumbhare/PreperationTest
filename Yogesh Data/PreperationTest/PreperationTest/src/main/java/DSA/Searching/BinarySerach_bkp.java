package DSA.Searching;

import java.util.Arrays;

public class BinarySerach_bkp {
    public static void main(String[] args) {
        int arr[] = {3, 2, 56, 7, 32, 45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int a = extracted(arr);
        System.out.println(a);
    }

    private static int extracted(int[] arr) {
        int element = 32;

        int low = 0, mid, high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == element) {
                return mid;
            }

            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
