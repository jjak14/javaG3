package Race;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void testPutBikeInMotionThenStop()
    {
        Pilot thePilot = new Pilot("Jurgen", 20);
        MountainMotorcycle myBike = new MountainMotorcycle("red", 0, 2, thePilot);
        //Change the bike gear then speed up
        myBike.setDrive();
        myBike.speedUp(20);
        assertTrue("The bike has sped up to 20 MPH", myBike.speed == 20 );
        //Brake then park
        myBike.applyBrake(0);
        myBike.setPark();
        assertTrue("The bike has now stopped", myBike.speed == 0 );
    }

    @Test
    public void pilotNameShouldBeJak()
    {
        Pilot thePilot = new Pilot("Jak", 18);
        MountainMotorcycle myBike = new MountainMotorcycle("red", 0, 2, thePilot);
        //Change the bike gear then speed up
        myBike.setDrive();
        myBike.speedUp(40);
        //Brake then park
        myBike.applyBrake(0);
        myBike.setPark();
        assertTrue("Pilot is Jak", myBike.pilot.name == "Jak");
    }
}


