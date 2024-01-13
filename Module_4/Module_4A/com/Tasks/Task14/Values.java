package com.Testify.Task14;

public class Values {
    public static void main(String[] args) {
        Shape field = new Shape();
        //set value of length
        field.setShapeLength(3);
        int length = field.getShapeLength();

        //set value of breadth
        field.setShapeBreadth(3);
        int breadth = field.getShapeBreadth();

        //formula for area
        int area = length * breadth;


        //System.out.println(area);
        System.out.println("The area of a square of length: " + length +
                " and breadth: " + breadth +
                " is " + area);
    }
}
