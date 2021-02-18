package com.lecture5;

/*
Number
    Integer
    Float
    Double
 */

public class GenericCalculator<T extends Number, V extends  Number> {
    private T x;
    private V y;

    public GenericCalculator(T x, V y) {
        this.x = x;
        this.y = y;
        System.out.println("Received numbers: "+this.x+" and "+this.y);
    }

    public void sum() {
        System.out.println(x.doubleValue()+y.doubleValue());
    }

    public void diff() {
        System.out.println(x.doubleValue()-y.doubleValue());
    }
}
