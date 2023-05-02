package org.example._7_classes_and_objects;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double newValue){
        radius = newValue;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadiusValue){
        if(newRadiusValue < 0){
            radius = 1;
        } else {
            radius = newRadiusValue;
        }
    }
}
