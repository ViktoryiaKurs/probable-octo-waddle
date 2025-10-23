package homework.hw3collections.task5;

import java.util.*;

/*
Создайте List<Integer> с повторяющимися числами, например:
List<Integer> numbers = Arrays.asList(5, 3, 5, 2, 7, 3, 8, 2);
Преобразуйте его в HashSet, чтобы убрать дубликаты, и выведите результат.,
Скопируйте уникальные числа в TreeSet для автоматической сортировки, выведите результат.,
Напишите метод findCommonElements(Set<Integer> set1, Set<Integer> set2), который возвращает общие элементы двух множеств.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 5, 2, 7, 3, 8, 2);
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);

        TreeSet<Integer> sortedUniqueNumbers = new TreeSet<>(uniqueNumbers);
        System.out.println(sortedUniqueNumbers);
    }

    public static Set<Integer> findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        return commonElements;
    }
}
