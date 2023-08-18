package section10.exercises;

import section10.entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionarios. Nao deve
 * haver repeticao de id.
 * <p>
 * Em seguida, efetuar o aumento de X por cento do salario de um determinado funcionario. Para isso,
 * o programa deve ler um id e o valor X. Se o id informado nao existir, mostrar uma mensagem e abortar a ooperacao.
 * Ao final, mostrar a listagem atualizada dos funcionarios, conforme exmeplos.
 * <p>
 * Lembre-se de aplicar a técnica de encapsulamento para nao permitir que o salario
 * possa ser mudado livremente. Um salario so pode ser aumentado com base em uma operacao de
 * aumento por porcentagem dada.
 */
public class fixacao_listas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        int id;
        String name;
        double salary;
        boolean idExists = false;
        double percentage;
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.print("Employee #");
            System.out.println(i + 1);

            System.out.print("Id: ");
            id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextDouble();

            if (!checkId(employees, id)) {
                registerEmployee(employees, new Employee(id, name, salary));
            } else {
                System.out.println("Employee " + name + " could not be added. Please digit another id.");
                i--;
            }
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        percentage = sc.nextDouble();

        if (!checkId(employees, id)) {
            System.out.println("This id does not exists!");
        } else {
            for (Employee e : employees) {
                if (e.getId() == id) {
                    e.increaseSalary(percentage);
                }
            }
        }

        System.out.println("List of employees: ");

        for (Employee e : employees) {
            System.out.println(e.getId() + ", " + e.getName() + ", " + String.format("%.2f", e.getSalary()));
        }

        sc.close();
    }

    public static void registerEmployee(ArrayList<Employee> list, Employee e) {
        list.add(e);
    }

    public static boolean checkId(ArrayList<Employee> list, int id) {
        boolean result = false;

        for (Employee e : list) {
            result = e.getId() == id;
        }

        return result;
    }


}
