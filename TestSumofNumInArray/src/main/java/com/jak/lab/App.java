package com.jak.lab;

import java.text.BreakIterator;
import jdk.nashorn.api.tree.WhileLoopTree;

public class App
{
    public boolean testArray(int[] arr, int testNum) {
        int sum = 0;
        boolean result = false;
        int k = 0;
        int j = 1;
        do {
            while (j < arr.length) {
                sum = arr[k] + arr[j];
                if (sum == testNum) {
                    result = true;
                    break;
                }
                j++;
            }
            k++;
            j = k+1;
        } while (k < arr.length);
        return result;
    }
}
