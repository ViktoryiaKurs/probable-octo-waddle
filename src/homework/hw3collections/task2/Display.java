package homework.hw3collections.task2;

public class Display {
    public static void printGreetings() {
        System.out.println("""
                Welcome to action tracker app!
                The whole purpose of this small program is to show off the history preserving functionality using LinkedList
                """);
    }

    public static void printListOfCommands() {
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
