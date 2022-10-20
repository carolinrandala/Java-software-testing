package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumWhenAddArrayIsCalled() {
        int[] array = {3, 45, 6, 7, 12, 4};

        Calculator calculator = new Calculator();
        int result = calculator.addArray(array);

        Assertions.assertEquals(77, result);
    }
   @Test
   public void shouldReturnMultiplyValueOfNumbers() {
       int[] arr = {3, 45, 6, 7};

       Calculator calculator = new Calculator();
       int result = calculator.multiplyArray(arr);

        Assertions.assertEquals(5670, result);
    }

    @Test
    public void shouldReturnDivideValueOfNumbers() {
        float[] arr = {64, 8, 13, 2};

        Calculator calculator = new Calculator();
        float result = calculator.divideArray(arr);

        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void shouldReturnSubtractValueOfNumbers() {
        int[] arr = {64, 8, 13, 2};

        Calculator calculator = new Calculator();
        int result = calculator.subtractArray(arr);

        Assertions.assertEquals(41.0, result);
    }
}