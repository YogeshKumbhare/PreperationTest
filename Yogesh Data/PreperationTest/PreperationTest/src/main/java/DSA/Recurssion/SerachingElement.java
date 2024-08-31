package DSA.Recurssion;

import java.util.ArrayList;
import java.util.List;

public class SerachingElement {
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 9,9, 10};
//        System.out.println(searchingElementRecurssion(arr, 0, 9));
//
//        System.out.println(findIndex(arr, 0, 9));
//
//        System.out.println(findIndexLast(arr, arr.length - 1, 5));

       List list =  new ArrayList<Integer>();
        System.out.println(findIndexOfTargetElement(arr, arr.length - 1, 9, list));

    }

    private static List<Integer> findIndexOfTargetElement(int[] arr, int index, int target, List<Integer> list) {

        if(index == arr.length ){
            return list;
        }

        if(target == arr[index]){
            list.add(index);
        }else{
            findIndexOfTargetElement(arr, index, target,list);
        }

        return list;
    }

    static boolean searchingElementRecurssion(int arr[], int index, int target) {

        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] == target || searchingElementRecurssion(arr, index + 1, target));
    }

    static int findIndex(int arr[], int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, index + 1, target);
        }
    }

    static int findIndexLast(int arr[], int index, int target) {
        if ( index == -1) {
            return -1;
        }
        if ( arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, index - 1, target);
        }
    }
}
