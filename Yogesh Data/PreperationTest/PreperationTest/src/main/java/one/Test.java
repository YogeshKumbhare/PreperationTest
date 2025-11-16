package com;


import java.util.HashSet;
import java.util.Set;

public class Test {

    protected HashSet myset = new HashSet();

    public Test() {
        myset.add(10);

    }

    public Set getSet() {
        return myset;

    }

}

class Child extends Test {

    public Child(Integer val) {
        myset.add(10);
    }


    public HashSet getSet() {
        return myset;

    }


public static void main(String[] args) {

    Test t = new Child(20);
    System.out.println(t.getSet());
}
}