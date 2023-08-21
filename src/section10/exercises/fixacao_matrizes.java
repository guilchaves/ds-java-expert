package section10.exercises;

import java.util.Scanner;

/**
 * Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma
 * matriz de M linhas por N colunas contendo numeros inteiros, podendo haver repeticoes.
 * Em seguida, ler um numero inteiro X que pertence a matriz. Para cada ocorrencia de X,
 * mostrar os valores a esquerda, acima, a direita e abaixo de X, quando houver.
 *
 */
public class fixacao_matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows;
        int cols;
        int n;

        System.out.println("Digit the number of rows and columns of the matrix");
        System.out.print("Rows: ");
        rows = sc.nextInt();
        System.out.print("Cols: ");
        cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows ; i++){
            for (int j =0; j < cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i < rows ; i++){
            System.out.println();
            for (int j =0; j < cols; j++){
                System.out.print(mat[i][j] + " ");
            }
        }

        System.out.println("\nDigit number to be searched in the matrix: ");
        n = sc.nextInt();

        for (int i = 0; i < rows ; i++){
            for (int j =0; j < cols; j++){
                if(mat[i][j] == n){
                    System.out.println("Position " + i + "," + j + ":" );
                    if(j-1 >= 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j+1 <= mat.length){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i-1 >= 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(i+1 <= mat[i].length ){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
    }

}
