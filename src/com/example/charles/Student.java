package com.example.charles;

public class Student extends Person {
    private String name;

    public Student() {
        System.out.println("Student was created.");
    }

    public Student(int i, String n) {
        super(i);
        this.name = n;
        System.out.println("Student was created with Name = " + n);
    }
}
