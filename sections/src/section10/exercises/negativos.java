package section10.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
* e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*/
public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int number = sc.nextInt();

        while(number > 10){
            System.out.println("O número deve ser menor ou igual a 10. Digite novamente:");
            number = sc.nextInt();
        }

        int[] vect = new int[number];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }

}
