import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Word, Integer> hashMapWords = new HashMap<>();
        Word userInput = new Word();
        Scanner sc = new Scanner(System.in);
        userInput.setObj(sc.nextLine());
        userInput.textToWordsMap(hashMapWords);
        userInput.getFiveMaxNodes(hashMapWords);
    }
}