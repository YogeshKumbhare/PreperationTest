package leetcode;

public class ContinueusSubArraySum {

    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
    }

    private static void findSubArray(int[] input, int inputNUmber) {

        int sum = input[0];
        int start = 0;

        for(int i = 1; i < input.length;i++) {

            sum = sum + input[i];

            while (sum > inputNUmber && start <= i - 1) {
                sum = sum - input[start];
                start++;
            }

            if (sum == inputNUmber) {
  for(int j= start; j <= i; j++){
      System.out.print(   input[j] + " ");
  }
            }
        }
    }
}
