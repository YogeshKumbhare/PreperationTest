package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args)
    {
        List<String> list1 = new LinkedList();
        list1.add("Geeks");
        list1.add("For");
        list1.add("Geeks");
        list1.add("GFG");
        list1.add("GeeksforGeeks");
        Iterator<String> iter = list1.iterator();
        List<String> list2 = new LinkedList();
        list2.add("Geeks");

        list1.removeAll(list2);

        for (String temp : list1)
            System.out.printf(temp + " ");

        System.out.println();
    }
}
