package javaG3;

import java.util.Scanner;

public class Highest {

    //This method ask user for 3 numbers and display the greatest of the 3 to the screen
    public static int highest(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            }
            else {
                return z;
            }
        }
        else if (y > z) {
            return y;
        }
        return z;
    }

    public static void main(String arg[]){
        System.out.println("please enter 3 number one after one (press enter after each number is entered)");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();     
        scan.close();

        System.out.println("The greatest number is: "+highest(num1, num2, num3));
    
    }
}

/**
 * TestHighest
 */
public class TestHighest {

    public void name() {
        assertEquals(3, Highest.highest(1, 2, 3));
    }
}