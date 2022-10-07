package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 1;
        int b = 1;

        int addSum = a + b;
        System.out.println("The sum of 1 + 1 = " + addSum);

        int a1 = 23;
        int b1 = 52;

        int subtractInts = a1 - b1;
        System.out.println("23 - 52 = " + subtractInts);

        int a2 = 34;
        int b2 = 2;

        int multiplyInts = a2 * b2;
        System.out.println("34 * 2 = " + multiplyInts);

        int a3 = 12;
        int b3 = 3;

        int divideInts = a3 / b3;
        System.out.println("12 / 3 = " + divideInts);

        int a4 = 12;
        int b4 = 7;

        int divide2Ints = a4 / b4;
        System.out.println("12 / 7 = " + divide2Ints);

        BigDecimal decimalOne = new BigDecimal("3.4");
        BigDecimal decimalTwo = new BigDecimal("2.3");

        BigDecimal sum = decimalOne.add(decimalTwo);

        System.out.println("The sum is: " + sum.toString());

        BigDecimal decimalThree = new BigDecimal("5.5");
        BigDecimal decimalFour = new BigDecimal("0.5");

        BigDecimal subtraction = decimalThree.subtract(decimalFour);

        System.out.println("The difference is: " + subtraction.toString());

        BigDecimal decimalFive = new BigDecimal("6.7");
        BigDecimal decimalSix = new BigDecimal("4.4");

        BigDecimal product = decimalFive.multiply(decimalSix);

        System.out.println("The product is: " + product.toString());

        BigDecimal b7 = new BigDecimal("10.8");
        BigDecimal b8 = new BigDecimal("2.2");

        BigDecimal result = b7.divide(b8, 2, RoundingMode.HALF_UP);
        System.out.println("10.8/2.2 = " + result.toString());


    }

}
