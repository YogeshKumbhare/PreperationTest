package one;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Test8 {
    public static void main(String[] args) {

        int [] arr = {78, 45, 12, 67, 0, 17, 19};

        // 45 , 12 , 0 , 17 , 19
        int n = arr.length;

        int first = Integer.MIN_VALUE;

        int second = Integer.MAX_VALUE;

        for(int i=0 ; i< n ;i++){

            if(arr[i] > first){

                second = first;
                first = arr[i];

            }else if(arr[i] > second){
                second = arr[i];

            }

           // System.out.println("scond " + second);

        }

        for(int i =0; i< n;i++)
         if(arr[i]< second)
       System.out.println(arr[i]);

        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int i = 0;i<10;i++) {
            System.out.println("value " + atomicInteger.incrementAndGet());
        }
//
//        Set S =  new HashSet();
//        S.add(new Test(10));
//        S.add(new Test(20));
//        S.add(new Test(30));
//        S.add(new Test(20));
//
//       Iterator it =  S.iterator();
//       while (it.hasNext()){
//
//           System.out.println(it.next());
//       }

       // System.out.println(S);

        //  10 20 30
    }
}
