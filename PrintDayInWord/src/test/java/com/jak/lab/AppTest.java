package com.jak.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void ShouldReturnSunday()
    {
        App testApp = new App();
        String day = testApp.PrintDayInWord(0);
        assertTrue( day == "Sunday" );
    }

    @Test
    public void ShouldReturnWednesday() 
    {
        App testApp = new App();
        String day = testApp.PrintDayInWord(3);
        assertTrue( day == "Wednesday" );
    }
}
