package section20.exercises.exercise03;

import section20.exercises.exercise03.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

//        list.forEach(new PriceUpdate());
//        list.forEach(Product::staticPriceUpdate);
//        list.forEach(Product::nonStaticPriceUpdate);
//        list.forEach(cons);
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);

    }
}
