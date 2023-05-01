package org.example._3_switch_statements;

public class Main {

    //Switch statements are usually used in menu-type of selections

    public static void main(String[] args) {
        int a = 3;  //plan is to compare to a and if nothing is satisfied, use the default switch output

        char ch = 'y';

        String name = "Ann";

        switch (a){
            case 1:
                System.out.println("a has a value of 1");
                break;  //DON'T FORGET THESE! VERY IMPORTANT!
            case 2:
                System.out.println("a has a value of 2");
                break;
            case 3:
                System.out.println("a has a value of 3");
                break;
            default:
                System.out.println("the value of a is not 1, 2, or 3");
        }

        switch (name){
            case "Andrew":
                System.out.println("The name of the user is Andrew");
                break;
            case "Tom":
                System.out.println("The name of the user is Tom");
                break;
            case "Ann":
                System.out.println("The name of the user is Ann");
                break;
            default:
                System.out.println("The name of the user is not Andrew, Tom, or Ann");
        }
    }

}
