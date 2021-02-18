package com.lecture5;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Received numbers: "+this.x+" and "+this.y);
    }

    public void sum() {
        System.out.println(x+y);
    }

    public void diff() {
        System.out.println(x-y);
    }
}
