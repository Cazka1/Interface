package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square("square", 4);
        Circle circle = new Circle("circle",5);
        Rectangle rectangle = new Rectangle("rectangle",3,4);
        System.out.println("square name is " + square.sayMyName());
        System.out.println("Square area = " + square.countArea());
        System.out.println("Circle name is " + circle.sayMyName());
        System.out.println("Circle area = " + circle.countArea());
        System.out.println("Rectangle name is " + rectangle.sayMyName());
        System.out.println("Rectangle area = " + rectangle.countArea());
    }
}
