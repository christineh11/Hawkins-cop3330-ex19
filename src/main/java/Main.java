/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your height in inches? ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid");
            input.next();
        } else {
            double height = input.nextDouble();
            System.out.println("What is your weight in pounds? ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid");
                input.next();
            } else {
                double weight = input.nextDouble();
                double bmi = (weight / (height * height)) * 703;
                System.out.println("Your BMI is: " + String.format("%.2f", bmi));
                if (bmi >= 18.5 && bmi <= 25) {
                    System.out.println("You are within the ideal weight range");
                } else if (bmi > 25) {
                    System.out.println("You are Overweight, You should see your doctor");
                } else if (bmi < 18.5) {
                    System.out.println("You are underweight, You should consult with your doctor");
                }
            }
        }
    }
}

