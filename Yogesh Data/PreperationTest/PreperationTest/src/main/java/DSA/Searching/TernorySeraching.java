package DSA.Searching;

public class TernorySeraching {
    public static void main(String[] args) {
        int[] arr = {9, 7, 1, 2, 3, 6, 10};
        int ans = ternorySearch(arr);
        System.out.println("main string args - " +  ans);
    }

    private static int ternorySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int minindex= -1;
         while(low <= high){

             int mid1 = low + (high - low)/3;
             int mid2 = high - (high - low)/3;

             if(arr[mid1] == arr[mid2]){
                 low = mid1 + 1;
                 high = mid2 - 1;
                  minindex = mid1;
             } else if (arr[mid1] < arr[mid2]) {
                 high = mid2 - 1;
                 minindex = mid1;
             } else {
                 low = mid1 + 1;
                 minindex = mid2;
             }
         }
         return minindex;

    }
}
