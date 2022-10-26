package org.example.calculator;

import java.util.List;

public class Calculator {
    public int addArray(int[] arr) {
        int result = 0;

        for (int input : arr) {
            result += input;
        }

        return result;

    }
        public float divideArray(float[] arr) {
            float result = 0;
            for(float input : arr) {
                result /= input;
            }

            return result;
        }

    public int multiplyArray(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result *= arr[0];
        }

            return result;
        }

    public int subtractArray(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result = result - arr[i];
        }

        return result;
        }

}


