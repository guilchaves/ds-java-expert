package section08.exercises;

import section08.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

/*
* Exercicio 1
*
* Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela
* o valor de sua área, perímetro e diagonal.
* Usar uma classe como mostrado no projeto ao lado.
* */
public class ExOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
    }

}

