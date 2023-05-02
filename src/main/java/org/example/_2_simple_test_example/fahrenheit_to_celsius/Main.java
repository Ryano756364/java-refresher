package org.example._2_simple_test_example.fahrenheit_to_celsius;

public class Main {
    public static void main(String[] args) {
        double fahrenheitExample = 98.6;
        double celsiusExample = 32.0;

        System.out.println("98.6 degrees F to celsius is " + fahrenheitToCelsiusConverter(celsiusExample));
        System.out.println("32.0 degrees C to fahrenheit is " + celsiusToFahrenheitConverter(fahrenheitExample));
    }

    public static double fahrenheitToCelsiusConverter(double fahrenheit){
        return (fahrenheit - 32) * (5.0/9.0);
    }

    public static double celsiusToFahrenheitConverter(double celsius){
        return (celsius * (9.0 / 5.0)) + 32;
    }
}
