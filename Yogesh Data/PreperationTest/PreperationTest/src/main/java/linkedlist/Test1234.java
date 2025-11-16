package linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test1234 {
    public static void main(String[] args) {

//
//        // 8
////        4+4
////        4+1+3
//        int a = 8;
//
//        printCombination(a,1);
//
//    }
//    public  static void printCombination(int a, int k){
//
//        int arr[] = new int[a];
//
//        if(a == 0){
//
//            System.out.println(Arrays.stream(arr).limit(0).boxed().collect(Collectors.toList()));
//        }
//
//        for(int i=k;i<=a;i++){
//            arr[0]=i;
//            printCombination( a-i,i);
//        }

     // {3,2,1,9,4,0,11,23,8,7}

        int arr[]= {3,2,1,9,4,0,11,23,8,7};

        int a;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println(arr[3]);
    }

}
