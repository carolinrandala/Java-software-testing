package org.example.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write some AssertJ tests for Calculator methods in a separate file 'AssertCalculatorTest'
 */
public class AssertCalculatorTest {

    @Test
    public void testMultiplyArray(){
        List<Integer> numList = List.of(3, 45, 6, 7);

        Assertions.assertThat(numList).hasSize(4)
                .startsWith(3);
    }

    @Test
    public void testSubtractArray() {
        List<Integer> numList = List.of(64, 8, 13, 2);

        Assertions.assertThat(numList).hasSize(4)
                .startsWith(64)
                .doesNotHaveDuplicates()
                .isNotNull();
    }

    @Test
    public void testAddArray() {
        List<Integer> numList = List.of(3, 45, 6, 7, 12, 4);

        Assertions.assertThat(numList).hasSize(6)
                .startsWith(3)
                .doesNotHaveDuplicates()
                .isNotNull();
    }

    @Test
    public void testDivideArray() {
        List<Float> floatList = List.of(2.3F, 2.7F, 6.8F, 2.45F, 5.98F, 90.34F, 100.23F);

        Assertions.assertThat(floatList).hasSize(7)
                .startsWith(2.3F)
                .containsExactlyInAnyOrder(2.3F, 2.7F, 6.8F, 2.45F, 5.98F, 90.34F, 100.23F)
                .doesNotHaveDuplicates()
                .isNotNull();
    }
}
