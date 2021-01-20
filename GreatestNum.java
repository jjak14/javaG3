package javaG3;

import java.util.Scanner;

public class GreatestNum {

    //This method ask user for 3 numbers and display the greatest of the 3 to the screen
    public static void GreatestMethod() {
        System.out.println("please enter 3 number one after one (press enter after each number is entered)");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();     
        scan.close();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest number is: "+num1);
            }

            else {
                System.out.println("The greatest number is: "+num3);
            }
        }
        else if (num2 > num3) {
            System.out.println("The greatest number is: "+num2);
        }
    }

    //Call the method
    public static void main(String arg[]){
        GreatestMethod();
    }
}
