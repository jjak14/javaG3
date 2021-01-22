package javaG3;

import java.util.Scanner;

public class Operators {
// java program to showcase all operators
    
    public static void main(String[] args){
        System.out.println("Please enter a number (preferably an integer)");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.close();
        System.out.println("num1 is: "+num1);
        System.out.println("Please enter another number (preferably an integer smaller than num1)");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("num2 is : "+num2);
        System.out.println("Below are the different operations possible in Java using with num1 and num2");

        //Arithmetics Operator
        System.out.println("");
        System.out.println("1) Arithmetic Operators");

        //Addition
        int add = num1+num2;
        System.out.println("num1 + num2 = "+add);
        
        //subtraction
        int sub = num1-num2;
        System.out.println("num1 - num2 = "+sub);

        //multiplication
        int mult = num1 * num2;
        System.out.println("num1 * num2 = "+mult);

        //Division
        float flNum1 = num1;
        float flNum2 = num2;
        float div = flNum1 / flNum2;
        System.out.println("num1 / num2 = "+div);

        //Modulo
        int mod = num1 % num2;
        System.out.println("num1 % num2 = "+mod);

        //Assignment Operators
        System.out.println("");
        System.out.println("2) Assignment Operators");

        //basic assignment
        System.out.println("");

        System.out.println("num1 = num2 will assign num2 value to num1");
        num1 = num2;
        System.out.println("num1 = num2 makes num1 become: "+num1);

        //Increment
        System.out.println("");

        System.out.println("num1 += num2 will add num2 to the current value of num1 and assign the result to num1");
        num1+=num2;
        System.out.println("num1 += num2 and num1 becomes: "+num1);

        //Decrement
        System.out.println("");

        System.out.println("num1 -= num2 will subtract num2 value from num1 value and assign the result to num1");
        num1-=num2;
        System.out.println("num1 -= num2 and num1 is now: "+num1);

        //multiply and assign
        System.out.println("");

        System.out.println("num1 *= num2 will multiply num1 by num2 and assign the result to num1");
        num1/=num2;
        System.out.println("num1 *= num2 and num1 is now: "+num1);

        //modulo and assign
        System.out.println("");

        System.out.println("num1 %= num2 will perform num1 % num2 and assign the result to num1");
        num1%=num2;
        System.out.println("num1 %= num2 and num1 is now: "+num1);

        //Auto increment and decrement        
        System.out.println("");
        System.out.println("3) Auto-increment and Auto-decrement Operators");
        
        //Auto increment
        System.out.println("num1++ will add 1 to num1 and num1-- will subtract 1 from num1");
        num1++;
        System.out.println("num1++ is: "+num1);

        //Auto decrement
        num1--;
        System.out.println("num1-- is: "+num1);

        //Logical operators
        System.out.println("");
        System.out.println("4) Logical Operators");
        System.out.println("this applies to binary values, consider doorOpen to be true and gateOpen to be false");
        boolean doorOpen = true;
        boolean gateOpen = false;
        System.out.println("doorOpen && gateOpen is: " + (doorOpen && gateOpen));
        System.out.println("doorOpen || gateOpen is: " + (doorOpen || gateOpen));
        System.out.println("!(doorOpen && gateOpen) is: " + !(doorOpen && gateOpen));

        //Comparisons
        System.out.println("");
        System.out.println("5) Comparison(Relational) operators");
        System.out.println("Comparisons operation return either true or false as a result");
        System.out.println("num1 is now: "+ num1 + " And num2 is now: "+ num2 + " so: ...");
        System.out.println("num1 == num2 is: " + (num1 == num2));
        System.out.println("num1 != num2 is: " + (num1 != num2));
        System.out.println("num1 > num2 is: " + (num1 > num2));
        System.out.println("num1 < num2 is: " + (num1 < num2));
        System.out.println("num1 >= num2 is: " + (num1 >= num2));
        System.out.println("num1 <= num2 is: " + (num1 <= num2));

        //Bitwise operators
        System.out.println("");
        System.out.println("6) Bitwise Operators");
        // System.out.println("I've set num1 now to : " + (num1 = 44));
        System.out.println("Bitwise operators acts on the binary equivalent of numbers");
        System.out.println("I've set num1 now to : " + (num1 = 44) + " which is also " + Integer.toBinaryString(num1) + " And num2 is now: "+ num2 + " which is also " + Integer.toBinaryString(num2) + " so: ...");
        System.out.println("num1 & num2 is: " + (num1 & num2) + " which is also " + Integer.toBinaryString(num1 & num2));
        System.out.println("num1 | num2 is: " + (num1 | num2) + " which is also " + Integer.toBinaryString(num1 | num2));
        System.out.println("num1 ^ num2 is: " + (num1 ^ num2) + " which is also " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("~num1 is: " + (~num1) + " which is also " + Integer.toBinaryString(~num1));
        System.out.println("num1 >> 2 is: " + (num1 >> 2) + " which is also " + Integer.toBinaryString(num1 >> 2));
        System.out.println("num1 << 2 is: " + (num1 << 2) + " which is also " + Integer.toBinaryString(num1 << 2));

        //Ternary operators
        System.out.println("");
        System.out.println("7) Ternary Operators");
        System.out.println("This is a sort of conditional assignment of value to variables");

        num1 = (num2 == 15 ) ? 777 : 999;

        System.out.println("The expression (num1 = (num2 == 15 ) ? 777 : 999) will assign either 777 or 999 to num1 based on the result of (num2 == 15)");
        System.out.println("num2 being: "+num2 + ", num1 is now: "+num1);

    }
    
}
