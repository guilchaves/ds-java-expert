package section19.exercises.exercise05;

import section19.exercises.exercise05.entities.Client;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@email.com");
        Client c2 = new Client("Bob", "bob@email.com");
        Client c3 = new Client("Maria", "maria2@email.com");
        Client c4 = new Client("Bob", "bob@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c4));
    }
}
