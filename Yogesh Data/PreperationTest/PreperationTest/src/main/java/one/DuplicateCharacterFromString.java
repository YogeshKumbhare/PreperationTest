package one;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharacterFromString {

        public static void main(String[] args) {

            String str = "eyManHowAreYohu";
            char chr[] = str.toUpperCase(Locale.ROOT).toCharArray();

            // 3, 4, 9
            List<Character> list = str.chars().mapToObj(e -> (char)e).collect(Collectors.toList());

            Set<Character> result = findDuplicateBySetAdd(list);

            result.forEach(System.out::println);

        }

        public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

            Set<T> items = new HashSet<>();
            return list.stream()
                    .filter(n -> !items.add(n))// Set.add() returns false if the element was already in the set.
                    .collect(Collectors.toSet());

        }


}
