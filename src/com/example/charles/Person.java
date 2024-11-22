package com.example.charles;

public class Person {
    private int age;

    public Person() {
        System.out.println("Person was created");
    }

    public Person(int i) {
        this.age = i;
        System.out.println("Person was created with Age = " + i);
    }
}
