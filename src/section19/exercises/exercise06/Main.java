package section19.exercises.exercise06;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Laptop");
        set.add("Tablet");

        System.out.println(set.contains("Laptop"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
