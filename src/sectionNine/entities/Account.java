package sectionNine.entities;

public class Account {
    final private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialDeposit;
    }


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
       this.balance += value;
       System.out.println("Updated account data: ");
       System.out.println(this);
    }
    public void withdraw(double value){
        this.balance -= value;
        System.out.println("Updated account data: ");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account " + this.getNumber() + ", Holder: " + this.getHolder() + ", Balance: $ " + String.format("%.2f", this.getBalance()) ;

    }
}
