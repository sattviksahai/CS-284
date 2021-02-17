package com.lecture4;

public class Teacher extends Person{
    private String subject;

    public Teacher(int age, String name, int exp, String subject) {
        this.age = age;
        this.name = name;
        this.yearsOfExp = exp;
        this.subject = subject;

    }

    public void runDailySchedule() {
        System.out.println("teach");
        this.earnIncome();
    }
}
