import entities.TaxPayer;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(MessageFormat.format("\nDigite os dados do {0}o contribuinte: ", i+1));
            System.out.print("Renda anual com salário: ");
            Double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            Double service = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            Double capital = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            Double health = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            Double education = sc.nextDouble();

            list.add(new TaxPayer(salary, service, capital, health, education));
        }

        int counter = 1;
        for (TaxPayer tp : list){
            System.out.println("\nResumo do " + counter + "o contribuinte: ");
            System.out.println("Imposto bruto total: " + String.format("%.2f", tp.grossTax()));
            System.out.println("Abatimento: " + String.format("%.2f", tp.taxRebate()));
            System.out.println("Imposto devido: " + String.format("%.2f", tp.netTax()));
            counter++;
        }

        sc.close();
    }
}
