package one;

import java.util.Arrays;

public class IBM1 {
    public static void main(String[] args) {

        // Program to reverse each word in String and convert it to lower case

        //  Hello World - olleh dlrow

        String str = "Hello";

        String reverse = "";


        String[] arr = str.split(" ");

        for (String words : arr) {
            StringBuffer sb = new StringBuffer(words);
            sb.reverse();

            reverse += sb.toString().toLowerCase();
        }
        System.out.print(" ");
        System.out.println("" + reverse);
    }

}
