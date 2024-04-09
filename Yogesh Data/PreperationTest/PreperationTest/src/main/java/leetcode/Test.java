package leetcode;

public class Test {
    public static void main(String[] args) {
       String x = "a";
        String finalX = x;
        Runnable r = () -> System.out.println(finalX);
        x ="b";
        r.run();

        "new".equals(x);
        x.equals("new");
        //"new" == x

    }
}
