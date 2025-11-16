package one;

public class Rekunte {
    public static void main(String[] args) {


        //Input
        //This Is An Interview Question.
        // Output:

        //Noitseuq Weivretni Na Si Siht.

     String str = "Yogesh";
     String str1 = "Test";
        String str2 = new String("Yogesh");
        String st = str2.concat(str);
     String reverse ="";

//
//     for (int i = str.length()-1; i>=0;i--){
//         reverse += str.charAt(i);
//
//     }
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(st == str2);

    }
}
