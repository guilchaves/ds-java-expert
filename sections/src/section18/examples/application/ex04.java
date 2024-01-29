package section18.examples.application;

import section18.examples.model.services.BrazilInterestService;
import section18.examples.model.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler uma quantia e a duracao em meses
 * de um emprestimo. Informar o valor a ser pago depois de decorrido
 * o prazo do emprestimo, conforme regras de juros do Brasil. A regra
 * do calculo de juros do Brasil eh juro composto padrao de 2% ao mes.
 */
public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();

    }
}
