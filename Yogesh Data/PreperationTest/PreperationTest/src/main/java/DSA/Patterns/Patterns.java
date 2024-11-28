package DSA.Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern17(5);

    }

    static void  pattern01(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //reverse hill pattern
    static void  pattern02(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <n; k++) {
                System.out.print("* ");
            }
            for (int m = i; m <=n ; m++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

    static void  pattern03(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern30(int n){
        for (int row = 1; row <= n ; row++){

            for (int spaces = 0; spaces <= n -row ; spaces++){
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row ; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void  pattern04(int n){

        for (int i = n; i >0 ; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void  pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void  pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void  pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void  pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void  pattern5(int n){
        for (int row = 1; row < 2 * n ; row++) {
            int totalColnum = row > n ? 2 * n - row : row;
            for (int col = 1; col < totalColnum; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void  pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColnum = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColnum;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col < totalColnum; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void  pattern17(int n){
        for (int row = 1; row < 2 * n ; row++) {
            int totalColnum = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColnum;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }

            for (int col = totalColnum; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalColnum ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    static void  pattern16(int n){
        for (int row = 1; row <  n ; row++) {
            int totalColnum = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColnum;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }

            for (int col = totalColnum; col >= 1 ; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalColnum ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
