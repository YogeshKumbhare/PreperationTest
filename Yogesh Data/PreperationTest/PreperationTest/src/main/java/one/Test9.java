package one;

public class Test9 {
    public static void main(String[] args) {


        boolean x = checkPower(8);

        System.out.println(x);
    }

    private static boolean checkPower(int x) {

        if(x == 0)
            return false;

        while(x != 1){

            if(x % 2 != 0)
                return  false;
             x = x/2;

        }
        return true;

    }
}
