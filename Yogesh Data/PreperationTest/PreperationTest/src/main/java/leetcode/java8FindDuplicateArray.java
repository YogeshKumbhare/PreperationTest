package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class java8FindDuplicateArray {
    public static void main(String[] args) {

//        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
//
//        Set<Integer> uniqueElements = new HashSet<>();
//
//        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
//                .filter(i -> !uniqueElements.add(i))
//                .boxed()
//                .collect(Collectors.toSet());
//
//        System.out.println(duplicateElements);


        int number = 234795433;
        int sum = 0;
        int copyNumber = number ;
        while(copyNumber !=  0 ){

            int lastdigit = copyNumber % 10;
            sum = sum + lastdigit;
            copyNumber = copyNumber/10;
        }
        System.out.println(sum);


    }
}
