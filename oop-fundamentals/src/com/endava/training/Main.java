package com.endava.training;

import com.endava.training.shape.Shape2D;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP");

        Shape2D shape1 = new Circle(10, 15, 1);
        Shape2D shape2 = new Square(25, 25, 10);
        Shape2D shape3 = new Triangle(0, 0, 10, 0, 10, 10);

        System.out.println("shape1 is a " + shape1 + " and has a perimeter of " + shape1.computePerimeter() +
                " and an area of " + shape1.computeArea());

        System.out.println("shape1 is a " + shape2 + " and has a perimeter of " + shape2.computePerimeter() +
                " and an area of " + shape2.computeArea());

        System.out.println("shape1 is a " + shape3 + " and has a perimeter of " + shape3.computePerimeter() +
                " and an area of " + shape3.computeArea());
    }
}
