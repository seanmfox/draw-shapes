/*
Name: Sean Fox
Date: 5-31-19
Class: CIT-130
Purpose: Assignment 4, Part 2 - Write a test of the Circle and Rectangle classes
*/

public class TestFigure {

    public static void main(String[] args) {

        Figure[] figureArray;

        Rectangle rect1 = new Rectangle("rect1", 25, 100, 10, 15);
        Rectangle rect2 = new Rectangle("rect2", 10, 35, 30, 40);
        Circle cir1 = new Circle("cir1", 5, 10, 60);
        Circle cir2 = new Circle("cir2", 40, 30, 15);
        Circle cir3 = new Circle("cir3", 2, 16, 10);

        figureArray = new Figure[]{rect1, rect2, cir1, cir2, cir3};

        for (Figure shape : figureArray)
            shape.draw();
    }
}
