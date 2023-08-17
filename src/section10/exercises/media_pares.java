package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
public class media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int size;
        int number = 0;
        int sumEvens = 0;
        int totalEvens = 0;
        double avg;

        System.out.print("Quantos elementos tera o vetor? ");
        size = sc.nextInt();

        for(int i=0; i < size; i++ ){
            System.out.print("Digite um numero: ");
            number = sc.nextInt();

            if(number % 2 == 0){
                sumEvens += number;
                totalEvens++;
            }
        }

        avg = (double) sumEvens / (double) totalEvens ;

        if(totalEvens <= 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", avg );
        }

        sc.close();
    }
}
