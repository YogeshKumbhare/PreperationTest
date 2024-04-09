package DSA.Searching;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {23, 4, 1},
                {18, 12, 3, 9}
        };
        int a = maximumWealth( accounts);
        System.out.println(a);
    }

    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
