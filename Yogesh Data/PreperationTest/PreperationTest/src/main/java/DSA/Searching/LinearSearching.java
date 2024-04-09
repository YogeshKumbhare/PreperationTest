package DSA.Searching;

public class LinearSearching {
    public static void main(String[] args) {
        int arr[] = {3, 2, 56, 7, 32, 45};
        int element = 67;
        int a = lineaSerach(arr, element);
        System.out.println("Found element in index of " + a);

    }

    private static int lineaSerach(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return arr[i];
            }
        }
    return  Integer.MAX_VALUE;
    }

    private static int lineaSerach1(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

}
