import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ArrayListOperations {
    List<Integer> userListOfNumbers = new ArrayList<>(10);

    public void fillListOfNum(){
        Random random = new Random();
        for (int i = 0; i <= 9; i++) {
            userListOfNumbers.add(random.nextInt(100) + 1);
        }
        System.out.println("Исходный список: " + userListOfNumbers);
    }
    Comparator<Integer> c;
    public void getMax(){
        System.out.print("Максимум: " + Collections.max(userListOfNumbers));
    }

    public void getMin(){
        System.out.print("Минимум: " + Collections.min(userListOfNumbers));
    }

    public void arithmetiMean(){
        Integer sum = 0;
        for (Integer element : userListOfNumbers){
            sum = sum + element;
        }
        System.out.println("Среднее: " + sum / 10); // 10 - the capacity of the list
    }

    public void deleteEvenNumbersOfTheList(){
        Iterator<Integer> iterator = userListOfNumbers.iterator();
        while (iterator.hasNext()){
            Integer currentElementOfList = iterator.next();
            if (currentElementOfList % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("Список после удаления четных: " + userListOfNumbers);
    }

    public void sort(){
        Collections.sort(userListOfNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1 > num2){
                    return -1;
                }
                else if (num2 > num1){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        });
        System.out.println("Отсортированный список: " + userListOfNumbers);
    }
}
