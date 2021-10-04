package com.company;

public class Square implements Figure {
    String name;
    int a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String sayMyName() {
        return name;
    }

    @Override
    public int countArea() {
        return a * a;
    }

}
