package section20.exercises.exercise08.entities;


public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName() + ", $" + String.format("%.2f", this.getPrice());
    }


}
