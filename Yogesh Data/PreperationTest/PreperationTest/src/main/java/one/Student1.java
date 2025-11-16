package one;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student1 {

//    public int getMarks(String name) {
//
//        return 0;
//     }
//
//
//    public String getMarks(String name) {
//        return "test";
//    }
//
//
//    public static void main(String[] args) {
//
//        Student1 s1 = new Student1();
//        int i = s1.getMarks("Test");
//        System.out.println(i);
//
//
//
//    }

    public static void main(String[] args) {
        int data[] = { 1, 52, 7, 4, 6,5, 2, 0, 1, 3, 2, 2 };
//        Map<Integer, Long> count = Arrays.stream(data)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        int max = count.entrySet().stream()
//                .max((first, second) -> {
//                    return (int) (first.getValue() - second.getValue());
//                })
//                .get().getKey();
//
//        System.out.println(max);


        for(int i = 0; i < data.length; i++) {
            if(data[i] / 10 > 0) {
                System.out.println("digit: " + data[i] / 10);
            }
        }
        String a = getPopularElement(data);
        System.out.println(a);

    }
    public static String getPopularElement(int[] a1)
    {

        String[] a = new String[a1.length];

        for (int i = 0; i < a1.length; i++) {
            a[i] = String.valueOf(a1[i]);
        }

        int count = 1, tempCount;
        String popular = a[0];
        String temp = null;
        for (int i = 0; i < (a.length - 1); i++)
        {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < a.length; j++)
            {

                if (a[j].contains(temp) )
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }
}
