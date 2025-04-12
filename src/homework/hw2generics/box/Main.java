package homework.hw2generics.box;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Box<String> wordBox = new Box<>();

        System.out.println(wordBox.isEmpty()); // true
        wordBox.putItem("Hippopotomonstrosesquipedaliophobia");
        System.out.println(wordBox.getItem());
        System.out.println(wordBox.isEmpty()); // false

        System.out.println("-----------------------------");

        Box<Random> randomBox = new Box<>();
        randomBox.putItem(new Random());
        System.out.println(randomBox.getItem().nextDouble());
        System.out.println(randomBox.getItem().nextGaussian());

        System.out.println("-----------------------------");

        System.out.println("same type check: String vs Random = " + wordBox.isSameType(randomBox));

        System.out.println("-----------------------------");

        Box<Box<Box<String>>> boxInBoxInBox = new Box<>(new Box<>(new Box<>("I am not suicidal")));
        System.out.println(boxInBoxInBox.getItem().getItem().getItem());

        System.out.println("-----------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        Box<Integer> intBox = Box.fromArray(nums);
        System.out.println(intBox.getItem());
    }
}
