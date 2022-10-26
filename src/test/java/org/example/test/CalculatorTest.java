package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;


    //This method will be called before start running each test
    @BeforeEach
    public void setupEach(){
        calculator = new Calculator();
    }

    //This method will be called after the run of each test
    @AfterEach
    public void finalSetupEach(){
        System.out.println("This test is finished running!");
    }

    @Test
    public void shouldReturnSumWhenAddArrayIsCalled() {
        int[] array = {3, 45, 6, 7, 12, 4};

        int result = calculator.addArray(array);

        Assertions.assertEquals(77, result);
    }
   @Test
   public void shouldReturnMultiplyValueOfNumbers() {
       int[] arr = {3, 45, 6, 7};

       int result = calculator.multiplyArray(arr);

        Assertions.assertEquals(5670, result);
    }

    @Test
    public void shouldReturnDivideValueOfNumbers() {
        float[] arr = {64, 8, 13, 2.0f};

        float result = calculator.divideArray(arr);

        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void shouldReturnSubtractValueOfNumbers() {
        int[] arr = {64, 8, 13, 2};

        int result = calculator.subtractArray(arr);

        Assertions.assertAll(() -> Assertions.assertTrue(result > 0),
        () -> Assertions.assertEquals(41.0, result));

    }
}
