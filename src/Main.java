import entities.Champion;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite os dados do primeiro campeão");
        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Vida: ");
        Integer life = sc.nextInt();
        System.out.print("Ataque: ");
        Integer attack = sc.nextInt();
        System.out.print("Armadura: ");
        Integer armor = sc.nextInt();

        Champion a = new Champion(name, life, attack, armor);

        System.out.println("\nDigite os dados do segundo campeão");
        System.out.print("Nome: ");
        name = sc.next();
        System.out.print("Vida: ");
        life = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion b = new Champion(name, life, attack, armor);

        System.out.print("\nQuantos turnos você deseja executar? ");
        Integer turns = sc.nextInt();

        for (int i = 0; i < turns; i++) {
            System.out.println(MessageFormat.format("\nResultado do turno {0}:", i + 1));

            a.takeDamage(b);
            b.takeDamage(a);

            System.out.println();
            System.out.println(a.status());
            System.out.println(b.status());

            if (a.getLife() <= 0 || b.getLife() <= 0) {
                return;
            }
        }

        System.out.println("\nFIM DO COMBATE");

        sc.close();
    }
}
