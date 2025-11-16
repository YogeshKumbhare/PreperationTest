package one;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

interface  inter1{

    default void display(){
        System.out.println("inter1");

    }
}

interface inter2{
    default void display(){
        System.out.println("inter2");

    }
}

//
// class A1  {
//
//    static void display(int a) {
//        System.out.println("a1 ");
//    }
//
//}
//
//class B extends A1 {
//
//
//     static void display(int a) {
//        System.out.println("b ");
//    }
//
//}
class MyClass implements inter1,inter2{

    public void display1(){
        System.out.println("not public ");
    }


    @Override
    public void display() {
        inter1.super.display();
    }
}

public class Netcracker2{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();

        List<Integer> longs = Arrays.asList(1,2,3,4,5).stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(longs);
    }

}


