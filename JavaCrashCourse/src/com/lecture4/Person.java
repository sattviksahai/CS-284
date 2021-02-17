package com.lecture4;

public class Person {
    public int age;
    public String name;
    public int yearsOfExp;
    public double income;

    public void introduce() {
        System.out.println("Name: "+ this.name+" age: "+this.age+" Exp: "+this.yearsOfExp);
    }

    public void earnIncome() {
        double  tempIncome = Math.random() * 100;
        System.out.println("daily income: "+tempIncome);
        this.income += tempIncome;
    }

    public void payTaxes() {
        double taxes = 0.1*this.income;
        this.income -= taxes; // income = income - taxes
    }
}
