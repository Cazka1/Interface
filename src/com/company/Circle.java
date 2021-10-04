package com.company;

public class Circle implements Figure{
    int r;
    String name;

    public Circle(String name, int r) {
        this.r = r;
        this.name = name;
    }

    @Override
    public String sayMyName() {
       return name;
    }

    @Override
    public int countArea() {
        return (int) ((r*r)*Math.PI);
    }
}
