package com.company;

import java.util.Scanner;

public class Calculator {

    static  Number calculate (double firstNumber, double secondNumber ,char operator){
        switch (operator){
            case '+':
                return firstNumber+secondNumber;

            case '-':
                return firstNumber-secondNumber;

            case '*':
                return firstNumber*secondNumber;

            case '/':
                return firstNumber/secondNumber;

            // operator doesn't match any case constant (+, -, *, /)
            default:
               return null;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter first Number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        try {
            double result = (double) calculate(firstNumber,secondNumber,operator);
            System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);

        }catch (Exception e){
            System.out.print("Error! operator is not correct");
        }

    }
}
