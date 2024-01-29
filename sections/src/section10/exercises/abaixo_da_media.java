package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada
 */
public class abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        double sum = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        number = sc.nextInt();

        double[] vect = new double[number];

        for(int i = 0; i < number; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

       double avg = sum / vect.length;

        System.out.printf("MEDIA DO VETOR = %.3f\n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for(double e : vect){
            if(e < avg){
                System.out.printf("%.1f \n", e);
            }
        }



        sc.close();
    }
}
