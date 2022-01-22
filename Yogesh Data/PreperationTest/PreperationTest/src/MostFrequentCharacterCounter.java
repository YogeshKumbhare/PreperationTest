import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class MostFrequentCharacterCounter extends CharacterCounter {



    String message;

    public MostFrequentCharacterCounter(String message){
       this.message= message;
    }

    public HashMap<String, Long> getCharacter(){

        HashMap<String,Long> countMap = new HashMap<>();

//       char[] ch =  message.toCharArray();
//
//       for (Character c : ch){
//
//           if(countMap.containsKey(c)){
//
//               countMap.put(c, countMap.get(c)+1);
//           }else{
//               countMap.put(c, 1);
//
//           }
//
//       }
//
//        Map<Character, Integer> frequencies = message.chars().boxed()
//                .collect(toMap(
//                        // key = char
//                        k -> Character.valueOf((char) k.intValue()),
//                        v -> 1,         // 1 occurence
//                        Integer::sum)); // counting
//
//        HashSet set = new HashSet();
//
        countMap = (HashMap<String, Long>) Arrays.stream(message.split(" "))
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        return countMap;
    }


}
