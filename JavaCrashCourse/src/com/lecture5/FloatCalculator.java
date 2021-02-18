package com.lecture5;

public class FloatCalculator {
    private float x;
    private float y;

    public FloatCalculator(float x, float y) {
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
