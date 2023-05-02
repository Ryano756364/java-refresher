package org.example._6_methods;

public class Main {
    //Can be thought of as someone taking on work, then returning the work back to you when they are done.
    //When we use 'new' we are creating an object and using the dot operator
    //Access modifier -> return type -> name(parameter list)
    //ex -> public static double findMyTotal(int bill1, int bill2, int bill3)
    // can return nothing -> use keyword 'void' for this

    //Static class method rules
    //(1) you do not need to create an object before you can call this kind of method
    //(2) it's called using the name of the CLASS in conjunction with the dot operator
    //(3) it has only one piece of data that may be returned to the caller
    //(4) the parameter list may contain many pieces of legal data types separed by a comma

    //Java string documentation link
    //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

    public static void main(String[] args) {
        String name; //created a memory location of data type String
        name = new String("David Hosselhoff");  //constructed an object
        //remember char is ' and string is "

        //calling a general method in a library class
        //taking a look at a method in the String class called char
        //this method returns a char for a given position
        char ch = name.charAt(1);
        System.out.println("char at position 1: " + ch);
        System.out.println("");

        //calling a static method
        //going to use the Math class in the documentation
        //using method called double random()
        //it required no information on the parameter list
        double randomValue;
        randomValue = Math.random() * 101;
        System.out.println("randomValue: " + randomValue);
        System.out.println("");
    }
}
