package section10.exercises;

import section10.entities.Person;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos
 * bem como os nomes dessas pessoas caso houver.
 */
public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();

        String name;
        int age;
        double height;
        Person[] vect = new Person[number];


        for(int i = 0; i < number; i++){
            sc.nextLine();
            System.out.print("Dados da ");
            System.out.println(i + 1 + "a pessoa: ");

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Idade: ");
            age = sc.nextInt();

            System.out.print("Altura: ");
            height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }

        double heightSum = 0.0;
        int counter = 0;

        for(int i = 0; i < vect.length; i++ ){
            heightSum += vect[i].getHeight();
            if(vect[i].getAge() < 16){
                counter++;
            }
        }

        String[] underSixteen = new String[counter];

        int count = 0;
        for (Person p : vect){
            if(p.getAge() < 16){
                underSixteen[count] = p.getName();
                count++;
            }
        }

        double avg = heightSum / vect.length;
        System.out.printf("Altura média: %.2f%n", avg);

        double percentage = underSixteen.length * 100 / vect.length;

        System.out.print("Pessoas com menos de 16 anos: " + String.format("%.1f", percentage) + "%\n");
        for (String e : underSixteen){
            System.out.println(e);
        }


        sc.close();
    }

}
