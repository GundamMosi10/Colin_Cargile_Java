package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldAddTwoPositiveIntegers(){
        int actualResult = calc.add(1, 2);
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldAddTwoNegativeIntegers(){
        int actualResult = calc.add(-3, -8);
        int expectedResult = -11;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldAddPositiveIntegerToANegativeInteger(){
        int actualResult = calc.add(-4, 17);
        int expectedResult = 13;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSubtractTwoPositiveIntegers(){
        int actualResult = calc.subtract(23, 52);
        int expectedResult = -29;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultiplyTwoPositiveIntegers(){
        int actualResult = calc.multiply(34, 2);
        int expectedResult = 68;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideTwoIntegersWhichAreExactlyDivisible() {
        int actualResult = calc.divide(12,3);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideTwoIntegers() {
        int actualResult = calc.divide(12,7);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnZeroWhenDivideByDenominatorZero() {
        int actualResult = calc.divide(10,0);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnZeroWhenDivideByNumeratorZero() {
        int actualResult = calc.divide(0,87);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnSumOfTwoDoubles() {

        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 5.7, calc.add(3.4d, 2.3d), 0.01);
    }

    @Test
    public void shouldReturnTheDifferenceOfTwoDoubles() {
        String failMessage = "Expected calculator to handle double subtraction.";
        assertEquals(failMessage, 5.0, calc.subtract(5.5d, 0.5d), .5);
    }

    @Test
    public void shouldReturnProductOfTwoDoubles() {
        double actualResult = calc.multiply(6.7, 4.4);
        double expectedResult = 29.48;
        assertEquals(expectedResult, actualResult);

//        String failMessage = "Expected calculator to handle double multiplication.";
//        assertEquals(failMessage, 29.48, calc.multiply(6.7d, 4.4d), 0.0);
    }

    @Test
    public void shouldReturnQuotientOfTwoDoubles() {
        double actualResult = calc.divide(10.8, 2.2);
        double expectedResult = 4.91;
        assertEquals(expectedResult,actualResult,4.91);

    }
}