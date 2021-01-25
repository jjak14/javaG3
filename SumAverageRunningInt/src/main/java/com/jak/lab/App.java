package com.jak.lab;

import jdk.nashorn.api.tree.ForInLoopTree;

public class App
{
    public int sumAverageRunningInt()
    {
        int sum = 0 ;
        for (int i = 0; i < 101 ; i++) {
            sum += i;
        }
        return sum;
    }
}
