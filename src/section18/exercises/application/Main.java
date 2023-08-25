package section18.exercises.application;

import section18.exercises.model.entities.Contract;
import section18.exercises.model.services.ContractService;
import section18.exercises.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Uma empresa deseja automizar o processamento de seus contratos. O processamento de
 * um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base
 * no numero de meses desejado.
 * A empresa utiliza um servico de pagamento online para realizar o pagamento das parcelas.
 * Os servicos de pagamento online tipicamente cobram um juro mensal, bem como uma
 * taxa por pagamento. Por enquanto, o servico contratado pela empresa e o do paypal, que aplica
 * juros simples de 1% a cada parcela, mas uma taxa de pagamento de 2%.
 * Fazer um programa para ler os dados de um contrato (numero, data, valor total). Em seguida,
 * o programa deve ler o numero de meses para o parcelamento do contrato,
 * e dai gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira
 * parcela a a ser paga um mes apos a data do contrato, a segunda parcela dois meses apos o contrato e assim por diante.
 * Mostrar os dados das parcelas na tela.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ContractService service = new ContractService(new PaypalService());

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();

        Contract c = new Contract(number, date, value);

        service.processContract(c, installments);

        System.out.println("Parcelas:");
        System.out.println(c);


        sc.close();
    }
}
