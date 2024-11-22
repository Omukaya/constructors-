package com.example.charles;

public class Data {
    private String name;
    private int id;

    // non-args constructor
    public Data() {
        this.name = "Default name";
    }

    // one parameter constructor
    public Data(String n) {
        this.name = n;
    }

    // two parameter constructor
    public Data(String n, int i) {
        this.name = n;
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID= " + id + ", NAME= " + name;
    }


}
