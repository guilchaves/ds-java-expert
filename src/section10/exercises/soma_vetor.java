package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
* - Imprimir todos os elementos do vetor
* - Mostrar na tela a soma e a média dos elementos do vetor
 */
public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int number = sc.nextInt();

        double[] vect = new double [number];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length; i++){
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.print("VALORES = ");

        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.println("\nSOMA = " + sum);
        System.out.printf("MEDIA = %.2f", avg);

        sc.close();
    }
}
