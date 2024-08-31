package DSA.Recurssion;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 9, 10};
        System.out.println(sortedArray(arr, 0));
    }

    static boolean sortedArray(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index + 1] && sortedArray(arr, index + 1));
    }
}
