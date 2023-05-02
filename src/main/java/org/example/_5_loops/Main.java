package org.example._5_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //While loop, for loop, do while loop, for each loop
        //While loop comes in conjunction with the following test
        //If true, test continues until false
        //Do while -> loop is run at least once
        //For loop -> contains initialisation; test condition; increment/decrement
        //No ; after loop parenthesis!!! will create an infinite loop in the computer!! very bad!!!
        //Nested loops are allowed

        //Counter controlled loop -> self-explanatory
        //Sentinel loops -> insert a true in test but make sure there is a break to leave the loop!!

        //**Look into Scanner library class

        System.out.println("First while loop, counter controlled...>>");
        int counter = 0;
        while(counter < 3){
            System.out.println("The counter value = " + counter);
            counter++;
        }

        System.out.println("\nSecond while loop, sentinel loop...>>");
        Scanner sc = new Scanner(System.in);
        String yesNo = "Yes";
        int num1 = 0;
        while (true){
            num1 = (int)(Math.random() * 11);  //this is an example of casting with the (int)
            System.out.println("num1 has the value " + num1);
            System.out.println("Enter yes to continue or no to stop..>>");
            yesNo = sc.next();
            if(yesNo.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println("Break has taken you out of the block of the block");

    }
}
