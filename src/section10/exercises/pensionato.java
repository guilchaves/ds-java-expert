package section10.exercises;

import section10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student[] rooms = new Student[10];
        int number;
        String name;
        String email;
        int roomNumber;

        System.out.print("How many rooms will be rented?" );
        number = sc.nextInt();

        for (int i = 0; i < number; i++){
            sc.nextLine();
            System.out.print("Rent #");
            System.out.println(i+1 + ":");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: " );
            roomNumber = sc.nextInt();


            rooms[roomNumber] = new Student(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }

        sc.close();
    }
}
