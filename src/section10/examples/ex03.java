package section10.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LISTS
 */
public class ex03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Carlos");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String e : list){
            System.out.println(e);
        }

        System.out.println("------------------");
        list.removeIf(x-> x.charAt(0) == 'M');
        for (String e : list){
            System.out.println(e);
        }

        System.out.println("------------------");
        System.out.println("Index of Carlos: " + list.indexOf("Carlos"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));


        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String e : result){
            System.out.println(e);

        }

        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
