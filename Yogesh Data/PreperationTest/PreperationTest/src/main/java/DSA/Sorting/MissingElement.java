package DSA.Sorting;

public class MissingElement {
    public static void main(String[] args) {
        int arr[] = {3,0,2,1,4};
        System.out.println(MissingElement(arr));
    }
    private static int MissingElement(int arr[]) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
// find first missing element
        for (int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }
    private static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
