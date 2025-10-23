package homework.hw4lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Write a Java program to implement a lambda expression
to sort a list of strings in alphabetical order.
 */
public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("melon", "apple", "orange", "pear", "cucumber", "carrot"));

        System.out.println(list);
        // first solution
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

        // second solution
        list = list.stream().sorted((s1,s2) -> s1.compareTo(s2)).toList();

        System.out.println(list);
    }
}
