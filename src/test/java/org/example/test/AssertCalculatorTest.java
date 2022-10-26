package org.example.test;


import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;


/**
 * Write some AssertJ tests for Calculator methods in a separate file 'AssertCalculatorTest'
 */
public class AssertCalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testMultipliedArray() {
        int[] arr = {3, 45, 6, 7};
        int result = calculator.multiplyArray(arr);

        Assertions.assertThat(arr).isNotNull()
                .startsWith(3)
                .doesNotHaveDuplicates()
                .isNotNull();
    }


    @Test
    public void testSubtractArray() {
        int[] arr = {64, 8, 13, 2};
        int result = calculator.subtractArray(arr);

        Assertions.assertThat(arr).hasSize(4)
                .startsWith(64)
                .doesNotHaveDuplicates()
                .isNotNull();
    }

    @Test
    public void testAddArray() {
        int[] arr = {3, 45, 6, 7, 12, 4};
        int result = calculator.addArray(arr);

        Assertions.assertThat(arr).hasSize(6)
                .startsWith(3)
                .doesNotHaveDuplicates()
                .isNotNull();
    }

    @Test
    public void testDivideArray() {
        float[] arr = {64, 8, 13, 2.0f};
        float result = result = calculator.divideArray(arr);
        Assertions.assertThat(arr).hasSize(4)
                .startsWith(64)
                .containsExactlyInAnyOrder(64, 8, 13, 2.0F)
                .doesNotHaveDuplicates()
                .isNotNull();
    }
}
