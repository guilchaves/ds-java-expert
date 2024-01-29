package section14.exercises.fixacao.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        double price = super.getPrice();
        price += customsFee;
        return price;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        String prod = super.priceTag();
        sb.append(prod + " (Customs fee: $" + String.format("%.2f", customsFee) + ")");
        return sb.toString();
    }
}

