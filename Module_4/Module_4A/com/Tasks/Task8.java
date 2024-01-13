package com.Testify;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Principal value");
        float Principal = userInput.nextFloat();
        System.out.println("Enter Rate of Interest value");
        float Rate = userInput.nextFloat();
        System.out.println("Enter Time value");
        float Time = userInput.nextFloat();
        float SimpleInterest = (Principal * Rate * Time)/100;
        System.out.println("The value of Simple Interest is " + SimpleInterest);
    }
}
