package DSA;

import java.util.Arrays;

public class DeletionFromArray {
    public static void main(String[] args) {

        int[] arr = {3,2,56,7,32,45};
        int index = 0;
        for(int i = index; i < arr.length -1 ; i++){

            arr[i]= arr[i + 1];
            System.out.print(arr.length);

        }

      //  System.out.print(Arrays.asList(arr[i]));


    }
}
