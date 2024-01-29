package section08.exercises;

/*
* Exercicio 3
* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
* (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada - não é necessário validar valores). Ao final, mostrar qual a nota final do aluno no ano.
* Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno
* obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver esse problema.
*
 */

import section08.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExThree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double qOne = sc.nextDouble();
        double qTwo = sc.nextDouble();
        double qThree = sc.nextDouble();

        Student student = new Student(name, qOne, qTwo, qThree);

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        student.isApproved(student.finalGrade());

        sc.close();
    }
}
