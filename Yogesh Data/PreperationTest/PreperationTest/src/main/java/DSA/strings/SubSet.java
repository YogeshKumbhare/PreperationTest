package DSA.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> l= subset(arr);
        for (List<Integer> list : l){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] list) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : list) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }
}
