package section08.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarsToBuy){
        double dollarsToReal = dollarsToBuy * dollarPrice;
        double tax = dollarsToReal * IOF;
        return dollarsToReal + tax;
    }

}
