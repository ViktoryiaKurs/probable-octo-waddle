package homework.hw4lambda;


import java.util.function.BiFunction;

/*
Write a Java program to implement a lambda expression to find the sum of two integers.
 */
public class Task1 {
    public Integer sum(Integer a, Integer b) {
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> (x + y);
        return sum.apply(a, b);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.sum(5,7));
    }
}
