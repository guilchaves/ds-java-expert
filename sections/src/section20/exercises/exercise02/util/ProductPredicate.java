package section20.exercises.exercise02.util;

import section20.exercises.exercise02.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
