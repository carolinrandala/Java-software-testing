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

        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturnDivideValueOfNumbers() {
        //Given
        final int a = 64;
        final int b = 8;

        //When
        final int addResult = a / b;

        //Then
        Assertions.assertEquals(8, addResult);
    }

    @Test
    public void shouldReturnSubtractValueOfNumbers() {
        //Given
        final int a = 100;
        final int b = 100;

        //When
        final int addResult = a - b;

        //Then
        Assertions.assertEquals(0, addResult);
    }
}