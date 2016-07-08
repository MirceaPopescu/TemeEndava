package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Square implements Shape2D {
    /* Center coordinates */
    private float x_coord;
    private float y_coord;
    private float sideLength;

    public Square(float x_coord, float y_coord, float sideLength) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.sideLength = sideLength;
    }

    @Override
    public float computeArea() {
        return sideLength * sideLength;
    }

    @Override
    public float computePerimeter() {
        return 4 * sideLength;
    }

    public String toString(){
        return "Square of side " + this.sideLength + " and center in ( " + this.x_coord + " , " + this.y_coord + " )";
    }
}
