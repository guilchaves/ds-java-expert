package section10.exercises;

import section10.entities.Person;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 *
 */
public class mais_velho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        Person oldestPerson = new Person();

        System.out.print("Quantas pessoas voce vai digitar? ");
        number = sc.nextInt();
        Person[] vect = new Person[number];


        for(int i = 0; i < number; i++){
            sc.nextLine();
            System.out.print("Dados da ");
            System.out.println(i + 1 + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);
        }

        for(Person p : vect ){
            if(p.getAge() > oldestPerson.getAge()){
                oldestPerson = p;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + oldestPerson.getName());

        sc.close();
    }
}
