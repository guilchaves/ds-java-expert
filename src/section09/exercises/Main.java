package section09.exercises;

import section09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

/**
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar
 * o número da conta, o nome do titular da conta, e o valor de depósito incial que o titular depositou ao abrir a conta.
 * Este valor de depósito inicial é opcional, ou seja: se o titular nào tiver dinheiro a depositar no momento
 * de abrir sua conta, o depósito incial não será feito e o saldo inicial da conta será zero.
 *
 * Importante: uma vez que a conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome
 * do titular pode ser alterado.
 *
 * Você deve fazer um programa que realize o cadastro de uma conta, dando općão para que seja ou não informando
 * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque,
 * sempre mostrando os dados da conta após cada operaćão.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String holder = sc.next();

        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        double deposit = checkDeposit(answer, sc);

        Account ac = new Account(number, holder, deposit);
        System.out.println("Account data: ");
        System.out.println(ac);

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        ac.deposit(deposit);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);
    }

    private static double checkDeposit(char answer, Scanner sc) {
        double deposit;

        if(answer == 'n'){
            deposit = 0.0;
        } else {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
        }
        return deposit;
    }
}

