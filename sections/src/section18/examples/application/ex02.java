package section18.examples.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Faca um programa para ler um arquivo contendo nomes de pessoas,
 * armazenando-os em uma lista. Depois, ordenar os dados dessa lista e
 * mostra-los ordenadamente na tela.
 */
public class ex02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String path = "./src/section18/examples/resources/names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {


                names.add(name);
                name = br.readLine();
            }

            Collections.sort(names);
            for (String s : names) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
