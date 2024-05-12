package com.mycompany.calculator;

import java.util.Scanner;
import org.junit.Test;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
        }

        scanner.close();
    }

    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    @Test
    public void testAdd() {
        double result = Calculator.add(5.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testSubtract() {
        double result = Calculator.subtract(10.0, 4.0);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testMultiply() {
        double result = Calculator.multiply(3.0, 5.0);
        assertEquals(15.0, result, 0.0001);
    }

    @Test
    public void testDivide() {
        double result = Calculator.divide(20.0, 4.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10.0, 0.0);
    }
}
