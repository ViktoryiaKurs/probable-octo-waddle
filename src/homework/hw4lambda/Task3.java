package homework.hw4lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a Java program to implement a lambda expression to convert
a list of strings to uppercase and lowercase.
 */
public class Task3 {
    public List<String> toUppercase(List<String> list) {
        return list.stream().map(s -> s.toUpperCase()).toList();
    }

    public List<String> toLowercase(List<String> list) {
        return list.stream().map(s -> s.toLowerCase()).toList();
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("One", "twO", "ThrEe"));
        Task3 task = new Task3();

        System.out.println(strings);
        strings = task.toUppercase(strings);
        System.out.println(strings);
        strings = task.toLowercase(strings);
        System.out.println(strings);
    }
}
