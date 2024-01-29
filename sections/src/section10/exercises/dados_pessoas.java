package section10.exercises;

import section10.entities.Person;

import java.util.Locale;
import java.util.Scanner;

/**
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */
public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        double height;
        char gender;
        double tallest = 0.0;
        double shortest = 3.0;
        double sumWomenHeight = 0.0;
        int womenCounter = 0;
        int menCounter = 0;
        double womenHeightAvg;

        System.out.print("Quantas pessoas serao digitadas? ");
        number = sc.nextInt();
        Person[] vect = new Person[number];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Altura da ");
            System.out.print(i + 1 + "a pessoa: ");
            height = sc.nextDouble();
            System.out.print("Genero da ");
            System.out.print(i + 1 + "a pessoa: ");
            gender = sc.next().charAt(0);

            vect[i] = new Person(height, gender);
        }

        for(Person p : vect){
            if(p.getHeight() > tallest){
                tallest = p.getHeight();
            }

            if(p.getHeight() < shortest){
                shortest = p.getHeight();
            }

            if(p.getGender() == 'f'){
               sumWomenHeight += p.getHeight();
               womenCounter++;
            }else{
                menCounter++;
            }
        }

       womenHeightAvg = sumWomenHeight / womenCounter;

        System.out.printf("Menor altura = %.2f%n", shortest);
        System.out.printf("Maior altura = %.2f%n", tallest);
        System.out.printf("Media das altuas das mulheres = %.2f%n", womenHeightAvg);
        System.out.println("Numero de homens = " + menCounter);



        sc.close();
    }
}
