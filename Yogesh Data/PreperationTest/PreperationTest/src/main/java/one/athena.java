package one;

import java.util.Arrays;

public class athena {
    public static void main(String[] args) {


//[1:38 PM] Ramesh Chithiravelu (Guest)
//                1st [10, 10, 7]
//​[1:38 PM] Ramesh Chithiravelu (Guest)
//                2nd [5, 10, 7]
//​[1:38 PM] Ramesh Chithiravelu (Guest)
//                3rd [5, 5, 7 ]
//​[1:38 PM] Ramesh Chithiravelu (Guest)
//                4th [ 5, 5, 4]


        final int i = 10;
        int arr[] = {i, 20, 7};
  int k = 2;
        Arrays.sort(arr); // 7 10 20

        int arr1[] = Arrays.copyOf(arr,arr.length) ;
        System.out.println(arr1.toString());


    }
}
