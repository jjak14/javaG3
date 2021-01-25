package com.jak.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldReturn5050()
    {
        App testApp = new App();
        int sum = testApp.sumAverageRunningInt();
        assertTrue( sum == 5050 );
    }
}
