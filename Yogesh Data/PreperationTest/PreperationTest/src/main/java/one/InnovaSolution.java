package one;

public class InnovaSolution {

    public static void main(String[] args) {
        String str= "YOGESH";
        char ch[] = str.toCharArray();
        int i,j;
        for (i = 0; i < ch.length; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j = (ch.length-1 - i); j > 0; j--) {
                // printing spaces
                System.out.print("-");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print(ch[j]);
            }

            // ending line after each row
            System.out.println();
        }
    }
}
