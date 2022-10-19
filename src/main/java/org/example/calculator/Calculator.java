package org.example.calculator;

public class Calculator {
    public int addArray(int[] arr) {
        int result = 0;

        for(int input : arr) {
            result += input;
        }

        return result;

    }
}
