package section10.exercises;


import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */
public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terao cada vetor? ");
        int number = sc.nextInt();

        int[] a = new int[number];
        int[] b = new int[number];
        int[] c = new int[number];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < number; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < number; i++){
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < number; i++){
            c[i] = (int) a[i] + (int) b[i];
        }

        System.out.println("VALOR RESULTANTE: ");
        for (int e : c){
            System.out.println(e);
        }


        sc.close();
    }
}

