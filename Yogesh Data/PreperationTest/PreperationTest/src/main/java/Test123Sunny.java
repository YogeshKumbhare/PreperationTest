import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test123Sunny {
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<String>();
        str1.add("A");
        str1.add("B");
        str1.add("C");
        str1.add("D");
//
//        List<String> str2 = new ArrayList<String>();
//        str2.add("D");
//        str2.add("E");

        List<String> str3 = str1.stream()
                .filter(item -> !str1.equals("L9"))
                .collect(Collectors.toList());

    }
}
