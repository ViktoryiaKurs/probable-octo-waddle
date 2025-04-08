package homework.hw1oop.task3;

import java.math.BigDecimal;

/*
 * Create a BankAccount class with the following fields:
 * accountNumber
 * balance
 *
 * Methods to implement:
 * Deposit money (deposit(amount))
 * Withdraw money (withdraw(amount))
 *
 * Validation rule:
 * Ensure the balance cannot go negative (throw an error or reject invalid withdrawals).
 */

public class BankAccount {
    String accountNumber;
    BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0){
            balance.add(amount);
            System.out.println(amount + "$ were successfully deposited on account " + accountNumber);
        } else {
            System.out.println("Deposited amount can't be negative or zero");
        }
    }

    public void withdraw(BigDecimal amount){
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(balance) <= 0){
            balance = balance.subtract(amount);
            System.out.println(amount + "$ were successfully withdrawn from account " + accountNumber);
        } else {
            System.out.println("Withdrawing amount can't be higher than the current balance or equal to zero");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

}
