package section10.exercises;

import section10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        String name;
        double firstTerm;
        double secondTerm;
        final double PG = 6.0;

        System.out.print("Quantos alunos serao digitados? ");
        number = sc.nextInt();
        Student[] vect = new Student[number];

        for(int i =0; i < number; i++){
            sc.nextLine();
            System.out.print("Digite nome, primeira e segunda nota do ");
            System.out.println(i+1 + "o aluno:");

            name = sc.nextLine();
            firstTerm = sc.nextDouble();
            secondTerm = sc.nextDouble();

            vect[i] = new Student(name, firstTerm, secondTerm);
        }


        System.out.println("Alunos aprovados: ");
        for (Student s : vect){
            if(s.average() >= PG){
                System.out.println(s.getName());
            }
        }

        sc.close();
    }
}
