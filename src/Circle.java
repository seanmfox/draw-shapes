/*
Name: Sean Fox
Date: 5-31-19
Class: CIT-130
Purpose: Assignment 4, Part 2 - Write a Circle subclass
*/

public class Circle extends Figure {

    private int radius;

    public Circle() {
        super(0, 0, "none");
        setRadius(0);
    }

    public Circle(String n, int a, int b, int r) {
        super(a, b, n);
        setRadius(r);
    }

    public String toString() {
        return "In Circle Drawing " + getName() + " centered at (" + getX() + "," + getY() + ") radius " + getRadius();
    }

    public void erase() {
        System.out.println("In Circle erasing");
    }

    public void draw() {
        center();
        erase();
        System.out.println("" + this);
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }
}
