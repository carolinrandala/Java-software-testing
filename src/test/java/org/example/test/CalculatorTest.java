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
}