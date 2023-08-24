package section14.exercises.solved.application;

import section14.exercises.solved.entities.Circle;
import section14.exercises.solved.entities.Rectangle;
import section14.exercises.solved.entities.Shape;
import section14.exercises.solved.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N figuras e depois mostrar as
 * areas destas figuras na mesma ordem em que foram digitadas
 */
public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char s = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (s == 'r') {
                sc.nextLine();
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                shapes.add(shape);

            }
            if (s == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape shape = new Circle(color, radius);
                shapes.add(shape);
            }
        }

        System.out.println("SHAPE AREAS");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()));
        }

        sc.close();

    }
}
