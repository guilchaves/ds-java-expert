package section18.examples.application;

import section18.examples.model.entities.CarRental;
import section18.examples.model.entities.Vehicle;
import section18.examples.model.services.BrazilTaxService;
import section18.examples.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Uma locadora brasileira de carros cobra um valor por hora
 * para locacoes de ate 12 horas. Porem, se a duracao da locacao ultrapassar
 * 12 horas, a locacao sera cobrada com base em um valor diario. Alem do
 * valor da locacao, e acrescido no preco o valor do importo conforme regras do pais. No caso do Brasil
 * e 20% para valores ate 100.00 ou 15% para valores acimas de 100.00.
 * Fazer um programa que le dados da locacao (modelo carro, instante inicial e final da locacao),
 * bem como o valor por hora e o valor diario da locacao. O programa deve entao gerar a nota de pagamento
 * (contedo valor da locacao, valor do imposto e valor total do pagamento) e informar os dados na tela.
 */
public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre o preco por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre o preco por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento final: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
