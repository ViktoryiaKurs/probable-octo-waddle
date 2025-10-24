package homework.hw4lambda;

import java.util.function.Predicate;

/*
14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
 */
public class Task7 {
    public static void main(String[] args) {
        String s1 = "not palindrome";
        String s2 = "lal";
        String s3 = "laal";

        Predicate<String> isPal = s -> {
            for (int i = 0, k = s.length() - 1; i < k; i++, k--) {
                if (s.charAt(i) != s.charAt(k)) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPal.test(s1));
        System.out.println(isPal.test(s2));
        System.out.println(isPal.test(s3));
    }
}
