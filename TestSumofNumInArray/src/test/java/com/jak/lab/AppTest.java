package com.jak.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        App testApp = new App();
        boolean theResult;
        int[] myArr = {4, 5, 4, 2, 2};
        theResult = testApp.testArray(myArr, 4);
        assertTrue( theResult );
    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        App testApp = new App();
        boolean theResult;
        int[] myArr = {4, 5, 2, 4, 2};
        theResult = testApp.testArray(myArr, 4);
        assertTrue( theResult );
    }
    @Test
    public void shouldAnswerWithTrue2()
    {
        App testApp = new App();
        boolean theResult;
        int[] myArr = {4, 2, 4, 3, 2};
        theResult = testApp.testArray(myArr, 4);
        assertTrue( theResult );
    }
    @Test
    public void shouldAnswerWithTrue3()
    {
        App testApp = new App();
        boolean theResult;
        int[] myArr = {2, 5, 4, 1, 2, 4, 5, 9};
        theResult = testApp.testArray(myArr, 4);
        assertTrue( theResult );
    }
}
