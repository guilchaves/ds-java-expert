<<<<<<< HEAD
import entities.TaxPayer;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
=======
import entities.Address;
import entities.Department;
import entities.Employee;

import java.text.MessageFormat;
>>>>>>> empregados/main
import java.util.Locale;
import java.util.Scanner;

public class Main {
<<<<<<< HEAD
=======

>>>>>>> empregados/main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
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
=======
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
>>>>>>> empregados/main
}
