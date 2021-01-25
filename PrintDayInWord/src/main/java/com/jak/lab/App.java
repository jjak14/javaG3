package com.jak.lab;

public class App 
{
    public String PrintDayInWord(int dayNumber){
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Not a valid day";
        }
    }

    public static void main( String[] args )
    {
        App pApp = new App();
        System.out.println(pApp.PrintDayInWord(6));
    }
}