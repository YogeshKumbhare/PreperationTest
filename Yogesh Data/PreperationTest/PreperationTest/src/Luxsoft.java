import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Luxsoft {
    public static void main(final String[] args) {

        final String message = "Welcome to this interview, !"
                + " What is the MOST frequent non-whitespace character in this String?"
                + " HINT: the return should be the character 'T' (expected result).";

        final CharacterCounter characterCounter = new MostFrequentCharacterCounter(message);

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5f);
        list.forEach(System.out::println);



        characterCounter.getCharacter().forEach((k,v) -> System.out.println(k + " = " + v) );
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^66");
        characterCounter.getCharacter().entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

//        Map<String, String> m0 = new LinkedHashMap<>();
//        m0.put("x", "123");
//        m0.put("y", "456");
//        m0.put("z", "789");
//
//        Map<String, String> m1 = new LinkedHashMap<>();
//        m1.put("x", "000");
//        m1.put("y", "111");
//        m1.put("z", "222");
//
//        List<Map> l = new ArrayList<>(Arrays.asList(m0, m1));
//        List<String> tx = new ArrayList<>();
//        String isin = null;
//        for(Map<String, String> m : l) {
//            Map<String, String> filtered = m.entrySet()
//                    .stream()
//                    .filter(map -> map.getKey().equals("x"))
//                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
//
//           tx.add(filtered.get("x"));
//        }
//       // System.out.println( isin);
//       // System.err.println("l: " + l);
//        System.err.println("tx: " + tx);


//        final List<Map> l = new ArrayList<>(Arrays.asList(m0));
//        Map<String, String> filtered = new LinkedHashMap<>();
//        for(Map<String, String> m : l) {
//            filtered = m.entrySet()
//                    .stream()
//                    .filter(map -> map.getKey().equals("x"))
//                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
//
//        }
//        System.err.println( filtered.get("x"));
        //System.err.println("tx: " + tx);

//        String[] arr = new String[]{"a", "b", "c"};
//        Stream<String> streamOfArrayFull = Arrays.stream(arr);
//        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
//        System.out.println(streamOfArrayPart.toString());
//
//        Random random = new Random();
//        DoubleStream doubleStream = random.doubles(3);
//        System.out.println(doubleStream.toString());


    }

}
