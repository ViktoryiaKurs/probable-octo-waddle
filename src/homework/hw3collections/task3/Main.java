package homework.hw3collections.task3;

import java.util.HashMap;

/*
Напишите программу, которая анализирует текст и выводит статистику по словам:
- Создайте класс Word, хранящий единственную переменную типа String, переопределите его equals и hashcode.
- Создайте HashMap<Word, Integer>, где ключ — слово, а значение — количество его повторений.
- Разбейте текст на слова (игнорируйте регистр и знаки препинания).
- Заполните HashMap и выведите топ-5 самых часто встречающихся слов.
 */

public class Main {
    public static void main(String[] args) {
        String text = "A long long time ago, far far far away";
        trackWords(text);
    }

    public static void trackWords(String text) {
        HashMap<Word, Integer> wordTracker = new HashMap<>();
        Word[] words = separateTextIntoWords(text);

        for (Word word : words) {
            wordTracker.put(word, wordTracker.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordTracker);
    }

    public static Word[] separateTextIntoWords(String text) {

        text = text.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] strWords = text.split(" ");
        Word[] words = new Word[strWords.length];
        for (int i = 0; i < words.length; i++) {
            words[i] = new Word(strWords[i]);
        }
        return words;
    }

}
