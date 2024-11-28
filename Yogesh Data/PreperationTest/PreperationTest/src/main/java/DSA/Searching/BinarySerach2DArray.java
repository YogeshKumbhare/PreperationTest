package DSA.Searching;

import java.util.Arrays;

public class BinarySerach2DArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 02, 03, 04},
                {5, 6, 07, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int target = 16;
        int[] ans = searchmatrix(arr, target);
        System.out.println(ans);
    }

//simple binary program to search target elemnt in 2d array

//    private static boolean searchMatrix(int[][] arr, int target) {
//
//        int row = 0;
//        int col = arr[0].length - 1;
//        while (row < arr.length && col >= 0) {
//            if (arr[row][col] == target) {
//                return true;
//            } else if (arr[row][col] > target) {
//                col--;
//            } else {
//                row++;
//            }
//        }
//        return false;
//
//    }

// Program to write a searchmatrix
    private static int[] searchmatrix(int arr[][], int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[]{-1,-1};
    }

}
