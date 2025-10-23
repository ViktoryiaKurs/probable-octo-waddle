import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 3, 5, 2, 7, 3, 8, 2);
        List<Integer> numbers2 = Arrays.asList(8, 2, 51, 2, 3, 18, 2);
        System.out.println(numbers);
        Set<Integer> hashSetNumbers = new HashSet<>(numbers);
        Set<Integer> hashSetNumbers2 = new HashSet<>(numbers2);
        System.out.println(hashSetNumbers);
        Set<Integer> treeSetNumbers = new TreeSet<>(hashSetNumbers);
        System.out.println(treeSetNumbers);
        Main.findCommonElements(hashSetNumbers, hashSetNumbers2);
    }

    public static void findCommonElements(Set<Integer> set1, Set<Integer> set2) {
        if (set1.isEmpty() && set2.isEmpty()){
            System.out.println("Оба множества пусты и включают сами себя");
        }
        else if (set1.isEmpty() || set2.isEmpty()) {
            System.out.println("Общих элементов нет");
        } else {
            for (Integer elementSet1 : set1){
                for (Integer elementSet2 : set2){
                    if (elementSet1 == elementSet2){
                        System.out.print(elementSet1 + " ");
                    }
                }
            }
        }
    }
}