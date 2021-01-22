package GreatestNumApp;

import java.util.Scanner;

/**
 * Greatest Number
 */
public class App 
{
    public static int GreatestNumMethod(int x, int y, int z) {
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

    public static void main( String[] args ){
        System.out.println("please enter 3 number one after one (press enter after each number is entered)");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();     
        scan.close();

        System.out.println("The greatest number is: "+GreatestNumMethod(num1, num2, num3));

    }
}