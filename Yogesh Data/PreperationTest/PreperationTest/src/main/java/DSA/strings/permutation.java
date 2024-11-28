package DSA.strings;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
   //permutation("","abc");
        permutationList("","abc").stream().sorted().forEach(e -> System.out.println(e));
    }



    static void permutation(String process, String inProcess){

        if(inProcess.isEmpty())
        {
            System.out.println(process);
            return;
        }
        char ch = inProcess.charAt(0);
         for (int i=0;i <= process.length(); i++){
             String f = process.substring(0,i);
             String s = process.substring(i, process.length());
             permutation(f + ch + s, inProcess.substring(1));
         }

    }


    static ArrayList<String> permutationList(String process, String inProcess) {
        if (inProcess.isEmpty()) {
            ArrayList l = new ArrayList();
            l.add(process);
            return l;
        }
        char ch = inProcess.charAt(0);
        ArrayList ans = new ArrayList();
        for (int i = 0; i <= process.length(); i++) {
            String f = process.substring(0, i);
            String s = process.substring(i, process.length());
            ans.addAll(permutationList(f + ch + s, inProcess.substring(1)));
        }
            return ans;
    }
}
