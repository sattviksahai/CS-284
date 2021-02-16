package com.cs284;

public class CastingAndArrays {
    public static void main(String[] args) {
        /*
         * Arrays
         */

        // declaring an array of 10 bytes
        byte[] arrayOfBytes = new byte[10];
        // writing to array
        arrayOfBytes[0] = 3;
        arrayOfBytes[2] = 7;
        // reading from array and printing
        System.out.println("Value in the 3rd position of array is "+arrayOfBytes[2]);

        // we can also declare and initialize arrays simultaneously
        int[] numbers = {9,8,6,5};

        // for loop
        System.out.println("For loop");
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for-each loop
        System.out.println("For-each loop");
        for (int num: numbers) {
            System.out.println(num);
        }

        /*
         * Type casting
         */

        // widening (implicit casting)
        byte x = 10;
        int y = x;
        System.out.println("Value of byte: "+x);
        System.out.println("Value of int: "+y);

        // Narrowing (explicit casting)
        int j = 10;
        byte k = (byte)j; // j should be less than 128 for this to work
        System.out.println("Value of int: "+j);
        System.out.println("Value of byte: "+k);

        // Casting incompatible types
        String numberString = "200";
        Integer numberInt = Integer.parseInt(numberString);
        numberInt++; // this works because the number is now an integer (not a string)
        System.out.println("Value of String: "+numberString);
        System.out.println("Value of Integer: "+numberInt);
    }
}
