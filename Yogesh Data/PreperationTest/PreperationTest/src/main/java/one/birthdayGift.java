package one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class birthdayGift {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();

        hackerCards( collection, 3);
    }

    private static List<Integer> hackerCards(List<Integer> collection, int d) {
        List<Integer> result = new ArrayList<>();
        int s, e;
        for(int idx = 0; idx <= collection.size(); idx++) {
            if (idx == 0)
                s = 1;
            else
                s = collection.get(idx - 1) + 1;
            if (idx != collection. size())
                e = collection.get(idx);
            else e = Integer.MAX_VALUE;
            if (d < s) break;
            for (int k = s; k < e; k++) {
                if (k <= d) {
                    result.add(k);
                    d -= k;
                } else {
                    break;
                }
            }
        }

        return result.stream().collect(Collectors.toList());
    }

}