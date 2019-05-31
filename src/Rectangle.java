/*
Name: Sean Fox
Date: 5-31-19
Class: CIT-130
Purpose: Assignment 4, Part 2 - Write a Rectangle subclass
*/

public class Rectangle extends Figure {
    private int length, height;

    public Rectangle() {
        super(0, 0, "none");
        setLength(0);
        setHeight(0);
    }

    public Rectangle(String n, int a, int b, int l, int h) {
        super(a, b, n);
        setLength(l);
        setHeight(h);
    }

    public String toString() {
        return "In Rectangle Drawing " + getName() + " centered at (" + getX() + "," + getY() + ") length " + getLength() + " height " + getHeight();
    }

    public void erase() {
        System.out.println("In Rectangle erasing");
    }

    public void draw() {
        center();
        erase();
        System.out.println("" + this);
    }

    public void setLength(int l) {
        length = l;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
