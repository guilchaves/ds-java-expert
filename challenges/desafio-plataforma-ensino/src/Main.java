import entities.Lesson;
import entities.Task;
import entities.Video;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println(MessageFormat.format("\nDados da {0}a aula:", i + 1));
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.next().toUpperCase().charAt(0);
            System.out.print("Título: ");
            String title = sc.nextLine();
            sc.next();

            if (type == 'C') {
                System.out.print("URL do video: ");
                String url = sc.nextLine();
                sc.next();
                System.out.print("Duracão em segundos: ");
                Integer seconds = sc.nextInt();
                list.add(new Video(title, url, seconds));
            }

            if (type == 'T') {
                System.out.print("Descricão: ");
                String description = sc.nextLine();
                sc.nextLine();
                System.out.print("Quantidade de questoes: ");
                Integer questionCounter = sc.nextInt();
                list.add(new Task(title, description, questionCounter));
            }
        }

        int duration = 0;
        for (Lesson l : list) {
            duration += l.duration();
        }

        System.out.println("\nDURACAO TOTAL DO CURSO = " + duration + " segundos");

        sc.close();
    }
}
