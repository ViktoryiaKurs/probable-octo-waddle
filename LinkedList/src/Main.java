import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String command;
        List<String> inputText = new ArrayList<>();
        LinkedListOptions linkList = new LinkedListOptions();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            command = sc.nextLine();
            if (command == null || (command.length() == 0)) {
                System.out.println("Вы ничего не ввели, введите еще раз");
                continue;
            }
            inputText = List.of(command.split(" "));
            switch (inputText.getFirst()) {
                case "add":
                    linkList.add(inputText.get(1));
                    break;
                case "undo":
                    linkList.undo();
                    break;
                case "redo":
                    linkList.redo();
                    break;
                case "print":
                    linkList.print();
                    break;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }
}