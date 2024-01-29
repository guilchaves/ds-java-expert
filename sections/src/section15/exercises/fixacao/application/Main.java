package section15.exercises.fixacao.application;

import section15.exercises.fixacao.model.entities.Account;
import section15.exercises.fixacao.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de uma conta bancaria e depois
 * realizar um saque nesta conta bancaria, mostrando o novo saldo. Um saque
 * nao pode ocorrer ou se nao houver saldo na conta, ou se o valor do saque for superior
 * ao limite de saque da conta.
 */
public class Main {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {

            sc.close();
        }

    }
}
