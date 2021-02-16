package com.cs284;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    private String numberString;
    private int[] numbers = new int[10];
    private int totalLength;

    public FizzBuzz(String numberStr) {
        this.numberString = numberStr;
        String[] tempNumbers = this.numberString.split(" ");

        int index = 0;
        for (String num: tempNumbers) {
            this.numbers[index] = Integer.parseInt(num);
            index++;
        }
        this.totalLength = index;

        System.out.println(Arrays.toString(this.numbers));
    }

    private void fbLogic(int number) {
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("Fizzbuzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }

    public void run() {
        for (int i =0; i<this.totalLength; i++) {
            this.fbLogic(this.numbers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upto 10 number: ");
        String number = scanner.nextLine();

        FizzBuzz game = new FizzBuzz(number);
        game.run();
        System.out.println(game.totalLength);

    }
}
