package section19.exercises.exercise03;

import section19.exercises.exercise03.entities.Circle;
import section19.exercises.exercise03.entities.Rectangle;
import section19.exercises.exercise03.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area of shapes: " + String.format("%.2f",totalArea(myShapes)));

        System.out.println("-------");
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area of circles: " + String.format("%.2f",totalArea(myCircles)));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
