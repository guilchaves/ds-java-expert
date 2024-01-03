import entities.Address;
import entities.Department;
import entities.Employee;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = sc.next();
        System.out.print("Dia do pagamento: ");
        Integer payDay = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String phone = sc.next();

        Department dept = new Department(name, payDay, new Address(email, phone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(MessageFormat.format("\nDados do funcionário {0}", i + 1));
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Salário: ");
            Double income = sc.nextDouble();

            dept.addEmployee(new Employee(name, income));
        }

        showReport(dept);

        sc.close();
    }

    private static void showReport(Department dept){
        System.out.println("\nFOLHA DE PAGAMENTO: ");
        System.out.println("Departamento Vendas = R$ " + String.format("%.2f", dept.payroll()));
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários: ");
        dept.getEmployees().forEach(System.out::println);
        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
    }
}
