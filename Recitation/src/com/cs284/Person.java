package com.cs284;

public class Person {
    private String name;
    private int age;
    public static int numOfPeople=0;

    public Person(String initialName){
        this.name = initialName;
        this.age = 25;
        numOfPeople++;
    }

    public void printPerson() {
        System.out.println("Person's name is: " + this.name + " and age is: "+ this.age);
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(Person.numOfPeople);

        Person person1 = new Person("Sattvik");
        person1.printPerson();
        String person1Name = person1.getName();
        System.out.println(person1Name);

        // static illustration
        System.out.println(Person.numOfPeople);
    }
}
