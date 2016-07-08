package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Circle implements Shape2D {

    private float x_coord;
    private float y_coord;
    private float radius;

    public Circle(float x_coord, float y_coord, float radius) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.radius = radius;
    }

    @Override
    public float computeArea() {
        return (float) ((radius * radius) * java.lang.Math.PI);
    }

    @Override
    public float computePerimeter() {
        return (float) (2 * java.lang.Math.PI * radius);
    }

    public String toString(){
       return "Circle of radius " + this.radius + " and center in ( " + this.x_coord + ", " + this.y_coord + ")";
    }
}
