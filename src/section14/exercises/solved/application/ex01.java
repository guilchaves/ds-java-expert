package section14.exercises.solved.application;

import section14.exercises.solved.entities.Employee;
import section14.exercises.solved.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Uma empresa possui funcionarios proprios e terceirizados.
 * PAra cada funcionario, deseja-se registrar nome, horas trabalhadas e valor por hora.
 * Funcionarios tercerizados possuem ainda uma despesa adicional.
 * <p>
 * O pagamento dos funcionarios corresponde ao valor da hora multiplicado pelas horas
 * trabalhadas, sendo que os funcionarios terceirizados recebem um bonus correspondente a
 * 110% de sua despesa adicional.
 * <p>
 * Fazer um programa para ler os dados de N funcionarios e armazena-los numa lista.
 * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionario na mesma ordem
 * que foram digitados
 */

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced (y/n)? ");
            char b = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHour = sc.nextDouble();

            if (b == 'y') {
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                Employee e = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                employees.add(e);
            } else if (b == 'n') {
                Employee e = new Employee(name, hours, valuePerHour);
                employees.add(e);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }
}
