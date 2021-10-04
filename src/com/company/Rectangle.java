package com.company;

public class Rectangle implements Figure{
    String name;
    int a;
    int b;

    public Rectangle(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    @Override
    public String sayMyName() {
        return name;
    }

    @Override
    public int countArea() {
        return a*b;
    }
}
