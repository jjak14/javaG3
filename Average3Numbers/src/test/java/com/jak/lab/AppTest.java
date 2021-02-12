package com.jak.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        App myApp = new App();
        int avgNum;
        avgNum = myApp.average3numbers(5, 5, 5);
        assertTrue( avgNum == 5 );
    }
}
