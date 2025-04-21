package homework.hw3collections.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


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

    public static void main(String[] args) {
        ActionTrackerApp app = new ActionTrackerApp();
        app.start();
    }

    void start(){
        String input;
        do{
            input = scan.nextLine();

            if (input.startsWith("add")){

            }

        } while (!input.equals("exit"));
    }

    void printGreetings() {
        System.out.println("""
                Welcome to action tracker app!
                The whole purpose of this small program is to show off the history preserving functionality using LinkedList
                """);
    }

    void printListOfCommands() {
        System.out.println("""
                List of commands:
                add <text> - add some text to existing list
                undo - remove the last string you added
                redo - add back last string you removed with "undo"
                print - show the current list of strings
                hist - show the last 5 actions you did
                hist all - shows the full history of your actions
                help - show list of commands
                exit - exit the program
                """);
    }


}
