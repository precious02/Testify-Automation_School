package com.Testify.Task14;

public class Shape {
    public static void main(String[] args) {
        Shape restrictValue = new Shape();
        restrictValue.getShapeSides();
        int newValue = restrictValue.getShapeSides();
        System.out.println(newValue);
    }
    private int shapeSides = 4;
    private int shapeLength;
    private int shapeBreadth;

    public int getShapeSides() {
        return shapeSides;
    }


    public int getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(int shapeLength) {
        this.shapeLength = shapeLength;
    }

    public int getShapeBreadth() {
        return shapeBreadth;
    }

    public void setShapeBreadth(int shapeBreadth) {
        this.shapeBreadth = shapeBreadth;
    }


}
