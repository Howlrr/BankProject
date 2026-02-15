package org.example;

public abstract class BaseAccount implements Account {
    protected String number;
    protected double balance;

    public BaseAccount(String number, double initialBalance) {
        this.number = number;
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + number);
    }
    @Override
    public double getBalance() {return balance;}

    @Override
    public String getAccountNumber() {return number;}
}
