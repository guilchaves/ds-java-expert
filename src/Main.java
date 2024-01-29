import entities.Sale;
import exceptions.ResourceNotFoundException;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o caminho do arquivo: ");
        String sourceFile = sc.nextLine();

        List<Sale> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                Integer month = Integer.parseInt(fields[0]);
                Integer year = Integer.parseInt(fields[1]);
                String seller = fields[2];
                Integer items = Integer.parseInt(fields[3]);
                Double total = Double.parseDouble(fields[4]);

                list.add(new Sale(month, year, seller, items, total));
                itemCsv = br.readLine();
            }

            System.out.println("Cinco primeiras vendas de 2016 de maior preco médio");
            list.stream()
                    .filter(sale -> sale.getYear() == 2016)
                    .sorted(Comparator.comparingDouble(Sale::averagePrice).reversed())
                    .limit(5)
                    .forEach(System.out::println);

            Double loganTotals = list.stream()
                    .filter(sale -> sale.getMonth() == 1 || sale.getMonth() == 7)
                    .filter(sale -> sale.getSeller().equals("Logan"))
                    .mapToDouble(Sale::getTotal)
                    .sum();


            System.out.println("\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = " + loganTotals);

        } catch (IOException e) {
            throw new ResourceNotFoundException("O sistema não pode encontrar o arquivo especificado.");
        }

        sc.close();
    }
}
