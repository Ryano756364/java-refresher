package org.example;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double answer;
        boolean result = false;

        a = 10.0;
        b =  3.0;
        c = 14.0;
        answer = 0.0;

        answer = a * b + (2 * b);

        result = b < a || a > 14;

        boolean is_True = result;

        System.out.println(result);  //true
        System.out.println(is_True);  //true

        result = false;
        System.out.println(result);  //false
        System.out.println(is_True);  //still true because storing original memory address; not value of result

    }
}