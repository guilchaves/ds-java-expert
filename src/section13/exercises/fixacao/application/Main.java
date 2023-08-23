package section13.exercises.fixacao.application;

import section13.exercises.fixacao.entities.enums.OrderStatus;
import section13.exercises.fixacao.entities.Client;
import section13.exercises.fixacao.entities.Order;
import section13.exercises.fixacao.entities.OrderItem;
import section13.exercises.fixacao.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário).
 * Depois, mostrar um sumário do pedido conforme exemplo. Nota: o instante do pedido
 * deve ser o instante do sistema: new Date().
 */

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");

        Order order = new Order();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdt.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);
        order.setClient(client);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        order.setStatus(status);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Enter #" + i + " data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, price);
            OrderItem order_item = new OrderItem(product, quantity);
            order.addItem(order_item);
        }

        System.out.println("\nORDER SUMMARY: ");
        System.out.println(order);


        sc.close();

    }
}
