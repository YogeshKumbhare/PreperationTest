package one;

import java.util.TreeMap;


class A {

    void display(int a){
        System.out.println("int -- a");
    }
    void display(Object a){
        System.out.println("object -- a");
    }

    void display(String a){
        System.out.println("String -- a");
    }
}


public class GlobalLogic1 {




    public static void main(String[] args) {

//        Find Equilibrium index (pivotal element) in array,if not found return -1 value
//        pivotal element is where the left side sum of that array position  is equal to right side sum of  that array position
//
//        {1,1,8,1,1,9}
//        output index is: 3


//        the task is to find the maximum consecutive repeating character in a string.
//
//                Input : str = "geeekkek"
//        Output : e
//
//        Input : str = "aaaabbcbbb"
//        Output : a

//
//        String str = "aaaabbcbbb";
//
//        TreeMap<Character,Integer> countmap = new TreeMap<>();
//
//        char ch[]  = str.toCharArray();
//
//
//        for (Character c : ch) {
//            if(countmap.containsKey(c)){
//
//                countmap.put(c,countmap.get(c)+1);
//
//            }else{
//                countmap.put(c,1);
//            }
//
//        }
//
//        System.out.println(countmap);
//

        A a = new A();
        a.display(null);


    }

}
