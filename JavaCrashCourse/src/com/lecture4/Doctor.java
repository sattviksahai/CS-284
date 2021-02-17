package com.lecture4;

public class Doctor implements PersonInterface{
    public int age;
    public String name;
    public int yearsOfExp;
    public double income;
    private String specialization;

    public Doctor(int age, String name, int exp, String specialization) {
        this.age = age;
        this.name = name;
        this.yearsOfExp = exp;
        this.specialization = specialization;

    }

    public void introduce() {
        System.out.println("Name: "+ this.name+" age: "+this.age+" Exp: "+this.yearsOfExp+" specialization: "+this.specialization);
    }

    public void introduce(String greeting) {
        System.out.println(greeting);
    }
    public void runDailySchedule() {
        System.out.println("Go to the hospital");
        this.earnIncome();
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
