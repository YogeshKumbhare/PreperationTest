package linkedlist;

public class A {
    public static void main(String[] args) {
    String str = "Yogesh";
   String str2 = new String("Yogesh");
        StringBuffer sb = new StringBuffer(str);
        sb.append("K");
        System.out.println(sb);
        System.out.println(str.hashCode() + " " + str2.hashCode());
        System.out.println(str.intern() == str2.intern());


    }
}
