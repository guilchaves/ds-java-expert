import entities.Sale;
import exceptions.ResourceNotFoundException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

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

            Map<String, Double> totalSalesBySeller = list.stream()
                    .collect(Collectors.groupingBy(Sale::getSeller, Collectors.summingDouble(Sale::getTotal)));

            totalSalesBySeller.forEach(
                    (seller, total) -> System.out.println(seller + " - R$ " + String.format("%.2f", total))
            );
        } catch (IOException e) {
            throw new ResourceNotFoundException("O sistema não pode encontrar o arquivo especificado.");
        }

        sc.close();
    }
}
