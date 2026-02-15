package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingAccount("S-001", 500));
        accounts.add(new SavingAccount("S-002", 1000));

        try {
            accounts.get(0).withdraw(450); // Это вызовет наше исключение
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        // Java Core "Магия": Stream API
        double totalMoney = accounts.stream()
                .mapToDouble(Account::getBalance)
                .sum();

        System.out.println("Всего денег в банке: " + totalMoney + "$");
    }
}
