package section15.exercises.fixacao.model.entities;

import section15.exercises.fixacao.model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > withdrawLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }

        if (amount > balance) {
            throw new DomainException("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }
}
