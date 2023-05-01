package org.example._4_logical_operators;

public class Main {
    public static void main(String[] args) {
        int a = 23, b = 99, c = 2, d = 0;
        boolean result = false;

        result = a > c && c < b;
        System.out.println(result);  //true

        result = a == 4.0 || c < b;
        System.out.println(result);  //true

        result = !(a==5.0);
        System.out.println(result);  //true, the 'not' logical operator

        a = 5;
        b = 10;
        c = 15;
        d = 0;

        result = (a == 5) && (b != 11) && (c >= d);
        System.out.println(result);  //true

        result = (a == 5) && (b != 11) && (c >= d);
        System.out.println(result);  //true

        result = (c > b) || (b < 11) && (d == -2);
        System.out.println(result);  //true

    }
}

