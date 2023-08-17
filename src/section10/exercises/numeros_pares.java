package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */
public class numeros_pares {
    public static void main(String[] args) {
        int number;
        int counter = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        number = sc.nextInt();

        int[] vect = new int[number];

        for(int i = 0; i<number; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }


        System.out.println("NUMEROS PARES: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                counter++;
            }
        }

        System.out.println("\nQUANTIDADES DE PARES = " + counter);




        sc.close();
    }
}

