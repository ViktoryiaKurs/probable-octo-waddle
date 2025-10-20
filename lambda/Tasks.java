package gpt.hometaskk;
//Сумма двух целых чисел с использованием лямбда-выражения
//
//Напиши Java программу для реализации лямбда-выражения, которое находит сумму двух целых чисел.
//
//Проверка пустоты строки с использованием лямбды
//
//Напиши Java программу для реализации лямбда-выражения, которое проверяет, является ли заданная строка пустой.
//
//Преобразование строк в верхний/нижний регистр с использованием лямбды
//
//Напиши Java программу для реализации лямбда-выражения, которое преобразует список строк в верхний и нижний регистр.
public class Tasks {
    public static void main(String[] args) {
        SumTwoInt sum = (a, b) -> a + b;
        System.out.println(sum.sum(10, 3));
        IsEmptyString string = (s) -> s.isEmpty();
        System.out.println(string.isEmptyString(""));
        UpperLowerCase upperLowerCase = (s, upperCase) -> {
            if (upperCase) return s.toUpperCase();
            return s.toLowerCase();
        };
        String str = new String("Hello World");
        System.out.println(upperLowerCase.someCase(str, true));
        System.out.println(upperLowerCase.someCase(str, false));
    }
}
