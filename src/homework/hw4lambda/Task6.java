package homework.hw4lambda;

import java.util.function.Function;

/*
13. Write a Java program to implement a lambda expression to count words in a sentence.
 */
public class Task6 {
    public static void main(String[] args) {
        String sentence = "Count words  in sentence with   lambda";

        Function<String, Integer> countWords = s -> s.split("\\s+").length;
        System.out.println(countWords.apply(sentence));
    }
}
