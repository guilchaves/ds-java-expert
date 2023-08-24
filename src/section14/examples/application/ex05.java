package section14.examples.application;

import section14.examples.entities.Account;
import section14.examples.entities.BusinessAccount;
import section14.examples.entities.SavingsAccount;

public class ex05 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.00);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
    }
}
