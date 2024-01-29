package section18.examples.application;

import section18.examples.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Faca um programa para ler um arquivo contendo funcionarios
 * no formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome
 * e mostrar o resultado na tela.
 */
public class ex03 {
    public static void main(String[] args) {
        String path = "./src/section18/examples/resources/funcionarios.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);

                Employee employee = new Employee(name, salary);
                employees.add(employee);
                employeeCsv = br.readLine();
            }
            Collections.sort(employees);
            for (Employee e : employees) {
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
