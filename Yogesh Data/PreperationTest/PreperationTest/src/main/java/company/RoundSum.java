package company;

public class RoundSum {
    public static void main(String[] args) {

        try{
            System.out.println(doStuff(args));
        }catch(Exception e ){
            System.out.println("e");
            doStuff(args);
        }
    }

    private static int doStuff(String[] args) {
        return Integer.parseInt(args[0]);
    }
}