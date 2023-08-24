package section14.exercises.fixacao.application;

import section14.exercises.fixacao.entities.Company;
import section14.exercises.fixacao.entities.Individual;
import section14.exercises.fixacao.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
 * podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
 * bem como o total de imposto arrecadado.
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
 * são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
 * seguintes:
 * Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saude, 50%
 * destes gastos sao abatidos no imposto.
 * Pessoa juridica: pessoas juridicas pagam 16% de imposto. Porem, se a empresa possuir mais de 10
 * funcionarios, ela paga 14% de imposto
 */
public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();
        double sumTaxes = 0.0;

        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char t = sc.next().charAt(0);
            sc.nextLine();

            if (t == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Annual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double he = sc.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, he));
            }

            if (t == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Annual income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int ne = sc.nextInt();

                taxPayers.add(new Company(name, anualIncome, ne));
            }
        }

        System.out.println("TAXES PAID: ");
        for (TaxPayer t : taxPayers) {
            System.out.println(t.getName() + ": $ " + String.format("%.2f", t.taxesPaid()));
            sumTaxes += t.taxesPaid();
        }

        System.out.print("\nTOTAL TAXES: $" + String.format("%.2f", sumTaxes));


        sc.close();
    }
}
