package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 4, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int arr[]) {
        boolean swapped ;
        //start loop first from
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            int count = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                    System.out.println("swapped + " + count++);
                }
            }
// if you did not swapped the array it means the rets of the array is sorted .
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
