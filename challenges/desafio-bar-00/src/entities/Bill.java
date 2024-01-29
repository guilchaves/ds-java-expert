package entities;

public class Bill {

    private Character gender;
    private Integer beer;
    private Integer barbecue;
    private Integer softDrink;

    public Bill(Character gender, Integer beer, Integer barbecue, Integer softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getBeer() {
        return beer;
    }

    public Integer getBarbecue() {
        return barbecue;
    }

    public Integer getSoftDrink() {
        return softDrink;
    }

    public double cover() {
        return (this.feeding() > 30) ? 0 : 4;
    }

    public double feeding() {
        Integer beerCost = beer * 5;
        Integer softDrinkCost = softDrink * 3;
        Integer barbecueCost = barbecue * 7;

        return beerCost + softDrinkCost + barbecueCost;
    }

    public double ticket() {
        return (gender == 'M') ? 10 : 8;
    }

    public double total() {
        return ticket() + feeding() + cover();
    }
}
