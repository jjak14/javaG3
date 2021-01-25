package com.jak.lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void ShouldReturnSunday()
    {
        App testApp = new App();
        String day = testApp.printDayInWord(0);
        assertTrue( day == "Sunday" );
    }

    @Test
    public void ShouldReturnWednesday() 
    {
        App testApp = new App();
        String day = testApp.printDayInWord(3);
        assertTrue( day == "Wednesday" );
    }
}