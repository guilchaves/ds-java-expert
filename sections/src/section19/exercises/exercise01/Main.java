package section19.exercises.exercise01;

import section19.exercises.exercise01.services.PrintService;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> service = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            service.addValue(value);
        }

        service.print();
        System.out.println("First: " + service.first());

        sc.close();

    }
}
