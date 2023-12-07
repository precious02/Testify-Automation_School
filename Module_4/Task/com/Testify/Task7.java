package com.Testify;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        String [] [] fruitsArray = new String [4] [3];

        fruitsArray [0] [0] = "Pear";
        fruitsArray [1] [0] = "Guava";
        fruitsArray [2] [0] = "Strawberry";
        fruitsArray [3] [0] = "Pomegranate";
        System.out.println(Arrays.deepToString(fruitsArray));

    }
}
