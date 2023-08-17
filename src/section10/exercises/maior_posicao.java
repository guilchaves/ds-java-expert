package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 */
public class maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int number = sc.nextInt();
        int higherValue = 0;
        int higherIndex = 0;
        int[] vect = new int[number];

        for(int i = 0; i < number; i++){
            System.out.print("Digite um numero ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < vect.length; i++) {
            if(vect[i] > higherValue){
                higherValue = vect[i];
                higherIndex = i;
            }
        }

        System.out.println("MAIOR VALOR = " + higherValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + higherIndex);


        sc.close();
    }
}
