package DSA.strings;

public class Steam {
    public static void main(String[] args) {
        System.out.println(skipApple("badapplefg"));
    }

        //skip char a
    public static String skip(String unskipString) {
        if (unskipString.isEmpty()) {
            return "";
        }
        char ch = unskipString.charAt(0);
        if (ch == 'a') {
            return skip(unskipString.substring(1)); /// skip the element is match
        } else {
            return ch + skip(unskipString.substring(1)); /// add element if the element is not match
        }
    }


    //skipp apple string
    public static String skipApple(String unskipString) {
        if (unskipString.isBlank()) {
            return "";
        }
        String ans = "";
        if (unskipString.startsWith("apple")) {
            return skipApple(unskipString.substring(5)); /// skip the element is match
        } else {
            return unskipString.charAt(0)+skipApple(unskipString.substring(1)); /// add element if the element is not match
        }
    }
}
