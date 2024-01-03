package entities;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private Double total;

    public Sale(){

    }

    public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public String getSeller() {
        return seller;
    }

    public Integer getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    public Double averagePrice(){
        return total / items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(month+ "/" + year);
        sb.append(", " + seller);
        sb.append(", " + items);
        sb.append(", " + String.format("%.2f", total));
        sb.append(", pm = " + String.format("%.2f", averagePrice()));

        return sb.toString();
    }
}
