package GreatestNumApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Test
     */
    @Test
    public void testGreatestNumMethod() {
        assertEquals(3, App.GreatestNumMethod(1, 2, 3) );
        assertEquals(25, App.GreatestNumMethod(25, 10, 6));
    }

}