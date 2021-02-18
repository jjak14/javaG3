package Race;

class Motorcycle {
    protected String color;
    protected String gear;
    protected int speed;

    Motorcycle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    void applyBrake(int decrement) {
        this.speed = decrement;
    }

    void speedUp(int increment) {
        this.speed = increment;
    }

    void setDrive(){
        this.gear = "D";
    }

    void setPark(){
        this.gear = "P";
    }
}

class MountainMotorcycle extends Motorcycle {

    int seatHeight;
    Pilot pilot;

    MountainMotorcycle(String color, int speed, int startHeight, Pilot thePilot) {
        super(color, speed);
        super.gear = gear;
        this.seatHeight = startHeight;
        this.pilot = thePilot;
    }
}

class Pilot{
    String name;
    int age;

    Pilot(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/* public class App 
{
    public static void main(String args[]) {
        Pilot thePilot = new Pilot("Jak", 18);

        MountainMotorcycle mBike = new MountainMotorcycle("blue", 0, 2, thePilot);
        mBike.setPark();
        System.out.println("The " +mBike.color+ " Mountain Bike is on " +mBike.gear+ " gear thus at " +mBike.speed+ " mph");
        System.out.println("The bike is driven by " +mBike.pilot.name+ " who is " +mBike.pilot.age+ " years old");
    }
} */