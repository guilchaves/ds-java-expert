import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Sexo: ");
        char gender = sc.next().toUpperCase().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        Integer beersConsumed = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        Integer popsConsumed = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        Integer barbecuesConsumed = sc.nextInt();

        Bill bill = new Bill(gender, beersConsumed, barbecuesConsumed, popsConsumed);

        System.out.println("\nRELATÓRIO:");
        System.out.println("Consumo = R$ " + String.format("%.2f", bill.feeding()));
        if ((bill.cover() == 0)) {
            System.out.println("Insento de Couvert");
        } else {
            System.out.println("Couvert = R$ " + String.format("%.2f", bill.cover()));
        }
        System.out.println("Ingresso = R$" + String.format("%.2f", bill.ticket()));
        System.out.println("\nValor a pagar = R$ " + String.format("%.2f", bill.total()));

        sc.close();
    }
}
