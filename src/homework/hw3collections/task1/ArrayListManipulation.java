package homework.hw3collections.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


/*
Напишите программу, которая:
1. Создает ArrayList из 10 случайных целых чисел (от 1 до 100).
2. Находит и выводит:
    Максимальный и минимальный элементы.
    Среднее арифметическое всех элементов.
3. Удаляет все четные числа из списка.
4. Сортирует оставшиеся элементы в порядке убывания и выводит итоговый список.
 */
public class ArrayListManipulation {
    private final ArrayList<Integer> numbers = new ArrayList<>();

    public void executeOperations() {
        fillArrayWithRandomIntegers();
        System.out.println("Random numbers added:");
        printArray();
        System.out.println();
        System.out.println("Max element: " + findMaxElement());
        System.out.println("Min element: " + findMinElement());
        System.out.println("Arithmetic mean: " + findArithmeticMean());
        removeEvenNumbers();
        System.out.println("After even numbers removal:");
        printArray();
        System.out.println();
        System.out.println("After sorting in descending order:");
        bubbleSortDescending();
        printArray();
    }

    private void fillArrayWithRandomIntegers() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(101));
        }
    }

    private int findMaxElement() {
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private int findMinElement() {
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private double findArithmeticMean() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    private void removeEvenNumbers() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private void bubbleSortDescending() {
        int temp;
        boolean swapped;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            swapped = false;
            for (int j = 0; j < i; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    private void printArray() {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%d ", iterator.next());
        }
    }
}
