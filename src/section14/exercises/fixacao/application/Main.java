package section14.exercises.fixacao.application;

import section14.exercises.fixacao.entities.ImportedProduct;
import section14.exercises.fixacao.entities.Product;
import section14.exercises.fixacao.entities.UsedProduct;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Fazer um programa para ler os dados de N produtos. Ao final,
 * mostrar a etiqueta de preco de cada produto na mesma ordem em que foram digitados.
 * Todo produto possui nome e preco. Produtos importados possuem taxa de alfandega,
 * e produtos usados possuem data de fabricacao.
 * Estes dados especificos devem ser acrescentados na etiqueta de preco conforme exemplo.
 * Para produtos importados, a taxa de alfandega deve ser acrescentada ao preco final do produto.
 */

/**
 * <p>
 * Arrumar parse data
 * </p>
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type == 'c') {
                Product p = new Product(name, price);
                products.add(p);
            }
            if (type == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdt.parse(sc.nextLine());
                Product p = new UsedProduct(name, price, date);
                products.add(p);
            }
            if (type == 'i') {
                sc.nextLine();
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                Product p = new ImportedProduct(name, price, fee);
                products.add(p);
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}

