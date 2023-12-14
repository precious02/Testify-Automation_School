package com.Testify;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your current Age: ");
            int age = scanner.nextInt();
            System.out.println("Your actual age is: " + age);
            scanner.close();

        } catch (InputMismatchException inputException){
            System.out.println("Invalid age syntax");
            System.out.println(inputException);

        }

    }
}
