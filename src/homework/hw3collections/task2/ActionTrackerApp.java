package homework.hw3collections.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static homework.hw3collections.task2.Display.*;

/*
Реализуйте программу, которая:
1. Создает LinkedList строк (например: "A", "B", "C", "D").
2. Симулирует работу простого "истории действий" (undo/redo):
Пользователь вводит команды: add <строка>, undo, redo, print.
add — добавляет строку в конец списка и запоминает действие.
undo — отменяет последнее добавление (удаляет последний элемент).
redo — повторно добавляет последнюю отмененную строку (если она есть).
print — выводит текущее состояние списка.
3. Дополнительно: Ограничьте размер истории (например, последние 5 действий).
 */
public class ActionTrackerApp {
    private final LinkedList<String> strings = new LinkedList<>(List.of("A", "B", "C"));
    private final LinkedList<String> history = new LinkedList<>();
    private String lastAdded;
    private String lastRemoved;
    Scanner scan = new Scanner(System.in);

    void start() {
        String input;

        printGreetings();
        printListOfCommands();

        do {
            input = scan.nextLine();
            String[] commandAndInput = input.split(" ", 2);

            switch (commandAndInput[0]) {
                case "add":
                    if (commandAndInput.length == 1) {
                        System.out.println("You should write text you want to add after the command");
                    } else {
                        strings.add(commandAndInput[1]);
                        lastAdded = commandAndInput[1];
                        history.add(input);
                    }
                    break;
                case "undo":
                    strings.remove(lastAdded);
                    lastRemoved = lastAdded;
                    history.add(input);
                    break;
                case "redo":
                    strings.add(lastRemoved);
                    history.add(input);
                    break;
                case "print":
                    strings.forEach(System.out::println);
                    history.add(input);
                    break;
                case "hist":
                    if (commandAndInput.length > 1) {
                        if (commandAndInput[1].equals("all")) {
                            printHistory(0);
                            history.add(input);
                        } else {
                            System.out.println("No such command");
                        }
                    } else {
                        int startIndex = Math.max(0, history.size() - 5);
                        printHistory(startIndex);
                        history.add(input);
                    }
                    break;
                case "help":
                    printListOfCommands();
                    history.add(input);
                    break;
                case "exit":
                    input = "exit";
                    System.out.println("See you next time");
                    break;
                default:
                    System.out.println("No such command");
                    break;
            }

        } while (!input.equals("exit"));
    }

    private void printHistory(int startIndex){
        for (; startIndex < history.size(); startIndex++) {
            System.out.println(startIndex+1 + ". " + history.get(startIndex));
        }
    }
}
