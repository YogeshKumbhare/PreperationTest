package DSA.Searching;

public class findPivoteBinarySerach {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int a = search(arr,target);
        System.out.println(a);
    }

     static  int search(int arr[], int target){
        int pivote = findPivote(arr);
        if(pivote != -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        //if pivot is found , then you have found two asc arrays
           // pivote element is mid element consider
         if(arr[pivote] == target ){
             return pivote;
         }

         if(target >= arr[0]){
             return binarySearch(arr,target,0,pivote-1);
         }
         return binarySearch(arr,target,pivote+1,arr.length-1);

    }

    private static int binarySearch(int arr[], int target , int start, int end ){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
return -1;
    }


    private static int findPivote(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1 ;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
