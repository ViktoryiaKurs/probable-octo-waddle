import java.util.ArrayList;
import java.util.Random;

public class Arraylistcollection {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int size =10;
        for (int i = 0; i <size; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("Initial list: "+numbers);
        maxmin(numbers);
        arithmeticaverage(numbers);}

    public static void maxmin(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("The list is empty!");
            return;

        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        System.out.println("The minimum element of the list: " + min + "\n" +
                "The maximum element of the list: " + max);
    }

    public static void arithmeticaverage (ArrayList<Integer>numbers){
        int sumnum=0;
        for (int number : numbers) {
            sumnum += number;
        }
        System.out.println("The arithmetic mean of the numbers: "+(sumnum / numbers.size()));


    }

}




