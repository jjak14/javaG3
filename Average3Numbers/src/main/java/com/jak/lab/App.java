package com.jak.lab;

import java.util.ArrayList;

public class App
{
    public int average3numbers(int num1, int num2, int num3) {
        int[] theNumbers = {num1, num2, num3};

        int sum = 0;
        for (int i = 0; i < theNumbers.length; i++) {
            sum += theNumbers[i];
        }
        return (sum/theNumbers.length);
    }
}
