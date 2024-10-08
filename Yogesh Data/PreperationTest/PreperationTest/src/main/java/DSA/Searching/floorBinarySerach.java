package DSA.Searching;

public class floorBinarySerach {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 14, 15, 16, 18, 22, 45, 89};
        int target = -89;
        int ans = floorSerach(arr, target);
        System.out.println("main string args - " +  ans);
    }


    /// return the result is greater number smaller than equal to target

    public static int floorSerach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target < end ){
            return -1;
        }
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
//             if(arr[mid] == target){
//                 return arr[mid];
//             }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                 start = mid + 1;

            } else {
                // ans found
                return arr[mid];
            }
        }
        return arr[end];
    }
}
