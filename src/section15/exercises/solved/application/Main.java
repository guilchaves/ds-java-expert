package section15.exercises.solved.application;

import section15.exercises.solved.model.entities.Reservation;
import section15.exercises.solved.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de uma reserva de hotel (numero do quarto, data de entrada
 * e data de saida) e mostrar os dados da reserva, inclusive sua duracao em dias. Em seguida, ler novas datas
 * de entrada e saida, atualizar a reserva, e mostrar novamente a reserva com os dados
 * atualizados. O programa nao deve aceitar dados invalidos para a reserva, conforme as seguintes,
 * regras:
 * Alteracoes de reserva só podem ocorrer para datas futuras
 * A data de saída deve ser maior que a data de entrada
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        } finally {
            sc.close();
        }

    }
}
