package org.example._7_classes_and_objects;

public class Main {
    //Class -> blueprint -> prototype from which objects can be created/instantiated
    //Encapsulation -> use of making methods private, public, or protected
    //Take special note on who is designing the program and who's using the program

    //Objects -> have state and behavior
    //Make sure there is control of how the outside world controls them
    //Airplane -> behavior -> take off, land, dump fuel
    //Airplane -> state -> altitude, speed, fuel, wingspan
    //Encapsulation -> hides details
    public static void main(String[] args) {
        Circle negativeRadiusObject = new Circle();
        negativeRadiusObject.setRadius(-3);
        System.out.println(negativeRadiusObject.getRadius());  //will be 1 since setter handles negative numbers
    }
}
