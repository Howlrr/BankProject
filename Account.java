package org.example;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException;
    double getBalance();
    String getAccountNumber();
}
