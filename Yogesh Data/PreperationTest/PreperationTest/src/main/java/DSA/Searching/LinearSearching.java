package DSA.Searching;

public class LinearSearching {
    public static void main(String[] args) {
        int arr[] = {3, 2, 56, 7, 32, 45};
        int element = 563;
        int a = lineaSerach(arr, element);
        if(a != -1) {
            System.out.println("Found element in index of " + a);
        }else {
            System.out.println("Not Found element in array " + element);

        }
    }

    private static int lineaSerach(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
    return  -1;
    }

}
