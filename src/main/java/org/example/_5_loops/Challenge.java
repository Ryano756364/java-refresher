package org.example._5_loops;

public class Challenge {
    public static void main(String[] args) {
        //Question #1
        questionOneDayTwo();
        System.out.println("");

        //Question #2
        questionTwoDayTwo();
    }

    public static void questionOneDayTwo(){
        int valOne = 2;
        int valTwo = 5;

        String largerValue = "";

        if (valOne > valTwo){
            largerValue = "valOne";
        } else {
            largerValue = "valTwo";
        }

        System.out.println("Larger value is " + largerValue);


        int difference = Math.abs(valOne - valTwo);
        System.out.println("Difference in the two values is " + difference);
    }

    public static void questionTwoDayTwo(){
        int userInputChoice = 3;

        switch (userInputChoice){
            case 1:
                System.out.println("The user chose option 1");
                break;
            case 2:
                System.out.println("The user chose option 2");
                break;
            case 3:
                System.out.println("The user chose option 3");
                break;
            case 4:
                System.out.println("The user chose option 4");
                break;
            case 5:
                System.out.println("The user chose option 5");
                break;
            default:
                System.out.println("The user did not choose a valid option");
                break;
        }
    }
}
