package homework.hw1oop.task3;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("98765-43210", new BigDecimal(2500));
        System.out.println(account1.toString());
        account1.deposit(new BigDecimal(500)); // success
        account1.deposit(new BigDecimal(-123)); // fail negative
        account1.deposit(new BigDecimal(0)); // fail = 0

        account1.withdraw(new BigDecimal(2000)); // success
        account1.withdraw(new BigDecimal(2000)); // fail amount > balance
        account1.withdraw(new BigDecimal(0)); // fail = 0
        int l = arr.length;
        Arrays.sort(new int[]{1,2,3});
    }
}
