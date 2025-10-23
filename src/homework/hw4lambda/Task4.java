package homework.hw4lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Write a Java program to implement a lambda expression
to filter out even and odd numbers from a list of integers.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(nums);

        Predicate<Integer> isEven = n -> n % 2 != 0;

        // keep only even
        nums = nums.stream().filter(isEven).toList();

        // keep only odd
        nums.removeIf(isEven);

        System.out.println(nums);
    }
}
