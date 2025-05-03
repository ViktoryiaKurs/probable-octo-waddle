package HomeworkTest;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);
        account.displayBalance();
    }
}
