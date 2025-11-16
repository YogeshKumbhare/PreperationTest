package one;

public class RSA {
    // Driver Code
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        int count = 1;
        int total = 1;
        for (int i = 2; i <= (a.length + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }


         String str1 =  "paper";
         str1 = "test";
        System.out.println(str1);
        System.out.println(total);
    }
}


