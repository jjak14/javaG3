package javaG3;

public class jurVariables {

    // I declare a static/class variable of type String
    public static String myString;
    
    //I declare another static/class variable of type int
    public static int myInteger = 20;

    // I declare an instance variable of type "int"

    // I start/declare a method called main
    public static void main(String args[]){
        
        char myChar; //I declare/create a local variable of type char named myChar
		myChar = 'J'; // I assign a value to myChar
        System.out.println("myChar is a local variable of type char with value of: "+myChar); //I print display myChar's value
    
        //I assign a value to my static variable myString
        jurVariables.myString = "... of type String";
        
        //Display my class variable's value of type String
        System.out.println("My class variable is: "+myString);

        //Display my static variable of type int.
        System.out.println("My static variable of type int and value of: " +myInteger);

    }
    
   
}
