package com.lecture5;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericCalculator<Float, ?> cal = new GenericCalculator<>(3.5f,2l);

        cal.sum();
        cal.diff();

        List<Integer> myIntList = new LinkedList<>();
        myIntList.add(5);
        myIntList.add(2);
        System.out.println(myIntList);

        List<String> myStrList = new LinkedList<>();
        myStrList.add("abc");
        myStrList.add("def");
        System.out.println(myStrList);
    }
}
