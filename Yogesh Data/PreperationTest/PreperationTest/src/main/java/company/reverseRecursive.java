package company;

public class reverseRecursive {

    String reverse = "";
    private String recursiveMethod(String st) {

        if(st.length() == 1){
          return st;
        }else {
            return reverse += st.charAt(st.length() - 1) + recursiveMethod(st.substring(0, st.length() - 1));
        }
    }
    public static void main(String[] args) {
        reverseRecursive reverseRecursive = new reverseRecursive();
        String str ="javahome";
        System.out.println(reverseRecursive.recursiveMethod(str));

    }


}
