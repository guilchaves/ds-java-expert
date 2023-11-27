package section19.exercises.exercise08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        addStudent(n, sc, set);

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        addStudent(n, sc, set);

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        addStudent(n, sc, set);

        System.out.println("Total students: " + set.size());
    }

    private static void addStudent(int n, Scanner sc, Set<Integer> set) {
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            set.add(id);
        }
    }

}
