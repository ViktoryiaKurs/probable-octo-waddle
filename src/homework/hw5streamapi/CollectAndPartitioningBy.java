package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Разделить список чисел на две группы: четные и нечетные
 */
public class CollectAndPartitioningBy {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Map<Boolean, List<Integer>> partitionByEvenOdd = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitionByEvenOdd);
    }
}
