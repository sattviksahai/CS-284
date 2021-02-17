package com.lecture4;

public class FireFighter extends Person{

    public FireFighter(int age, String name, int exp) {
        this.age = age;
        this.name = name;
        this.yearsOfExp = exp;

    }

    public void runDailySchedule() {
        System.out.println("fight fire");
        this.earnIncome();
    }

}
