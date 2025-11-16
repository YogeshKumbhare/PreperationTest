package company;

import java.util.Arrays;

public class FindDuplicatesElements {

    // Function return true if given element
    // found in array
    private static void check(Integer[] arr, int toCheckValue) {
        // check if the specified element
        // is present in the array or not
        // using contains() method
        boolean test = Arrays.asList(arr).contains(toCheckValue);

        // Print the result
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }

    public static void main(String[] args) {

        // Get the array
        Integer arr[] = {5, 1, 1, 9, 7, 2, 2, 6, 10};


        for(int i = 0 ; i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if(Arrays.asList(arr[i])
                        .contains(arr[j])){

                    System.out.println(arr[j] + " ");
                }

            }


        }


        // Get the value to be checked
        int toCheckValue = 7;

        // Print the array
        System.out.println("Array: "
                + Arrays.toString(arr));

    }
}


