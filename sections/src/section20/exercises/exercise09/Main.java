package section20.exercises.exercise09;

import section20.exercises.exercise09.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");

        String path = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            List<Employee> employees = new ArrayList<>();

            while(line != null){
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            Double salary = sc.nextDouble();
            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> salaryList = employees.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .sorted(comparator)
                    .toList();

            Double sum = employees.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            salaryList.forEach(System.out::println);
            System.out.print("Sum of salary of people whose name starts with 'M': $" + String.format("%.2f", sum) );



        } catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}
