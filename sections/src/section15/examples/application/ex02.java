package section15.examples.application;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {
        method01();
    }

    public static void method01() {
        System.out.println("***METHOD01 START***");
        method02();
        System.out.println("***METHOD01 END***");
    }

    private static void method02() {
        System.out.println("***METHOD02 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

        System.out.println("End of programm");

        sc.close();
        System.out.println("***METHOD02 END***");
    }
}