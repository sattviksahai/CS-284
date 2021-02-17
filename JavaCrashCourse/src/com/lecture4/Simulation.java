package com.lecture4;

public class Simulation {

    public static void main(String[] args) {
        FireFighter frank = new FireFighter(25, "Frank", 2);
        Teacher todd = new Teacher(35, "Todd", 10, "English");
        PersonInterface dan = new Doctor(30, "Dan", 6, "Brain Surgeon");

        // Introduction
        frank.introduce();
        todd.introduce();
        dan.introduce();

        // run 5 days
        for (int index = 0; index < 5; index++) {
            System.out.println("Day: "+index);
            frank.runDailySchedule();
            todd.runDailySchedule();
            dan.runDailySchedule();
        }
        // taxes
        frank.payTaxes();
        todd.payTaxes();
        dan.payTaxes();

    }

}
