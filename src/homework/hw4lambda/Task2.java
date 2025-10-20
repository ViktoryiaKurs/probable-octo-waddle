package homework.hw4lambda;

import java.util.function.Predicate;

/*
Write a Java program to implement a lambda expression to check if a given string is empty.
 */
public class Task2 {
    public boolean isEmptyString(String str){
        Predicate<String> predicate = s -> s.isEmpty();
        return predicate.test(str);
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(task.isEmptyString(""));
        System.out.println(task.isEmptyString("not empty"));
    }
}
