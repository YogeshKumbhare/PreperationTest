package leetcode;

public class diplicateChar {
    public static void main(String[] args) {

        System.out.println( solution("codility"));

    }

    public static String solution(String S) {
        // write your code in Java SE 8

        int count;

        //Converts given string into character array
        char string[] = S.toCharArray();

        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                return String.valueOf(string[i]);
        }
        return null;
    }
}
