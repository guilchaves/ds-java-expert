package section19.exercises.exercise02.entities;

import java.text.MessageFormat;

public class Product implements Comparable<Product> {

    String name;
    Double value;

    public Product(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public int compareTo(Product o) {
        return this.getValue().compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}, ${1}", name, String.format("%.2f", value));
    }
}
