package section08.exercises;

import section08.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício de Fixacao  - Classes estaticas
 * Fazer um programa para ler a cotacao do dólar, e depois um valor em dólares a ser comprato por uma pessoa em reais.
 * Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar
 * 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
 */
public class ExStaticClass {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double totalDollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollarPrice, totalDollars));
    }

}
