package DSA.Searching;

public class CharacterSerachCeilingBinarySearch {
    public static void main(String[] args) {
        char[] arr = {'c','i','j' };
        char target = 'a';
        char ans = ceilingSerach(arr, target);
        System.out.println("main string args = " +  ans);
    }

    /// return the result is smallest element in the array greater or equal to target
    public static char ceilingSerach(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                 start = mid + 1;

            }
        }
        return arr[start%arr.length];
    }
}
