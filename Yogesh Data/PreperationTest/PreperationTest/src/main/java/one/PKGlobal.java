package one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class PKGlobal {
    //private static int aStaticVariable = 1;
    private int aNonStaticVariable = 2;

    private static void aStaticMethod() {
        PKGlobal object = new PKGlobal();
        System.out.println(object.aNonStaticVariable);
       // object.aNonStaticMethod();
    }

//    private void aNonStaticMethod() {
//        System.out.println(aStaticVariable);
//    }
public static void main(String[] args) {

    HashMap<String, Integer> map = new HashMap<>() ;
    map.put("null" , 123);
    map.put(null , null);
    map.put(null , null);
    System.out.println(map.size());
    Iterator it = map.entrySet().iterator();
    while(it.hasNext()){
        System.out.println(it.next());

    }


  // Map.Entry<String, Integer> entry =  map.entrySet().stream().collect(Collectors.toMap( e -> e.getKey(), e -> e.getValue()));
//    Map<String, Integer> y =
//            map.entrySet().stream()
//                    .collect(Collectors.toMap(
//                            e -> e.getKey(),
//                            e -> Integer.parseInt(String.valueOf(e.getValue()))
//                    ));
    //System.out.println(y);
    }
}
