package com.cs284;

public class ArithOper {

    public static void main(String[] args) {
        int x = 5;
        int y = 15;

        // Arithmatic operations
        System.out.println("Addition: "+ (x+y));
        System.out.println("Subtraction: "+ (x-y));
        System.out.println("Division: "+ (x/y));
        System.out.println("Multiplication: "+ (x*y));


        // if else
        if (x < y) {
            System.out.println("x is less than y");
        } else if (y < x) {
            System.out.println("y is less than x");
        } else {
            System.out.println("both are equal");
        }

        // switch case
        switch(x) {
            case 5:
                System.out.println("value of x is 5");
                break;
            case 7:
                System.out.println("value of x is 7");
                break;
        }

        // for loop
        for (int index = 0; index < 6; index++) {
            System.out.println(index);
        }

        // while
        int index2 = 0;
        while (index2 < 0) {
            System.out.println(index2);
            index2++;
        }

        // do while
        int index3 = 0;
        do {
            System.out.println(index3);
            index3++;
        } while (index3 < 0);
    }
}
