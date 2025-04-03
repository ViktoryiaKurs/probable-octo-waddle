public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, 0); // Начальный баланс не может быть отрицательным
    }

    public  void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: +" + amount + " Новый баланс: " + balance);
        } else {
            System.out.println("Сумма для пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " Новый баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств или некорректная сумма.");
        }
    }

    public void displayBalance() {
        System.out.println("Баланс на счету " + accountNumber + ": " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);
        account.displayBalance();
    }
}
