package org.example;

public class SavingAccount extends BaseAccount {
    public SavingAccount(String number, double balance) {
        super(number, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < 100) {
            throw new InsufficientFundsException("Ошибка: На сберегательном счету должно оставаться минимум 100$");
        }
        balance -= amount;
        System.out.println("Счет " + number + ": Снято " + amount);
    }
}
