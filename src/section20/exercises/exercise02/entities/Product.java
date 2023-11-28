package section20.exercises.exercise02.entities;

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

    //Using static method
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    //Using non-static method
    public boolean nonStaticProductPredicate(){
        return this.getPrice() >= 100.0;
    }

    @Override
    public String toString() {
        return this.getName() + ", $" + String.format("%.2f", this.getPrice());
    }
}
