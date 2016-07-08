package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mipopescu on 7/8/2016.
 */
public class Triangle implements Shape2D {

    private float aX_coord, aY_coord;
    private float bX_coord, bY_coord;
    private float cX_coord, cY_coord;
    private float aSide, bSide, cSide;

    public Triangle(float aX_coord, float aY_coord, float bX_coord, float bY_coord, float cX_coord, float cY_coord) {
        this.aX_coord = aX_coord;
        this.aY_coord = aY_coord;
        this.bX_coord = bX_coord;
        this.bY_coord = bY_coord;
        this.cX_coord = cX_coord;
        this.cY_coord = cY_coord;

        this.aSide = (float) Math.sqrt(Math.pow((bX_coord - cX_coord), 2) + Math.pow((bY_coord - cY_coord), 2));
        this.bSide = (float) Math.sqrt(Math.pow((aX_coord - cX_coord), 2) + Math.pow((aY_coord - cY_coord), 2));
        this.cSide = (float) Math.sqrt(Math.pow((aX_coord - bX_coord), 2) + Math.pow((aY_coord - bY_coord), 2));
    }

    @Override
    public float computeArea() {
        float halfPerimeter = computePerimeter() / 2;
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }

    @Override
    public float computePerimeter() {
        return aSide + bSide + cSide;
    }

    public String toString(){
        return "Triangle with AB = " + this.cSide + ", BC = " + this.aSide + ", CA = " + this.bSide;
    }
}
