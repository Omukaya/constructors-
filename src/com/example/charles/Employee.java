package com.example.charles;

public class Employee {
    private int id;
    private String name;

    public Employee() {
        this("John Doe", 999);
        System.out.println("Default Employee Created.");
    }

    public Employee(int i) {
        this("John Doe", i);
        System.out.println("Employee created by default name");
    }

    public Employee(String n, int i) {
        this.name = n;
        this.id = i;
        System.out.println("Employee Created");
    }

    @Override
    public String toString() {
        return "ID= " + id + ", NAME= " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
