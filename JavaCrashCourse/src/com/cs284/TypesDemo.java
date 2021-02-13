package com.cs284;

import java.awt.*;

public class TypesDemo {
    public static void main(String[] args) {
        // score data structures
        byte score = 80;

        // percentage obtained
        float percentage = 85.5F;
        // pass/fail
        boolean result = true;

        // Text
        char letterGrade = 'A';
        String name = new String("Data Structures");

        // primitive types
        int x = 10;
        int y = x;
        x = 5;

        // reference type
        Point point1 = new Point(1,1);
        Point point2  = point1;
        point1.x = 2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(score);
        System.out.println(percentage);
        System.out.println(result);
        System.out.println(letterGrade);
        System.out.println(name);
    }
}
